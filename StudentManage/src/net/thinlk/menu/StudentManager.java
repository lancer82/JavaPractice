package net.thinlk.menu;

import net.thinlk.util.SMUtility;

/**
 * @author Thinlk
 * @create 2021-02-19 9:33 PM
 **/
public class StudentManager {

    public void studentView() {
        boolean isFlag = true;
        while(isFlag) {
            System.out.println("\n------------------学生信息管理系统---------------------");
            System.out.println("                    1 添加学生");
            System.out.println("                    2 修改学生");
            System.out.println("                    3 删除学生");
            System.out.println("                    4 学生列表");
            System.out.println("                    5 退   出\n");
            System.out.print("             请选择(1-5)：");

            char menu = SMUtility.readMenuSelection();

            switch(menu){
                case '1':
                    System.out.println("添加学生");
                    break;
                case '2':
                    System.out.println("修改学生");
                    break;
                case '3':
                    System.out.println("修改学生");
                    break;
                case '4':
                    System.out.println("学生列表");
                    break;
                case '5':
                    System.out.print("是否确认退出（Y/N）:");
                    char isExit = SMUtility.readConfirmExit();
                    if ('Y'==isExit)
                        isFlag = false;
                    break;

            }

        }
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.studentView();
    }
}
