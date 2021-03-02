package com.thinlk.service;

import com.thinlk.dao.StudentDao;
import com.thinlk.domain.Student;

/**
 * @author Thinlk
 * @create 2021-03-02 10:22 PM
 **/
public class StudentService {

    StudentDao studentDao = new StudentDao();

    public boolean addStudent(Student student) {
        return studentDao.addStudent(student);
    }
}
