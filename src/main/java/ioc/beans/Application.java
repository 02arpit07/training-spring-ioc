package ioc.beans;

import ioc.beans.dependent.IoCDependency;
import ioc.beans.individual.A;
import ioc.beans.individual.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] args) {
		// Represents Spring (Bean) Container
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("individualBeans.xml", "dependentBeans.xml");
		// Obtaining bean instance form the container and invoking it method.
		((A) applicationContext.getBean("a")).doSomething();
		applicationContext.getBean("b", B.class).doSomething();
		// Obtaining dependent bean
		applicationContext.getBean("iocDependency", IoCDependency.class).invokeDependency();
	}
}
