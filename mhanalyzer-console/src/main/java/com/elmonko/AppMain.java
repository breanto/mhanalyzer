package com.elmonko;

import com.elmonko.service.MonsterService;

import org.springframework.context.ApplicationContext;

/**
 * Created by ElMonko on 05/06/2014.
 */
public class AppMain {

    public static void main(String[] args) {
        MonsterService monsterService = new MonsterService();
        System.out.println("Hello World");

//        ApplicationContext context = new ClassPathXmlApplicationContext(
  //              "classpath*:**/applicationContext*.xml");
    }

}
