package Demojavabean;

public class employees {
	String emp_name;
	int emp_no;
	Employee  emp;
	
	
	public employees(String emp_name, int emp_no, Employee emp) {
		super();
		this.emp_name = emp_name;
		this.emp_no = emp_no;
		this.emp = emp;
	}
	
	public void display()
	{
		System.out.println("Employee name: "+emp_name+" Employee ID: "+emp_no);
		System.out.println("Employee is:");
		System.out.println(emp.house_name+"\t"+emp.house_no+"\t"+emp.city+"\t"+emp.state+"\t"+emp.country);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a1 = new Employee("santosh bhavan",102,"mumbai","maharashtra","india");
		Employee a2 = new Employee(" bhavan",108,"mumbai","maharashtra","india");

		employees em1 = new employees("Anshika",109,a1);
		employees em2 = new employees("Krishna",109,a2);
		
		em1.display();
		em2.display();
	}

}
