package com.thinlk.service;

import com.thinlk.dao.BaseStudentDao;
import com.thinlk.dao.OtherStudentDao;
import com.thinlk.dao.StudentDao;
import com.thinlk.domain.Student;
import com.thinlk.factory.StudentDatafactory;

import javax.print.attribute.standard.MediaSize;

/**
 * @author Thinlk
 * @create 2021-03-02 10:22 PM
 **/
public class StudentService {

    //private OtherStudentDao studentDao = new OtherStudentDao();

    private BaseStudentDao studentDao = StudentDatafactory.getStudentDao();

    public boolean addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    public boolean isExist(String id) {
        Student[] students = studentDao.findAllStudents();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            Student stu = students[i];
            if (stu != null && stu.getId().equals(id)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Student[] findAllStudents() {
        Student[] students = studentDao.findAllStudents();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            Student stu = students[i];
            if (stu != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return students;
        } else {
            return null;
        }
    }

    public void deleteStudentById(String id) {
       studentDao.deleteStudentById(id);
    }

    public void updateStudentById(String updateId, Student newStu) {
        studentDao.updateStudentById(updateId,newStu);
    }
}
