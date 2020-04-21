package com.yiyun.application.common.util;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AdditionalFile {

    private static String fileName="/Users/huangyifan/IdeaProjects/output.txt";

    public static void main(String[] args)
    {
        String content = "new append!";
        // 按方法A追加文件
        appendMethodA(fileName, content);
        appendMethodA(fileName, "append end.A\n");

        // 按方法B追加文件
        appendMethodB(fileName, content);
        appendMethodB(fileName, "append end.B\n");

        // 按方法C追加文件
        appendMethodC(fileName, content);
        appendMethodC(fileName, "append end.C\n");
        /*

     * 打开文件"output.txt"可以看到


new append!append end.
new append!append end.
new append!append end.

     */
    }

    /** A方法追加文件：使用RandomAccessFile */
    public static void appendMethodA(String fileName, String content) {
        try {
// 打开一个随机访问文件流，按读写方式
            RandomAccessFile randomFile = new RandomAccessFile(fileName,"rw");
// 文件长度，字节数
            long fileLength = randomFile.length();
// 将写文件指针移到文件尾。
            randomFile.seek(fileLength);
            randomFile.writeBytes(content);
            randomFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendMethodB(String fileName, String content) {
        try {
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendMethodC(String fileName, String content) {
        try {
            FileOutputStream fStream = new FileOutputStream(fileName, true);
            fStream.write(content.getBytes());
            fStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}