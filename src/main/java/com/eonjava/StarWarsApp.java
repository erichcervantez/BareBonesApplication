package com.eonjava;

import org.apache.commons.logging.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.apache.log4j.Logger;

public class StarWarsApp
{
    static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StarWarsApp.class.getName());
    static Log log = LogFactory.getLog(StarWarsApp.class);
    static Logger logger4j = Logger.getLogger(StarWarsApp.class);
    static ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

    public static void main(String[] args)
    {
        /*Jedi jedi = new Jedi();
        jedi.setFirstName("Luke");
        jedi.setLastName("Skywalker");*/

        Jedi jedi = returnAJedi();
        System.out.println("Returned Jedi is: " + jedi.toString());
    }

    public static Jedi returnAJedi()
    {
        System.out.println();
        Jedi jedi = (Jedi) context.getBean("jediBean");
        logger.info("Logging using java.util.logging");
        log.info("Logging using Apache Commons");
        logger4j.info("Logging using Log4J");
        System.out.println();

        return jedi;
    }
}
