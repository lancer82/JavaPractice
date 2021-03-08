package com.thinlk.controller;

import com.thinlk.domain.Student;
import com.thinlk.service.StudentService;

import java.util.Scanner;

/**
 * @author Thinlk
 * @create 2021-03-02 10:01 PM
 **/
public class OtherStudentController extends BaseStudentController{

    @Override
    public Student inputStudentInfo(String id) {

        System.out.println("请输入添加的学生姓名：");
        String name = scanner.next();
        System.out.println("请输入添加的学生年龄：");
        String age = scanner.next();
        System.out.println("请输入添加的学生生日：");
        String birthday = scanner.next();

        return new Student(id, name,age,birthday);
    }
}
