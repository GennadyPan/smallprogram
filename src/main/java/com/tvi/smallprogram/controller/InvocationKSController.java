package com.tvi.smallprogram.controller;

import com.tvi.smallprogram.common.HttpClintUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/***
 * 调用快手接口
 * @author Administrator
 * @date 2020-02-10
 */
@RestController
public class InvocationKSController {
    @RequestMapping("info")
    public String info() {
        /*String name="";
        String url = "https://blog.csdn.net/xyjcfucdi128/article/details/83860853";
        String result=null;
        try{
            result= HttpClintUtil.postRequest(url, new HashMap<String,Object>());
        }catch (Exception e){e.printStackTrace();}
        System.out.println(result+"====asdasdas=====");*/
        return "Hello world!";
    }

    /***
     * 跳到上传页面
     * @return
     */
    @RequestMapping("updatePage")
    public ModelAndView updatePage(){
        return new ModelAndView("updatePage.html");
    }
}
