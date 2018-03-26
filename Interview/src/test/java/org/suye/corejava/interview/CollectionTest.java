package org.suye.corejava.interview;

import org.junit.Test;
import org.suye.corejava.entity.Person;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by suye on 2017/2/20.
 */
public class CollectionTest {
    @Test
    public void listPractice() {
        // List元素有放入顺序，元素可重复
        List<String> strList = new ArrayList<>();

        strList.add("1");
        strList.add("1");
        strList.add("2");
        strList.add("3");

        // 在某个位置插入一个元素
        strList.add(2,"4");

        // 迭代一个List
        for(int i = 0; i < strList.size(); i++){
            System.out.println("Element " + i + " in srtList is : " + strList.get(i));
        }
    }


    @Test
    public void setPractice(){
        // 元素无放入顺序，元素不可重复（注意：元素虽然无放入顺序，但是元素在set中的位置是有该元素的HashCode决定的，其位置其实是固定的,固定但无序）
        Set<String> strSet = new HashSet<>();

        strSet.add(new String("1"));
        strSet.add(new String("1"));
        strSet.add("2");
        strSet.add("3");

        int index = 0;
        for (Iterator<String> iter = strSet.iterator();iter.hasNext();){
            System.out.println("Element " + index + " in strSet is :" + iter.next());

            index++;
        }

        Set<Person> personSet = new HashSet<>();

        Person p1 = new Person();
        p1.setName("Tom");
        p1.setAge(18);
        p1.setCoat("Black");

        Person p2 = new Person();
        p2.setName("Tom");
        p2.setAge(20);
        p2.setCoat("White");

        Person p3 = new Person();
        p3.setName("Tom");
        p3.setAge(19);
        p3.setCoat("White");

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);

        // p2.setAge(18);

        for(Person p: personSet){
            System.out.println(p.getName() + " : " + p.getAge());
        }
    }

    @Test
    public void mapPractice(){
        Map<String, String> hashMap = new HashMap<String, String>();

        String s1 = "123";
        String s2 = "123";
        String s3 =  new String("123");

        // HashMap支持key为null，同样HashMap为无序的
        hashMap.put("null", "000");
        hashMap.put(s1, "123");
        hashMap.put(s2, "456");
        hashMap.put(s3, "789");

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        // LinkedHashMap为有序的（插入顺序）
        linkedHashMap.put("null", "000");
        linkedHashMap.put(s1, "123");
        linkedHashMap.put(s2, "456");
        linkedHashMap.put(s3, "789");

        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        LinkedList<String> l1 = new LinkedList<>();

        l1.add("1");
    }

}
