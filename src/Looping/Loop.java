package Looping;

public class Loop {

	public static void main(String[] args) {
		int count = 1;
		int count2 = 10;
		int count3 = 1;
		int count4 = 1;
		int maxCount = 11;
//		while(count<11)
//		{
//			System.out.println(count);
//			count++;
//		}
		
//		do {
//			System.out.println(count);
//			count++;
//		} while (count<11);
		
//		for(int i = 0 ; i < maxCount ; i++ )
//		{
//			System.out.println(i);
//		}
		
		
		//cara 1 - siku siku
		for(int i = 0 ; i < 4 ; i ++)
		{
			System.out.print(count+" ");
			count++;
			
			for(int j = 0 ; j < i ; j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println("");
		}
		
		//cara 2 - siku siku
		for(int i = 0 ; i < 4 ; i ++)
		{
			
			for(int j = 0 ; j < i+1 ; j++)
			{
				System.out.print(count4+" ");
				count4++;
			}
			System.out.println("");
		}
		
		//cara 1 - siku siku terbalik
		for(int i = 0 ; i < 4 ; i ++)
		{
			System.out.print(count2+" ");
			count2--;
			
			for(int j = 4 ; j > i+1 ; j--)
			{
				System.out.print(count2+" ");
				count2--;
			}
			System.out.println("");
		}

		
		//cara 2 - siku siku terbalik
		for(int i = 0 ; i < 4 ; i ++)
		{
			
			for(int j = 0 ; j <4-i ; j++)
			{
				System.out.print(count3+" ");
				count3++;
			}
			System.out.println("");
		}
		
		
	}

}
