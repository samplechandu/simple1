package simple1;

public class employee1 {
	    int empId;
	    String empName;
	    String department;
	    float salary;
	    
	    //default constructor
	    public employee1()
	    {
	        empId=1;
	        empName="Emp0001";
	        department="finance";
	        salary=35000;
	    }
	    //parameterized constructor
	    public employee1(String empName,String department,float salary)
	    {
	        this.empName=empName;
	        this.department=department;
	        this.salary=salary;
	    }
	    //parameterized constructor
	    public employee1(int empId,String empName,String department,float salary)
	    {
	        this.empId=empId;
	        this.empName=empName;
	        this.department=department;
	        this.salary=salary;
	    }
	    public void display()
	    {
	        System.out.println("Id: "+empId);
	        System.out.println("Name: "+empName);
	        System.out.println("Department "+department);
	        System.out.println("Salary "+salary);
	    }
	    public static void main(String[] args) {
	        employee1 e=new employee1();
	        employee1 e1= new employee1(12, "Anusha", "I.T.", 450000);
	        e.display();
	        e1.display();
	    }
	}

