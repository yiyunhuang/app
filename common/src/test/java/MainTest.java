import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @author 翼云
 * @version 1.0
 * @ClassName MainTest
 * @Description  主测试类
 * @program: application
 * @date 2019/7/17 0017 15:49
 **/
public class MainTest {

  /*  public static void main(String[] args) {
        yiyun yiyun = new yiyun();
        yiyun.test();

    }*/

    @Test
    public void yiyunTest(){
        yiyun yiyun= new yiyun();
        try {
            yiyun.test();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
