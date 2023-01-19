package com.Spring.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.entity.College;

public class Test_College {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		College cl = (College) bf.getBean("C");
		cl.display();
	}
}
