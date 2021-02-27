package com.thinlk.java;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * @author Thinlk
 * @create 2020-08-17 16:29
 **/
public class FileReaderWriterTest {

    @Test
    public void testFileReader() {
        FileReader fr = null;
        try{
            // 1、实例化File类的对象，指明要操作的文件；
            File file = new File("helloWorld.txt");
            // 2、提供具体的流
            fr = new FileReader(file);
            // 3、数据的读入
            int data;
            while ((data = fr.read()) != -1){
                System.out.print((char) data);
            }
        }catch(IOException e) {
            e.printStackTrace();
        } finally {
            // 4、流的关闭操作
            if (fr != null) {
                try{
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /*
    测试read(char[] chaf) 的用法，返回每次读入chaf数组中的字符的个数，如果达到文件末尾则返回-1
     */
    @Test
    public void fileReaderTest1() {
        //1 实例化文件兑现
        FileReader fr = null;
        try {
            File file = new File("helloWorld.txt");
            //2、规定输入流
            fr = new FileReader(file);
            //3、读入数据
            char[] chaf = new char[5];
            int len;
            while ((len = fr.read(chaf)) != -1) {
                String str = new String(chaf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4 关闭流
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void fileWriterTest() throws IOException {
        //1 实例化写入文件对象，如果不存在则新建；
        File file = new File("hello.txt");
        //2 选择输出流
        //FileWriter fw = new FileWriter(file);
        //文件存在则可选内容覆盖（false）或者内容追加（true）
        //FileWriter fw = new FileWriter(file, true);
        FileWriter fw = new FileWriter(file, false);
        //3 写入数据
        fw.write("I have a dream!\n");
        fw.write("You need have a dream too!\n");
        //4 关闭流
        fw.close();
    }

    @Test
    public void testFileReaderFileWrite() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File srcFile = new File("hello.txt");
            File targetFile = new File("helloCope.txt");

            fr = new FileReader(srcFile);
            fw = new FileWriter(targetFile);

            char[] chuf = new char[5];
            int len;
            while((len = fr.read(chuf)) != -1) {
                fw.write(chuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr!=null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fw!=null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
