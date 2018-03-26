package org.suye.corejava.interview;

/**
 * Created by suye on 2017/2/15.
 */
public class StringParameter {

    String str = new String("good");

    char[] ch = {'a', 'b', 'c'};

    public static void main(String args[]) {

        StringParameter ex = new StringParameter();

        ex.change(ex.str, ex.ch);

        System.out.print(ex.str + " and ");

        System.out.print(ex.ch);
    }

    public void change(String str, char ch[]) {

        str = "test ok";

        ch[0] = 'g';

    }
}