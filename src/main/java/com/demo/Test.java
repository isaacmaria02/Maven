package com.demo;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
  
public class Test {  
public static void main(String[] args) {  
 
      
    ApplicationContext context = new FileSystemXmlApplicationContext
	         ("src\\main\\resources\\spring.xml");
	      
    Question q =  (Question) context.getBean("q");
    q.displayInfo();  
      
}  
}
