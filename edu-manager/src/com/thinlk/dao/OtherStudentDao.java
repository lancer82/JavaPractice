package com.thinlk.dao;

import com.thinlk.domain.Student;

import java.util.ArrayList;

/**
 * @author Thinlk
 * @create 2021-03-02 10:25 PM
 **/
public class OtherStudentDao implements BaseStudentDao{

    private static ArrayList<Student> stus = new ArrayList<>();


    static{
        Student stu1 = new Student("001","张三","23","1999-11-11");
        Student stu2 = new Student("002","李四","24","1998-11-11");
        stus.add(stu1);
        stus.add(stu2);
    }


    public boolean addStudent(Student student) {
        return stus.add(student);
    }

    public Student[] findAllStudents() {
        Student[] students = new Student[stus.size()];
        for (int i = 0; i < students.length; i++) {
            students[i] = stus.get(i);
        }

        return students;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student stu=stus.get(i);
            if (stu !=null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void deleteStudentById(String id) {
        stus.remove(getIndex(id));
    }

    public void updateStudentById(String updateId, Student newStu) {
        stus.set(getIndex(updateId),newStu);
    }
}
