class Person
{
	String name;
	
	String dob;
	
public Person(String name,String dob)
{
	this.name=name;
	this.dob=dob;
}

}
class Employee extends Person
{
	int salary ;
	String department;
	
	public Employee(String name,String dob,int salary,String department)
	{
		super(name,dob);
		this.salary=salary;
		this.department=department;
		
	}
	
}


class Manager extends Employee
{
	
	int HRA;
	int DA;
	int TA;
		
     public Manager(String name,String dob,int salary,String department,int HRA,int DA,int TA) 
		{  //this();
			
			super(name,dob,salary,department);

			this.HRA=HRA;
			this.DA=DA;
			this.TA=TA;
		}
public void printDetails()
{
	System.out.println(" the name is "+name);
	System.out.println(" the salry is "+salary);
	System.out.println("  dob is "+dob);
	System.out.println(" the ta is "+TA);
	System.out.println(" the da is "+DA);
	System.out.println(" the HRA IS "+HRA);
	
}
		
}


public class InheritanceDemo2 {

public static void main(String a[])
{
	Manager manager=new Manager("KARTIKAY","8/02/1998",30000000,"data analyst",2000,3000,4000);
	manager.printDetails();
	
}


}
