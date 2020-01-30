package prototype;

public abstract class Employee implements Cloneable {
	
	String name ;
	int age ;
	
	public abstract void work() ;
	
	public Employee clone() {
		Object emp = null ;
		try {
			emp = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Employee)emp ;
	}

}
