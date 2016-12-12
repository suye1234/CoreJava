package org.suye.javacore.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.suye.javacore.domain.Group;
import org.suye.javacore.domain.Person;
import org.suye.javacore.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class FastJsonTest {

    @Test
    public void testParseJsonStringToJsonObject() {
        String jsonString = "{\"identifyId\":310105,\"male\":true,\"name\":\"suye\",\"skills\":{\"Java\":\"Master\",\"Scrum\":\"Good\",\"Spring\":\"Good\",\"JSF\":\"Good\"}}";

        JSONObject person = JSON.parseObject(jsonString);
        Assert.assertEquals(310105, person.get("identifyId"));
        Assert.assertEquals(true, person.get("male"));
        Assert.assertEquals("suye", person.get("name"));

        JSONObject skill = (JSONObject) person.get("skills");
        Assert.assertEquals("Master", skill.get("Java"));
        Assert.assertEquals("Good", skill.get("Scrum"));
    }


    @Test
    public void testParseJsonStringToJsonArray() {
        String jsonArrayString = "[{\"identifyId\":310105,\"male\":true,\"name\":\"SuYe\",\"skills\":{\"Java\":\"Master\",\"Scrum\":\"Good\",\"Spring\":\"Good\",\"JSF\":\"Good\"}}]";

        JSONArray personArray = JSON.parseArray(jsonArrayString);

        JSONObject person = (JSONObject) personArray.get(0);

        Assert.assertEquals(310105, person.get("identifyId"));
        Assert.assertEquals(true, person.get("male"));
        Assert.assertEquals("SuYe", person.get("name"));

        JSONObject skill = (JSONObject) person.get("skills");
        Assert.assertEquals("Master", skill.get("Java"));
        Assert.assertEquals("Good", skill.get("JSF"));
    }

    @Test
    public void testParseJsonString() {
        String jsonString = "{\"identifyId\":310105,\"male\":true,\"name\":\"SuYe\",\"skills\":{\"Java\":\"Master\",\"Scrum\":\"Good\",\"Spring\":\"Good\",\"JSF\":\"Good\"}}";
        String jsonArrayString = "[{\"identifyId\":310105,\"male\":true,\"name\":\"SuYe\",\"skills\":{\"Java\":\"Master\",\"Scrum\":\"Good\",\"Spring\":\"Good\",\"JSF\":\"Good\"}}]";

        JSONObject person = (JSONObject) JSON.parse(jsonString);

        Assert.assertEquals(310105, person.get("identifyId"));
        Assert.assertEquals(true, person.get("male"));
        Assert.assertEquals("SuYe", person.get("name"));

        JSONObject skill = (JSONObject) person.get("skills");
        Assert.assertEquals("Master", skill.get("Java"));
        Assert.assertEquals("Good", skill.get("Scrum"));

        JSONArray personArray = (JSONArray) JSON.parse(jsonArrayString);

        person = (JSONObject) personArray.get(0);

        Assert.assertEquals(310105, person.get("identifyId"));
        Assert.assertEquals(true, person.get("male"));
        Assert.assertEquals("SuYe", person.get("name"));

        skill = (JSONObject) person.get("skills");
        Assert.assertEquals("Master", skill.get("Java"));
        Assert.assertEquals("Good", skill.get("JSF"));
    }

    @Test
    public void testParseJsonStringToObject() {
        String jsonString = "{\"identifyId\":310105,\"male\":true,\"name\":\"SuYe\",\"skills\":{\"Java\":\"Master\",\"Scrum\":\"Good\",\"Spring\":\"Good\",\"JSF\":\"Good\"}}";

        Person person = JSON.parseObject(jsonString, Person.class);

        Assert.assertEquals(new Long(310105), person.getIdentifyId());
        Assert.assertEquals(true, person.isMale());
        Assert.assertEquals("SuYe", person.getName());

        Map<String, String> skill = person.getSkills();
        Assert.assertEquals("Master", skill.get("Java"));
        Assert.assertEquals("Good", skill.get("JSF"));
    }

    @Test
    public void testParseJsonStringToList() {
        String jsonString = "[{\"identifyId\":310105,\"male\":true,\"name\":\"SuYe\",\"skills\":{\"Java\":\"Master\",\"Scrum\":\"Good\",\"Spring\":\"Good\",\"JSF\":\"Good\"}},{\"identifyId\":310110,\"male\":false,\"name\":\"YuTong\",\"skills\":{\"Eat\":\"Good\",\"Run\":\"Master\",\"Sleep\":\"Good\",\"Play\":\"General\"}}]";

        List<Person> personList = JSON.parseArray(jsonString, Person.class);

        Person suye = personList.get(0);
        Person yutong = personList.get(1);

        Assert.assertEquals(new Long(310105), suye.getIdentifyId());
        Assert.assertEquals(true, suye.isMale());
        Assert.assertEquals("SuYe", suye.getName());

        Map<String, String> skill = suye.getSkills();
        Assert.assertEquals("Master", skill.get("Java"));
        Assert.assertEquals("Good", skill.get("JSF"));


        Assert.assertEquals(new Long(310110), yutong.getIdentifyId());
        Assert.assertEquals(false, yutong.isMale());
        Assert.assertEquals("YuTong", yutong.getName());

        skill = yutong.getSkills();
        Assert.assertEquals("Good", skill.get("Eat"));
        Assert.assertEquals("Master", skill.get("Run"));

    }

    @Test
    public void testObjectToJsonString() {
        Person suye = new Person();

        suye.setName("suye");
        suye.setIdentifyId(310105L);
        suye.setMale(true);

        Map<String, String> skills = new HashMap<String, String>();
        skills.put("Java", "Master");
        skills.put("Scrum", "Good");
        skills.put("Spring", "Good");
        skills.put("JSF", "Good");

        suye.setSkills(skills);

        Assert.assertEquals("{\"identifyId\":310105,\"male\":true,\"name\":\"suye\",\"skills\":{\"Java\":\"Master\",\"Scrum\":\"Good\",\"Spring\":\"Good\",\"JSF\":\"Good\"}}", JSON.toJSONString(suye));

    }


    @Test
    public void testObjectToJsonStringWithFormat() {
        Person suye = createPerson();

        String jsonString = JSON.toJSONString(suye, true);
        System.out.print(jsonString);

        Assert.assertNotNull(jsonString);
    }

    @Test
    public void testObjectToJsonObject() {
        Person suye = createPerson();

        JSONObject person = (JSONObject) JSON.toJSON(suye);

        Assert.assertEquals(new Long(310105), person.get("identifyId"));
        Assert.assertEquals(true, person.get("male"));
        Assert.assertEquals("SuYe", person.get("name"));

        JSONObject skill = (JSONObject) person.get("skills");
        Assert.assertEquals("Master", skill.get("Java"));
        Assert.assertEquals("Good", skill.get("JSF"));
    }

    private Person createPerson() {
        Person suye = new Person();

        suye.setName("SuYe");
        suye.setIdentifyId(310105L);
        suye.setMale(true);

        Map<String, String> skills = new HashMap<String, String>();
        skills.put("Java", "Master");
        skills.put("Scrum", "Good");
        skills.put("Spring", "Good");
        skills.put("JSF", "Good");

        suye.setSkills(skills);

        return suye;
    }


    @Test
    public void testObjectToJsonString2() {
        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        group.getUsers().add(guestUser);
        group.getUsers().add(rootUser);

        String jsonString = JSON.toJSONString(group);

        System.out.println(jsonString);

        Assert.assertNotNull(jsonString);
    }

    @Test
    public void testJsonStringToObject() {
        String jsonString = "{\"id\":0,\"name\":\"admin\",\"users\":[{\"id\":2,\"name\":\"guest\"},{\"id\":3,\"name\":\"root\"}]}";

        Group group = JSON.parseObject(jsonString, Group.class);

        Assert.assertEquals(new Long(0L), group.getId());
        Assert.assertEquals("admin", group.getName());

        List<User> users = group.getUsers();
        User user1 = users.get(0);

        Assert.assertEquals(new Long(2), user1.getId());
        Assert.assertEquals("guest", user1.getName());

        User user2 = users.get(1);


        Assert.assertEquals(new Long(3), user2.getId());
        Assert.assertEquals("root", user2.getName());
    }


}
