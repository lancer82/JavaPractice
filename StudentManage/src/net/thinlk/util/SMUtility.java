package net.thinlk.util;

import java.util.Scanner;

/**
 * @author Thinlk
 * @create 2021-02-19 9:49 PM
 **/
public class SMUtility {

    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection() {
        char c ;
        for (;;) {
            String str = readKayBoard(1,false);
            c= str.charAt(0);
            if('1'!=c && '2' != c && '3' != c && '4' != c && '5' != c)
                System.out.print("输入不正确，请重新输入：");
            else{
                break;
            }
        }
        return c;
    }

    public static char readConfirmExit() {
        char c ;
        for (;;){
            String str = readKayBoard(1,false).toUpperCase();
            c = str.charAt(0);
            if ('Y' == c || 'N' == c)
                break;
            else
                System.out.print("选择错误，请重新输入：");

        }
        return c;
    }

    public static String readKayBoard(int limit , boolean blankValue) {
        String line ="";
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            if(line.length()==0) {
                if (blankValue)
                    return line;
                else
                    continue;

            }

            if (line.length()> limit) {
                System.out.println("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}
