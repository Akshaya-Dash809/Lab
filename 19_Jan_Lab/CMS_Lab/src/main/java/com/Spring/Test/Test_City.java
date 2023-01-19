package com.Spring.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.entity.City;

public class Test_City {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("ApplicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		City c = (City) bf.getBean("Ct");
		c.display();
	}
}
