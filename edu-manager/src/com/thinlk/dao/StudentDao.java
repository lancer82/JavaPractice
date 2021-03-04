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

    public Student[] findAllStudents() {
        return students;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            Student stu=students[i];
            if (stu !=null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void deleteStudentById(String id) {
        int index = getIndex(id);
        students[index] = null;
    }

    public void updateStudentById(String updateId, Student newStu) {
        int index = getIndex(updateId);
        students[index] = newStu;
    }
}
