package Java_Programs;


public class Palindrom {

	public static void main(String[] args) 
	{
		String a = "Rohit";
		String b = "";
		
		for (int i =a.length()-1; i>=0; i--) 
		{
			b = b+ a.charAt(i);
			
		}
		
		System.out.println(b);

	}

}
