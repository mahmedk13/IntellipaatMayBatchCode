package inheritancelearning;

public class Programmer extends Employee {
	
	int bonus = 1000;
	
	public static void main(String[] args) {
		Programmer p = new Programmer();
		Employee e = new Employee();
		System.out.println(e.basicSalary);
		System.out.println(p.basicSalary);
		int totalSalary = p.basicSalary+p.bonus;
		System.out.println("total salary is "+totalSalary);
	}

}
