package com.thinlk.controller;

import com.thinlk.domain.Student;
import com.thinlk.service.StudentService;

import java.util.Scanner;

/**
 * @author Thinlk
 * @create 2021-03-02 10:01 PM
 **/
public class StudentController {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        studentLoop:
        while(true) {
            System.out.println("‐‐‐‐‐‐‐‐欢迎来到 <学生> 管理系统‐‐‐‐‐‐‐‐");
            System.out.println("请输入您的选择: 1.添加学生 2.删除学生 3.修改学生 4.查看学生 5.退出");
            String chioce = scanner.next();
            switch(chioce){
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudent();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    findAllStudents();
                    break;
                case "5":
                    System.out.println("退出学生管理系统，再见！");
                    break studentLoop;
                default:
                    System.out.println("输入错误，请重新输入！");
            }
        }
    }

    private void findAllStudents() {
    }

    private void updateStudent() {
    }

    private void deleteStudent() {
    }

    private void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入添加的学生ID：");
        String id = scanner.next();
        System.out.println("请输入添加的学生姓名：");
        String name = scanner.next();
        System.out.println("请输入添加的学生年龄：");
        String age = scanner.next();
        System.out.println("请输入添加的学生生日：");
        String birthday = scanner.next();

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setBirthday(birthday);

        StudentService studentService = new StudentService();
        boolean result = studentService.addStudent(student);
        if(result){
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
}
