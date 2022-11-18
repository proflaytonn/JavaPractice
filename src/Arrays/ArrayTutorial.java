package Arrays;

public class ArrayTutorial {

	public static void main(String[] args) {
		//cara 1 declare int array
		int[] a = new int[5];
		a[0] =5;
		a[1] = 4;
		a[2] = 3;
		a[3] = 10;
		a[4] =13;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);		
		}
		
		//cara 2 declare int array
		int[] b = {5,7,10,33,333};
		
		for(int i = 0 ; i < b.length ; i++)
		{
			System.out.println(b[i]);		
		}

	}

}
