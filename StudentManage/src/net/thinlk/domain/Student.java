package net.thinlk.domain;

/**
 * @author Thinlk
 * @create 2021-02-19 9:24 PM
 **/
public class Student {
    private String name;
    private int age;
    private String sid;
    private String birthday;

    public Student() {
    }

    public Student(String name, int age, String sid, String birthday) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
