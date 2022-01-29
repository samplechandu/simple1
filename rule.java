package simple1;

public class rule {
	public void print()
    {
        System.out.println("Method without return type and without Para");
    }
    
    //method returning nothing with 1 Parameter
    public void display(String name)
    {
        System.out.println("My Name is "+name);
    }
    
    //method with return type and parameters
    public int cube(int n)
    {
        return n*n*n; 
        }
	public static void main(String[] args) {
		rule obj = new rule();
		obj.print();
		obj.display("chandu");
         System.out.println("the end");
         System.out.println(obj.cube(5));
    }

	}

