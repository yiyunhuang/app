package com.yiyun.application.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName yiyun
 * @Description   公共参数设置
 * @program: application
 * @date 2019/7/16 0016 11:36
 **/
public class yiyun {
    /**
    * SUCCESS 为成功的返回参数
    * FAILD 为失败的返回参数
    * encoding 编码方式
    *
    **/
    public static final int SUCCESS = 1 ;
    public static final int FAILD = 0 ;
    public static String encoding = System.getProperty("file.encoding", "UTF-8");
    public static String Separate="------";
    public static SnowflakeIdWorker idWorker;

    /**
     * @Author 翼云
     * @Description // Base64 编码
     * @Date  2019/7/16 0016 14:31
     * @Param [str] 需要编码的字符串
     * @return java.lang.String
    **/
    public static String encodeBase64(String encodeStr){
        if (encodeStr != null && (!encodeStr.startsWith("@_") || !encodeStr.endsWith("_@"))) {
            byte[] bytes = encodeStr.getBytes(Charset.forName(encoding));
            encodeStr = "@_"+java.util.Base64.getEncoder().encodeToString(bytes)+"_@";
        }
           return encodeStr;
    }
    /**
     * @Author 翼云
     * @Description // Base64 解码
     * @Date  2019/7/16 0016 14:31
     * @Param [str] 需要解码的字符串
     * @return java.lang.String
    **/
    public  static String decodeBase64(String decodeStr){
        if (decodeStr != null && decodeStr.startsWith("@_") && decodeStr.endsWith("_@")) {
            byte[] bytes = java.util.Base64.getDecoder().decode(decodeStr.substring(2, decodeStr.length() - 2));
            decodeStr= new String(bytes, Charset.forName(encoding));
        }
        return decodeStr;
    }
/**
 * @Author 翼云
 * @Description // 字符串切割方法
 * @Date  2019/7/17 0017 19:27
 * @Param [splitStr 被切割的字符串, split1 切割符 某些符合需要转意 比如 * 要写成\\*]
 * @return java.lang.String[]
**/
    public static String[] splitStr(String splitStr , String split1){
        String[] split = splitStr.split(split1);
        return split;
    }
    /**
     * @Author 翼云
     * @Description // json 解析方法类
     * @Date  2019/7/18 0018 16:03
     * @Param [json1 需要解析的json字符串, yiyun 需要转化成的对象路径 比如 数组为 java.util.ArrayList ]
     * @return java.lang.Object 放回组装好的对象
    **/  
    public static Object JSON(String json1 , String classPath) throws IOException, ClassNotFoundException {
        Class Class1 = Class.forName(classPath);
        ObjectMapper mapper=new ObjectMapper();
        Object object=mapper.readValue(json1, Class1);
        return object;
    }
    /**
     * @Author 翼云
     * @Description // 组装json
     * @Date  2019/7/18 0018 16:08
     * @Param [object 组装的对象]
     * @return java.lang.String 组装好的json字符串
    **/
    public static String JSON(Object object) throws ClassNotFoundException, JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        //将对象转换为JSON格式字符串
        String json=mapper.writeValueAsString(object);
        return  json;
    }


    /**
     * @Author 翼云
     * @Description // 输入时间字符串和时间格式获得毫秒数
     * @Date  2019/7/19 0019 9:37
     * @Param [dateStr 时间字符串 , format 时间格式]
     * @return long 时间毫秒数
    **/
    private static long getTime(String dateStr, String format) {
        //注意format的格式要与日期String的格式相匹配 "yyyy-MM-dd HH:mm:ss"
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date= null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long time = date.getTime();
        return time;
    }

    /**
     * @Author 翼云
     * @Description // 获得当前网络ip
     * @Date  2019/7/19 0019 9:43
     * @Param []
     * @return java.util.List<java.lang.String>  当前ip数组
    **/
    private static List<String> getIp() {
        List<String> result = new ArrayList<String>();
        try {
            Enumeration<NetworkInterface> netInterfaces;
            netInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip;
            while (netInterfaces.hasMoreElements()) {
                NetworkInterface ni = netInterfaces.nextElement();
                Enumeration<InetAddress> addresses=ni.getInetAddresses();
                while(addresses.hasMoreElements()){
                    ip = addresses.nextElement();
                    if (!ip.isLoopbackAddress() && ip.getHostAddress().indexOf(':') == -1) {
                        result.add(ip.getHostAddress());
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
     * @Author 翼云
     * @Description // 获取事件id
     * @Date  2019/7/19 0019 10:33
     * @Param []
     * @return java.lang.Long 事件id
    **/
    public static Long getId() throws IllegalArgumentException,Exception {
        if(idWorker==null) {
            List<String> result1 = getIp();
            String ip;
            if (result1.size()>0){
                ip =result1.get(0);
            } else {
                throw new Exception("无法取到ip");
            }
            String replace = ip.replace(".", "");
            String substring = replace.substring(0, 4);
            int length = replace.length();
            String substring1 = replace.substring(length - 4, length);
            Long long1 = Long.valueOf(substring)%32;
            Long long2 = Long.valueOf(substring1)%32;
            idWorker = new SnowflakeIdWorker(long1, long2);
        }
        return idWorker.nextId();
    }

    /**
     * @Author 翼云
     * @Description // 依据输入的2个标识来获取事件id
     * @Date  2019/8/13 0013 19:20
     * @Param [long1 标识id1 , long2 标识id2 ]
     * @return java.lang.Long 事件id
    **/
    public static String getId(Long long1, Long long2) throws IllegalArgumentException {
        if (idWorker == null) {
            idWorker = new SnowflakeIdWorker(long1, long2);
        }
        return String.valueOf(idWorker.nextId());
    }

    /**
     * @Author 翼云
     * @Description //依据输入的字符串来进行encode编码
     * @Date  2019/8/13 0013 19:30
     * @Param [s 需要进行编码的字符串]
     * @return java.lang.String 返回编码完成后的字符串
    **/
    public static String encode(String s) throws UnsupportedEncodingException {
        String text = java.net.URLEncoder.encode(s,"utf-8");
        return text;
    }
    /**
     * @Author 翼云
     * @Description //依据输入的字符串来进行decode解码
     * @Date  2019/8/13 0013 19:30
     * @Param [s 需要解码的字符串]
     * @return java.lang.String 返回解码完成后的字符串
    **/
    public static String decode(String s) throws UnsupportedEncodingException {
        String text = java.net.URLDecoder.decode(s,"utf-8");
        return text;
    }

    public void test() throws UnsupportedEncodingException {
        /**
         * base64 编码测试
         */

        /*        String encodeStr="huangYF";
        String decodeStr = encodeBase64(encodeStr);
        System.out.println(decodeStr);
        String encodeStr1 = decodeBase64(decodeStr);
        System.out.println(encodeStr1);
        System.out.println(Separate);*/
        /**
         * 字符串切割测试
         */
       /* String[] splitStr = splitStr("huang*yi*fan", "\\*");
        for (int i=0;i<splitStr.length;i++){
            System.out.println(splitStr[i]);
        }
        System.out.println(Separate);*/
        /**
         * json解析与组装 测试
         */
       /* try {
            String json1 = "{\"id\":1,\"name\":\"JAVAEE-1703\",\"stus\":[{\"id\":101,\"name\":\"刘一\",\"age\":16}]}";
            String json2 = "[\"北京\",\"天津\",\"杭州\"]";
            //Object json = JSON(json1, "pojo.Grade");
            Object json = JSON(json2, "java.util.ArrayList");
            System.out.println(json);
            json2 = "[北京1, 天津2, 杭州3]";
            JSON(json);
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(Separate);*/
        /**
         * id的获取
         */
       /* for (int i = 0; i < 1000; i++) {
            long id = 0;
            try {
                id = getId();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(id);
        }
        System.out.println(Separate);*/

        /**
         * log4j 日记的获取
         */
       /*
       Logger logger =LoggerFactory.getLogger(this.getClass()) ;
        //    private Logger logger = LoggerFactory.getLogger(this.getClass());

        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
        System.out.println(Separate);
*/


    }


}
