package com.thinlk.controller;

import com.thinlk.domain.Student;
import com.thinlk.service.StudentService;

import java.util.Scanner;

/**
 * @author Thinlk
 * @create 2021-03-02 10:01 PM
 **/
public class StudentController {

    private Scanner scanner = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    public void start() {
        studentLoop:
        while (true) {
            System.out.println("‐‐‐‐‐‐‐‐欢迎来到 <学生> 管理系统‐‐‐‐‐‐‐‐");
            System.out.println("请输入您的选择: 1.添加学生 2.删除学生 3.修改学生 4.查看学生 5.退出");
            String chioce = scanner.next();
            switch (chioce) {
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
        Student[] students = studentService.findAllStudents();
        if (students == null) {
            System.out.println("查询无数据，请输入学生信息");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < students.length; i++) {
            Student stu = students[i];
            if (stu != null){
                System.out.println(stu.getId() + "\t\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }
    }

    private void updateStudent() {
        String updateId = inputSutdentId();
        Student newStu = inputStudentInfo(updateId);
        studentService.updateStudentById(updateId,newStu);
        System.out.println("修改成功");
    }

    private void deleteStudent() {
        String delId = inputSutdentId();
        studentService.deleteStudentById(delId);
        System.out.println("删除成功");

    }

    private void addStudent() {
        String id;
        while (true) {
            System.out.println("请输入添加的学生ID：");
            id = scanner.next();
            boolean isExists = studentService.isExist(id);
            if (isExists) {
                System.out.println("学生id已存在，请重新输入");
            } else break;
        }

        Student student = inputStudentInfo(id);

        boolean result = studentService.addStudent(student);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }


    public String inputSutdentId() {
        String id;
        while (true) {
            System.out.println("请输入要操作的学生id:");
            id = scanner.next();
            boolean isExists = studentService.isExist(id);
            if (!isExists) {
                System.out.println("学生id不存在，请重新输入！");
            } else {
                break;
            }
        }
        return id;
    }

    public Student inputStudentInfo(String id) {

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
        return student;
    }
}
