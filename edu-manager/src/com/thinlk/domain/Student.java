package com.thinlk.domain;

/**
 * @author Thinlk
 * @create 2021-03-01 9:57 PM
 **/
public class Student extends Person{

    private char gender;

    public Student() {

    }

    public Student(String id, String name,String age ,String birthday,char gender) {
        super(id,name,age,birthday);
        this.gender= gender;
    }



    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
