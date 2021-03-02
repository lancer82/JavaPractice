package com.thinlk.domain;

/**
 * @author Thinlk
 * @create 2021-03-01 9:58 PM
 **/
public class Teacher extends Person {

    private String subject;

    public Teacher(String id, String name, int age, String birthday, String subject) {
        super(id, name, age, birthday);
        this.subject = subject;
    }
}
