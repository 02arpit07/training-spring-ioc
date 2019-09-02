package a_JavaDependency;

import a_JavaDependency.interfaceInjection.JavaInterfaceDependency;
import a_JavaDependency.newKeyword.A;
import a_JavaDependency.newKeyword.JavaNewKeyword;


public class Application {

	public static void main(String[] args) {
		// Inflexible - cannot replace A with B
		JavaNewKeyword javaNewKeyword = new JavaNewKeyword(new A());
		//		javaNewKeyword = new JavaNewKeyword(new B());
		// Flexible - but new keyword again. Only if we could have a mechanism to get rid of "new".
		JavaInterfaceDependency javaInterfaceDependency =
				new JavaInterfaceDependency(new a_JavaDependency.interfaceInjection.A());
		javaInterfaceDependency =
				new JavaInterfaceDependency(new a_JavaDependency.interfaceInjection.A());
	}
}
