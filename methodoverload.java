package simple1;

public class methodoverload {
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		methodoverload m= new methodoverload();
		System.out.println("addition of 1st" +m.add(34, 98));
		System.out.println("addition of 2nd" +m.add(34, 98));
		// TODO Auto-generated method stub
		System.out.println("addition of 3rd" +m.add(34, 98));
		System.out.println("addition of 1st" +m.add(34, 98, 67));
		// TODO Auto-generated method stub
	}

}
