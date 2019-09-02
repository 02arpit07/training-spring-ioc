package ioc.beans.dependent;

import ioc.beans.individual.I;


public class IoCDependency {

	private I i;

	public void invokeDependency() {
		i.doSomething();
	}

	public void setI(I i) {
		this.i = i;
	}
}
