package practice;

public class MethodDemo {

	public static void main(String[] args) 
	{
	userMethod u=new userMethod();
	u.user();
		MethodDemo m=new MethodDemo();
				//m.getdata();
				String r=m.getdata();
				System.out.println(r+"  :" +"this is the String type method");
		  String c  =getdata2();
		  System.out.println(c);
	}

	public  String getdata()
	{
		System.out.println("Hello world: this is the void type method");
		return "Munir Noory";
		
	}
	public static String getdata2()
	{
		System.out.println("hellow world");
		return "faqier shah";
	}
}

