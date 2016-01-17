package com.eonjava;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class StarWarsApp
{
    public static void main(String[] args)
    {
        /*Jedi jedi = new Jedi();
        jedi.setFirstName("Luke");
        jedi.setLastName("Skywalker");*/

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Jedi jedi = (Jedi) context.getBean("jediBean");

        System.out.println(jedi);
    }
}
