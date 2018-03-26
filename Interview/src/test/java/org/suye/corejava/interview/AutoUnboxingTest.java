package org.suye.corejava.interview;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by suye on 2017/3/13.
 */
public class AutoUnboxingTest {

    @Test
    public void testAutoUnboxing(){
        Integer a = new Integer(3);
        Integer b = 3;                  // 将3自动装箱成Integer类型
        int c = 3;

        System.out.println(a == b);     // false 两个引用没有引用同一对象
        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较

        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println("i1 equals i2 : " +  (i1==i2));

        Integer i3 = 1024;
        Integer i4 = 1024;
        System.out.println("i3 equals i4 : " +  (i3==i4));
    }

    @Test
    public void testReadFile(){
        File file = new File("/Users/suye/shfs.log");

        FileReader fr  = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file);

            br = new BufferedReader(fr);

            System.out.println(br.readLine());
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(null != fr) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


}
