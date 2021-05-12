package basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		//Student chandu = new Student();
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Student chandu = (Student) beanFactory.getBean("studentbean");
		chandu.displayInfo();
	}

}
