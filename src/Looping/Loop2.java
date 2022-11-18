package Looping;

public class Loop2 {

	public static void main(String[] args) {
		
		int count = 1;
		int countMultiply = 3;
		
		for(int i = 0 ; i < 4 ; i++)
		{
			for(int j = 0 ; j < i + 1 ; j++)
			{
				System.out.print(count + " ");
				count++;
			}
			count = 1;
			System.out.println("");
		}
		
		
		for(int i = 0 ; i < 5 ; i++)
		{
			for(int j = 1 ; j < i + 1 ; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		
		for(int i = 0 ; i < 4 ; i++)
		{
			for(int j = 0 ; j < i + 1 ; j++)
			{
				System.out.print(countMultiply + " ");
				//countMultiply = countMultiply+3;
				countMultiply += 3;
			}
			System.out.println("");
		}


	}

}
