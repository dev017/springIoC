package entities;

public class Employee extends Human {

	private String id;
	private long salary;

	public Employee(String name, String gender, String id, long salary) {
		super(name, gender);
		this.id = id;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
