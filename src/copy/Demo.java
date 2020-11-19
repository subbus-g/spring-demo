package copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("her");
		//new Employee();
		System.out.println("hedsfsdfr");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		context.getBean("emp");
	}
	

}
