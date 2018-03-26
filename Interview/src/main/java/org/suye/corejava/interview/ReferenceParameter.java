package org.suye.corejava.interview;

import org.suye.corejava.entity.Person;

/**
 * Created by suye on 2017/2/15.
 */
public class ReferenceParameter {
    public static void main(String[] args){
        Person p = new Person();

        p.setName("Zhangsan");
        p.setAge(20);

        int age = 25;

        exchange(p,age);

        System.out.println(age);
        System.out.println(p);
    }



    public static void exchange(Person p,int age){
        age = 30;

        p.setName("LiSi");
        p.setAge(age);
    }
}
