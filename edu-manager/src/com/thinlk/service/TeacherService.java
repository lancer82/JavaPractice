package com.thinlk.service;

import com.thinlk.dao.TeacherDao;
import com.thinlk.domain.Teacher;

public class TeacherService {

    private TeacherDao teacherDao = new TeacherDao();

    public boolean addTeacher(Teacher teacher) {
        return teacherDao.addTeacher(teacher);
    }


    public boolean isExists(String id) {
        Teacher[] teachers = teacherDao.findAllTeachers();
        boolean flag = false;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null && teacher.getId().equals(id)){
                flag = true;
            }
        }
        return flag;
    }

    public Teacher[] findAllTeacher() {
        Teacher[] teachers =  teacherDao.findAllTeachers();
        boolean flag = false ;
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null ) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return teachers;
        }else {
            return null;
        }
    }

    public void deleteTeacherById(String delId) {
        teacherDao.deleteTeacherById(delId);
    }

    public void updateTeacherById(String updateId,Teacher teacher) {
        teacherDao.updateTeacherById(updateId,teacher);
    }
}
