package com.yiyun.application.common.util;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileModify {

    public static void main(String[] args)
    {
        build();
    }
    private static String dev_insiis6= "123";
    private static String rel_insiis6="789";
    private static String rul="D:/enPu/insigma/qctb/inscloud/resources/config/remote/spring-dubbo.xml"; // fileName 文件路径地址


    private static void build() {
        modifyFileContent(rul,
                "<dubbo:protocol host=\"" + dev_insiis6 + "\" port=\"20882\"/>",
                "<dubbo:protocol host=\"" + rel_insiis6 + "\" port=\"20882\"/>   ");
          }

    private static boolean modifyFileContent(String fileName, String oldstr, String newStr) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(fileName, "rw");
            String line = null;
            long lastPoint = 0; // 记住上一次的偏移量
            while ((line = raf.readLine()) != null) {
                final long ponit = raf.getFilePointer();
                if (line.contains(oldstr)) {
                    String str = line.replace(oldstr, newStr);
                    raf.seek(lastPoint);
                    raf.writeBytes(str);
                }
                lastPoint = ponit;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                raf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

}

