package prototype;

public class Developer extends Employee {
	
	int workHours;
	
	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public void work() {
		System.out.println("Developer is working.");
	}

}
