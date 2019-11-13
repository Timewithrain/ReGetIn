package com.watermelon.springbootdemo.web;

import org.springframework.boot.context.properties.ConfigurationProperties;

//当配置文件中有多条属性需要注入时，设置多个@注解较为复杂，可以设置一个ConfigBean用于绑定多个属性
@ConfigurationProperties(prefix = "com.watermelon")
public class ConfigBean {
    private String nickname;
    private String slogan;
    private int age;
    private String gender;
    private String major;
    private String infor;

    //需要有getter和setter方法才能在Controller中访问对应的属性
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getNickname(){
        return this.nickname;
    }
    public void setSlogan(String slogan){
        this.slogan = slogan;
    }
    public String getSlogan(){
        return this.slogan;
    }
    public void setAge(int age) {this.age = age;}
    public int getAge(){
        return this.age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor(){
        return this.major;
    }
    public void setInfor(String infor) {
        this.infor = infor;
    }
    public String getInfor() {
        return infor;
    }
}
