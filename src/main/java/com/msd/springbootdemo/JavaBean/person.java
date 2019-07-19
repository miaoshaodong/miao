package com.msd.springbootdemo.JavaBean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component@ConfigurationProperties(prefix = "person")
public class person {
   private  String name;
   private  Integer age;
   private  boolean sex;
   private  Dog dog;

}
