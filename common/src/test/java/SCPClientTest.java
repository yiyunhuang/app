/**
 * @author 翼云
 * @version 1.0
 * @ClassName SCPClientTest
 * @Description  ssh下载测试类
 * @program: application
 * @date 2019/5/23 11:33
 **/
public class SCPClientTest {

    public static void main(String[] args) {
        SCPClientTest t = new SCPClientTest();
        t.test1();

    }

    public void test1(){
        SCPClientImpl scpc = new SCPClientImpl();
        String dataServerIp  = "XXX"; //数据服务器的ip地址
        int     port          =  27300 ;//端口
        String dataServerUsername  = "root";//数据服务器的用户名
        String dataServerPassword = "dmuoZSRo0AG1"; //数据服务器的密码
//        String dataServerDestDir = "/home/weblogic/user_projects/domains/siwebapp/servers/WXFWAppSrv1/logs/WXFWAppSrv1.out"; //数据服务器的目的文件夹
        String dataServerDestDir = "/root/java/apache-tomcat-8.5.23/solo.log"; //数据服务器的目的文件夹
        String localDir = "E://IdeaProjects";//从远程到本地的保存路径
        scpc.appendMethodDownload( dataServerIp ,  port,dataServerUsername , dataServerPassword , dataServerDestDir , localDir ) ;


    }

    public void test2(){
        SCPClientImpl scpc = new SCPClientImpl();
        String dataServerIp  = "XXX"; //数据服务器的ip地址
        int     port          =  27300 ;//端口
        String dataServerUsername  = "root";//数据服务器的用户名
        String dataServerPassword = "dmuoZSRo0AG1"; //数据服务器的密码
        String dataServerDestDir = "/root/java/apache-tomcat-8.5.23/work"; //数据服务器的目的文件夹
        String localDir = "E://IdeaProjects//solo.log";//从远程到本地的保存路径
        scpc.appendMethodUpload( dataServerIp ,  port,dataServerUsername , dataServerPassword , dataServerDestDir , localDir ) ;


    }

}
