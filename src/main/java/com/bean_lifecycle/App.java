package com.bean_lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        Samosa samosa = (Samosa) context.getBean("samosa");

        System.out.println(samosa);
        context.registerShutdownHook();

        Pepsi pepsi = (Pepsi) context.getBean("pepsi");
        System.out.println(pepsi);

    }
}
