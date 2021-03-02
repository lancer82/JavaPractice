package com.thinlk.entry;

import com.thinlk.controller.StudentController;

import java.util.Scanner;

/**
 * @author Thinlk
 * @create 2021-03-01 10:32 PM
 **/
public class InfoManageEntry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("‐‐‐‐‐‐‐‐欢迎来到黑马信息管理系统‐‐‐‐‐‐‐‐");
            System.out.println("请输入您的选择: 1.学生管理 2.老师管理 3.退出");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    // System.out.println("学生管理");
                    // 开启学生管理系统
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case "2":
                    System.out.println("老师管理");
                    break;
                case "3":
                    System.out.println("感谢您的使用");
                    // 退出当前正在运行的JVM虚拟机
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误, 请重新输入");
                    break;
            }
        }
    }
}
