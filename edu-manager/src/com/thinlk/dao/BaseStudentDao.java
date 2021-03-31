package com.thinlk.dao;

import com.thinlk.domain.Student;

import java.util.ArrayList;

/**
 * @author Thinlk
 * @create 2021-03-02 10:25 PM
 **/
public interface BaseStudentDao {


    public boolean addStudent(Student student);

    public Student[] findAllStudents();

    public int getIndex(String id);

    public void deleteStudentById(String id);

    public void updateStudentById(String updateId, Student newStu);
}