package com.learning.spring.spring_three;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.learning.spring.spring_three._interface.MessageRenderer;

public class App 
{
    public static void main( String[] args )
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();
        MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
        ctx.close();
    }
}
