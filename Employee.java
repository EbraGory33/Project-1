
public class Employee extends Person {
	private String deptName;
	private static int numEmployees;
	private int employeeID;
	
	public Employee() {
		deptName="";
		numEmployees++;
		employeeID=numEmployees;
	}
	public Employee(String deptName) {
		this.deptName=deptName;
		numEmployees++;
		employeeID=numEmployees;
	}
	
	Employee(String name, int birthYear, String deptName){
		super(name,birthYear);
		this.deptName=deptName;
		numEmployees++;
		employeeID=numEmployees;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public static int getNumEmployees() {
		return numEmployees;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	
	public boolean equals(Object obj) {
		Employee o=(Employee) obj;
		return super.equals(o)
			&& o.getDeptName().equals(deptName)
			&& o.getEmployeeID()==employeeID
			&& o.getNumEmployees()==numEmployees;
	}
	
	public String toString() {
		return super.toString()+ String.format(" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
	}
	public int compareTo(Person p) {
		if(p instanceof Employee) {
		Employee f = (Employee) p;   
		return Integer.compare(employeeID,f.employeeID);
		}
		else
			return super.compareTo(p);
		 
	}
}
