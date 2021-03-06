package com.thinlk.dao;

import com.thinlk.domain.Teacher;

public class TeacherDao {

    private static Teacher[] teachers = new Teacher[5];

    public boolean addTeacher(Teacher teacher) {

        int index = -1 ;
        for (int i = 0; i < teachers.length; i++) {
            Teacher t= teachers[i];
            if (t == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("内存已满，无法输入！");
            return false;
        }else {
            teachers[index] = teacher;
            return true;
        }
    }

    public Teacher[] findAllTeachers() {
        return teachers;
    }

    private int getIndex(String id){
        int index = -1;
        for (int i = 0; i < teachers.length; i++) {
            Teacher t = teachers[i];
            if (t != null && t.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void deleteTeacherById(String delId) {
        int index = getIndex(delId);
        teachers[index] = null;
    }

    public void updateTeacherById(String updateId,Teacher teacher) {
        int index = getIndex(updateId);
        teachers[index] = teacher;
    }
}
