package org.suye.corejava.prototype.monkey;

import java.io.*;
import java.util.Date;

/**
 * 孙悟空分身.
 */
public class Monkey implements Cloneable, Serializable{
    private int height;

    private int weight;

    private Date birthday;

    private GoldRingStaff goldRingStaff;

    public Monkey() {
        this.birthday = new Date();
        goldRingStaff = new GoldRingStaff();
    }


    public  Object deepClone() throws IOException, ClassNotFoundException{
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    @Override
    protected Object clone(){
        Monkey temp = null;

        try {
            temp = (Monkey) super.clone();
        }catch (CloneNotSupportedException e){


        }finally {
            return temp;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public GoldRingStaff getGoldRingStaff() {
        return goldRingStaff;
    }

    public void setGoldRingStaff(GoldRingStaff goldRingStaff) {
        this.goldRingStaff = goldRingStaff;
    }
}
