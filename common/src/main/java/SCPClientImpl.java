import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.SCPClient;

import java.io.IOException;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName SCPClientImpl
 * @Description 利用SSH上传与下载实现类
 * @date 2019/5/22 17:11
 **/

public class SCPClientImpl {


    /*
 * @Author 翼云
 * @Description  利用SSH下载实现方法
 * @Date  2019/5/22 17:43
 * @Param [dataServerIp 数据服务器的ip地址 ,port 端口 , dataServerUsername 数据服务器的用户名 ,dataServerPassword 数据服务器的密码, dataServerDestDir 数据服务器的目的文件夹 , localDir 从远程到本地的保存路径 ]
 * @return void
**/
    public void appendMethodDownload(String dataServerIp, int port  , String dataServerUsername  , String dataServerPassword , String dataServerDestDir , String localDir ) {
        Connection conn = new Connection(dataServerIp,port);
        System.out.println("开始scp文件");
        try {
            conn.connect();
            boolean isAuthenticated = conn.authenticateWithPassword(dataServerUsername, dataServerPassword);
            if (isAuthenticated == false)
                throw new IOException("Authentication failed.文件scp到数据服务器时发生异常");
            SCPClient client = new SCPClient(conn);
//            client.put("D:\\00审计.zip", dataServerDestDir); //本地文件scp到远程目录
            client.get(dataServerDestDir  , localDir);//远程的文件scp到本地目录
            conn.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件scp到数据服务器时发生异常");
        }
        System.out.println("scp文件结束");


    }

    /*
     * @Author 翼云
     * @Description   利用SSH上传实现方法
     * @Date  2019/5/23 12:57
     * @Param [dataServerIp 数据服务器的ip地址 ,port 端口 , dataServerUsername 数据服务器的用户名 ,dataServerPassword 数据服务器的密码, dataServerDestDir 数据服务器的目的文件夹 , localDir 从远程到本地的保存路径 ]
     * @return void
    **/
    public void appendMethodUpload(String dataServerIp, int port  , String dataServerUsername  , String dataServerPassword , String dataServerDestDir , String localDir ) {

        //        ch.ethz.ganymed


        Connection conn = new Connection(dataServerIp,port);
        System.out.println("开始scp文件");
        try {
            conn.connect();
            boolean isAuthenticated = conn.authenticateWithPassword(dataServerUsername, dataServerPassword);
            if (isAuthenticated == false)
                throw new IOException("Authentication failed.文件scp到数据服务器时发生异常");
            SCPClient client = new SCPClient(conn);
            client.put(localDir, dataServerDestDir); //本地文件scp到远程目录
            conn.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件scp到数据服务器时发生异常");
        }
        System.out.println("scp文件结束");


    }

}