package FunctionOverLoading;

public class ClassWithSameMethodsName {

// Function Overloading - 	
	
	public void getData(int a) 
	{	
		System.out.println(a);
	}
	
	
	public void getData(String a) 
	{	
		System.out.println(a);
	}
	
	public void getData(int a, int b) 
	{	
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ClassWithSameMethodsName sm = new ClassWithSameMethodsName();
		sm.getData(1);
		sm.getData("Hello");
		sm.getData(2, 3);

	}

}
