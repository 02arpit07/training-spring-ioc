package ioc.beans.individual;

public class A implements I {

	public void doSomething() {
		System.out.println(this.getClass().getName());
	}
}
