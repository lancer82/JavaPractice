package com.kaikeba.basic.equal;

/**
 * @author Thinlk
 * @create 2021-01-05 8:59 PM
 **/
public class Man extends Person{
    private String sex;
    public Man(String name,int age,String sex) {
        super(name, age);
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || !(obj instanceof Man)) {
            return false;
        }
        Man man = (Man) obj;
        return sex.equals(man.sex);
    }

    public static void main(String[] args) {
        Person p = new Person("Tom", 39);
        Man m= new Man("Tom", 39, "male");
        System.out.println("p.equals(m):"+p.equals(m)); //使用严格模式返回false, 使用统一模式返回true
        System.out.println("m.equals(p):"+m.equals(p)); //所有模式返回false.
    }
}
