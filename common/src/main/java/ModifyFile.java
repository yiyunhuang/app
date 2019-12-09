import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModifyFile {

    public static void read() { buildRead(); }

    public static void write() { buildWrite(); }

    public static void writeTest(String readPath , String writePath){
        try{
            File filename = new File(readPath); // 要读取以上路径的input。txt文件
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); // 建立一个输入流对象reader
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            String line = "";
            line = br.readLine();
            while (line != null) {
                line=line +"\r\n";
                AdditionalFile.appendMethodA(writePath,line);
                line = br.readLine(); // 一次读入一行数据
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    private static void buildRead() {
        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw

            /* 读入TXT文件 */
            String pathname = "/Users/huangyifan/IdeaProjects/output.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
            File filename = new File(pathname); // 要读取以上路径的input。txt文件
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filename)); // 建立一个输入流对象reader
            BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            String line = "";
            line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine(); // 一次读入一行数据


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void buildWrite() {
        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw
            String pathname = "/Users/huangyifan/IdeaProjects/output.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径

            /* 写入Txt文件 */
            File writename = new File(pathname); // 相对路径，如果没有则要建立一个新的output。txt文件
            writename.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = sdf.format(new Date());
            out.write( time+" hello world !\r\n"); // \r\n即为换行
            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

