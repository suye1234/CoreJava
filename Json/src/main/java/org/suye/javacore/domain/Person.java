package org.suye.javacore.domain;

import java.util.Map;

/**
 * Created by ye.su on 5/13/2016.
 */
public class Person {
    private String name;

    private Long identifyId;

    private boolean male;

    private Map<String,String> skills;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdentifyId() {
        return identifyId;
    }

    public void setIdentifyId(Long identifyId) {
        this.identifyId = identifyId;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public Map<String, String> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, String> skills) {
        this.skills = skills;
    }
}
