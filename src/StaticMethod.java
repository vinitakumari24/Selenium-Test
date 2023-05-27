public class StaticMethod {
	public void method1()
	{
		System.out.println("Hello Non static method");
	}

	public static void method2()
	{
		System.out.println("Non static method");
	}
	public static void main(String[] args) {
		StaticMethod obj = new StaticMethod();
		obj.method1();
		StaticMethod.method2();
		System.out.println("Static method");
		System.out.println("Static method");
		
	}

}
