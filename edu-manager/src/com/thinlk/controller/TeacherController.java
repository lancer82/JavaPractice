package com.thinlk.controller;

import com.thinlk.domain.Teacher;
import com.thinlk.service.TeacherService;

import java.util.Scanner;

public class TeacherController {

    private Scanner scanner = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();

    public void start() {
        teacherLoop:
        while(true) {
            System.out.println("‐‐‐‐‐‐‐‐欢迎来到 <老师> 管理系统‐‐‐‐‐‐‐‐");
            System.out.println("请输入您的选择: 1.添加老师 2.删除老师 3.修改老师 4.查看老师 5.退出");
            String choice = scanner.next();
            switch(choice) {
                case "1":
                    addTeacher();
                    break;
                case "2":
                    deleteTeacher();
                    break;
                case "3":
                    updateTeacher();
                    break;
                case "4":
                    listAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢使用老师管理系统，再见！");
                    break teacherLoop;
                default:
                    System.out.println("输入错误，请重新输入！");
            }
        }
    }

    private void updateTeacher() {
        String updateId = inputTeacherId();
        Teacher newTeacher = inputTeacherInfo(updateId);
        teacherService.updateTeacherById(updateId,newTeacher);
        System.out.println("修改成功！");
    }

    private void listAllTeacher() {
        Teacher[] teachers = teacherService.findAllTeacher();
        if (teachers == null) {
            System.out.println("查无数据！");
            return;
        }

        System.out.println("工号\t\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < teachers.length; i++) {
            Teacher teacher = teachers[i];
            if (teacher != null) {
                System.out.println(teacher.getId()+"\t\t"+teacher.getName()
                        + "\t\t" + teacher.getAge()+"\t\t" +teacher.getBirthday());
            }
        }
    }

    private void deleteTeacher() {
        String delId = inputTeacherId();
        teacherService.deleteTeacherById(delId);
        System.out.println("删除成功!");
    }

    private void addTeacher() {
        String id;
        while(true) {
            System.out.println("请输入老师ID：");
            id = scanner.next();
            boolean exists = teacherService.isExists(id);
            if (exists) {
                System.out.println("老师ID已存在，请重新输入");
            }else{
                break;
            }
        }

        Teacher teacher = inputTeacherInfo(id);
        boolean isSuccess = teacherService.addTeacher(teacher);
        if (isSuccess){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    public String inputTeacherId() {
        String id ;
        while (true) {
            System.out.println("请输入操作的老师ID：");
            id = scanner.next();
            boolean exists = teacherService.isExists(id);
            if (!exists) {
                System.out.println("输入的老师ID不存在！请重新输入！");
            }else{
                break;
            }
        }
        return id;
    }

    public Teacher inputTeacherInfo(String id ) {
        System.out.println("请输入添加的老师姓名：");
        String name = scanner.next();
        System.out.println("请输入添加的老师年龄：");
        String age = scanner.next();
        System.out.println("请输入添加的老师生日：");
        String birthday = scanner.next();
        Teacher teacher =  new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setBirthday(birthday);
        return teacher;
    }
}
