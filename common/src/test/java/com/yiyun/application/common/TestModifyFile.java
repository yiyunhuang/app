package com.yiyun.application.common;

public class TestModifyFile {
    public static void main(String[] args)
    {
        String readPath ="/Users/huangyifan/IdeaProjects/output.txt";
        String writePath = "/Users/huangyifan/IdeaProjects/output1.txt";
        ModifyFile.writeTest(readPath,writePath);

    }
}


