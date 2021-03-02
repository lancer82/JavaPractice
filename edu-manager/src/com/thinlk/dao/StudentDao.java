package com.thinlk.dao;

import com.thinlk.domain.Student;

/**
 * @author Thinlk
 * @create 2021-03-02 10:25 PM
 **/
public class StudentDao {

    private Student[] students = new Student[5];

    public boolean addStudent(Student student) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null){
                index = i ;
                break;
            }
        }
        if(index==-1) {
            System.out.println("内存已满");
            return false;
        }else{
            students[index] = student;
            return true;
        }
    }
}
