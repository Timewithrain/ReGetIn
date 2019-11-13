package com.watermelon.springbootdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = "classpath:application.properties",encoding = "UTF-8")
public class FirstController {

//    @Value("${com.watermelon.slogan}")
//    private String slogan;

    @Value("${com.watermelon.ranInt}")
    private int ranInt;

    @Value("${com.watermelon.ranLong}")
    private float ranLong;

    @Value("${com.watermelon.ranString}")
    private String ranString;

    //通过ConfigBean来获取配置文件中的属性
    @Autowired
    private ConfigBean cb;

    //此处通过注解的方式声明toString方法可以在服务器上通过IP:8080/tostring来访问
    @RequestMapping("/tostring")
    public String toString(){
        return "This is a controller!(by tostring)";
    }

    @RequestMapping("/slogan")
    public String getSlogan(){
        return cb.getSlogan();
    }

    @RequestMapping("/infor")
    public String getInfor(){
        return cb.getInfor();
    }

    @RequestMapping("/random")
    public String getRandom(){
        return "int: " + ranInt + "<br>Long: " + ranLong + "<br>String: " + ranString;
    }
}
