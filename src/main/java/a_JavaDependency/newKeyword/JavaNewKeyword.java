package a_JavaDependency.newKeyword;

public class JavaNewKeyword {

	private A a;

	public JavaNewKeyword(A a) {
		this.a = a;
	}

	void setA(A a) {
		this.a = a;
	}

	void invokeA() {
		a.doA();
	}
}

