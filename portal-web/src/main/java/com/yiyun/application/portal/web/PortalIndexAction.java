package com.yiyun.application.portal.web;


import com.yiyun.application.common.util.PropKit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * User: DHC
 * Date: 2017/11/20
 * Time: 15:18
 * Version:V1.0
 */
@Controller
public class PortalIndexAction {


    @RequestMapping("/")
    public String portalIndex(Model model){
        //第一步：使用service去查，根据tb_content_category的ID去查
//        Long id = PropKit.use("ftp.properties").getLong("ftp.gallery");
//        List<TbContent> list = contentService.listContentsByCid(id);
        //第二步：存放到model中
//        model.addAttribute("ad1List", "123");
        //第三步：返回首页
        return "index";
    }



}
