package a_JavaDependency.interfaceInjection;

public class JavaInterfaceDependency {

	private I i;

	public JavaInterfaceDependency(I i) {
		this.i = i;
	}

	void setI(I i) {
		this.i = i;
	}

	void invokeA() {
		i.doSomething();
	}
}
