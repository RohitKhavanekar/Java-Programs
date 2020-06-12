package Java_Programs;

public class MinNumber {

	public static void main(String[] args) 
	{
		int abc [][]= {{2,3,4},{5,6,7},{1,8,6}};
		int min = abc[0][0];
		int max = abc[0][0];
		for (int i = 0; i <3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if (abc[i][j]< min) 
				{
					min=abc[i][j];					
				}
				else if (abc[i][j]> max) 
				{
					max = abc[i][j];
					
				}
				
			}
			
		}
		System.out.println("Minimum Number is: "+min);
		System.out.println("Maximum Number is: "+max);

	}

}
