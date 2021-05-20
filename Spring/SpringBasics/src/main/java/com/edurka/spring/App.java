package com.edurka.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.edurka.spring.domain.Address;
import com.edurka.spring.domain.Employee;
import com.edurka.spring.module.Book;
import com.edurka.spring.module.EBook;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Address addrs= new Address(); addrs.setStreet("Madinaaguda");
		 * addrs.setCity("Hyderabad"); addrs.setState("TS"); addrs.setPincode("500049");
		 * 
		 * Employee emp= new Employee(); emp.setId(1); emp.setName("Sagar");
		 */
    	
    	
//    	ClassPathResource classPathResource = new ClassPathResource("EmployeeConfig.xml");    	
//    	BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
//    	Employee emp = (Employee) beanFactory.getBean("emp");    	
//        System.out.println( "emp : "+emp );
        

        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
//        Employee emp = (Employee) context.getBean("emp");
//        Employee emp1 = context.getBean("emp1", Employee.class);
//        System.out.println( "emp1 : "+emp1 );

//        Employee emp2 = context.getBean("emp2", Employee.class);
//        System.out.println( "emp2 : "+emp2 );
        
//        Book book = context.getBean("book", Book.class);
//        System.out.println(book);
//        
        EBook ebook = context.getBean("ebook", EBook.class);
        System.out.println(ebook);
        
        
        ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) context;
        classPathXmlApplicationContext.close();
        
}
}
