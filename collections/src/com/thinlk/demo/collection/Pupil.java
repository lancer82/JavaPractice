package com.thinlk.demo.collection;

public class Pupil implements Comparable<Pupil> {

    private String name;
    private int chinese;
    private int english;
    private int math;


    public Pupil() {
    }

    public Pupil(String name, int chinese, int english, int math) {
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }


    public int getSum() {
        return chinese+english+math;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", english=" + english +
                ", math=" + math +
                ", 总分=" + getSum() +
                '}';
    }



    @Override
    public int compareTo(Pupil o) {
        int result = this.getSum() -o.getSum();
        result = result == 0 ? this.getChinese() - o.getChinese() : result;
        result = result == 0 ? this.getEnglish() - o.getEnglish() : result;
        result = result == 0 ? this.getMath() - o.getMath() : result;
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;

        return result;
    }
}
