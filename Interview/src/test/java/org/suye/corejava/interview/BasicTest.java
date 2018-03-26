package org.suye.corejava.interview;

import org.junit.Test;
import org.suye.corejava.entity.Person;

import java.util.*;

/**
 * Created by suye on 2017/3/3.
 */
public class BasicTest {
    @Test
    public void primitivePractice(){
        // Byte 1byte 8位带符号整数 -128到127之间的任意整数
        // 1byte = 8bit 即-128 ~ 127
        // 第一位为符号位，1代表负数，10000000为最大负数，-128，000000000为0
        byte minByte = -128;
        byte maxByte = 127;
        System.out.println(minByte + maxByte);

        // Short 2byte 16位带符号整数 -32768~32767之间的任意整数
        short minShort = -32768;
        short maxShort = 32767;
        System.out.println(minShort + maxShort);

        // Int 4byte 32位带符号整数 -2^31到2^31-1之间的任意整数
        System.out.println(Integer.MAX_VALUE);//打印最大整数:2147483647
        System.out.println(Integer.MIN_VALUE);//打印最小整数:-2147483648


        // Long 8byte 64位带符号整数 -2^63到2^63-1之间的任意整数
        System.out.println(Long.MAX_VALUE);//打印最大整数:9223372036854775807
        System.out.println(Long.MIN_VALUE);//打印最小整数:-9223372036854775808

        // 小类型到大类型java会隐式转换
        int i1 = maxByte;
        // 大类型到小类型需要强制转换（可能会丧失精度或溢出）
        short s1 = (short) i1;

        // float：2^23 = 8388608，一共七位，由于最左为1的一位省略了，这意味着最多能表示8位数： 2*8388608 = 16777216 。有8位有效数字，但绝对能保证的为7位，也即 float的精度为7~8位有效数字 ；
        float f1 = 0.99999999f;
        System.out.println(f1 == 1f);

        // double：2^52 = 4503599627370496，一共16位，同理， double的精度为16~17位
        double d1 = 0.99999999999999999;
        System.out.println(d1 == 1);

        // 之所以不能用f1==f2来判断两个数相等，是因为虽然f1和f2在可能是两个不同的数字，但是受到浮点数表示精度的限制，有可能会错误的判断两个数相等！
        float f2 = 16777215f;
        for (int i = 0; i < 10; i++) {
            System.out.println(f2);
            f2++;
        }

    }


    @Test
    public void compareTest() {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println("str1 == str2 : " +  (str1 == str2));

        String str3 =  new String("hello");
        System.out.println("str1 == str3 : " +  (str1 == str3));

        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println("i1 == i2 : " +  (i1 == i2));

        Integer i3 = 1024;
        Integer i4 = 1024;
        System.out.println("i3 == i4 : " +  (i3 == i4));

        Person p1 = new Person();
        p1.setName("Tom");
        p1.setAge(18);
        p1.setCoat("Black");

        Person p2 = new Person();
        p2.setName("Tom");
        p2.setAge(18);
        p2.setCoat("Black");

        System.out.println("p1 equals p2 : "  +  (p1.equals( p2)));

        System.out.println("p1 == p2 : "  +  (p1 == p2));

        Person p3 = new Person();
        p3.setName("Jerry");
        p3.setAge(19);
        p3.setCoat("White");

        System.out.println("p1 == p3 : "  +  (p1 == p3));

    }

    @Test
    public void equalsTest() {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println("str1 equals str2 : " +  (str1.equals(str2)));

        String str3 =  new String("hello");

        System.out.println("str1 equals str3 : " +  (str1.equals(str3)));

        Person p1 = new Person();
        p1.setName("Tom");
        p1.setAge(18);
        p1.setCoat("Black");

        Person p2 = new Person();
        p2.setName("Tom");
        p2.setAge(18);
        p1.setCoat("White");

        System.out.println("p1 equals p2 : "  +  (p1.equals(p2)));

        Person p3 = new Person();
        p2.setName("Tom");
        p2.setAge(19);
        p1.setCoat("White");

        System.out.println("p1 equals p3 : "  +  (p1.equals(p3)));
    }


    @Test
    public void shortCircuitTest(){

        if(getT1() & getT2()) System.out.println("All true");

        if(getT1() && getT2()) System.out.println("All true");

        if(getT2() | getT1()) System.out.println("One true");

        if(getT2() || getT1()) System.out.println("One true");
    }


    public boolean getT1(){
        System.out.println("Get t1");

        return false;
    }


    public boolean getT2(){
        System.out.println("Get t2");

        return true;
    }


    @Test
    public void testMap(){
        Map<String, String> mp = new HashMap<>();

        mp.put("1","1");
        mp.put("2","2");
        mp.put("3","3");
        mp.put("4","4");
        mp.put("5","5");
        mp.put("6","6");
        mp.put("7","7");
        mp.put("8","8");
        mp.put("9","9");
        mp.put("10","10");
        mp.put("11","11");
        mp.put("12","12");
        mp.put("13","13");
        mp.put("14","14");
        mp.put("15","15");
        mp.put("16","16");
        mp.put("17","17");

        System.out.println(mp);

    }

    @Test
    public void testLinkedList(){
        List<String> lt = new LinkedList<>();

        lt.add("1");

        lt.add("2");

        lt.add("3");

        System.out.println(lt);
    }
}
