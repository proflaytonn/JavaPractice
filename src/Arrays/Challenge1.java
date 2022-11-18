package Arrays;

public class Challenge1 {

	public static void main(String[] args) {
		int a[][] = {{2,4,5},{3,4,7},{1,2,9}}; //print nilai terkecil dari array 2 dimensi ini
		
		int num = 0;
		int numTemp = 0;
		int numPrint = 0;
		
		//cara 1
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j<a.length ; j++)
			{
				num = a[i][j];
				
				if(i ==0 && j == 0)
				{
					numTemp = num;
				}
				else
				{
					if(num < numTemp)
					{
						numPrint = num;
					}
				}
			}
		}
		System.out.println(numPrint);
		
		
		//cara 2
		int minNum = a[0][0];
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j<a.length ; j++)
			{
				if(a[i][j] < minNum)
				{
					minNum = a[i][j];
				}
			}
		}
		System.out.println(minNum);
		
		
		//cari maksimum		
		int maxNum = a[0][0];
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j<a.length ; j++)
			{
				if(a[i][j] > maxNum)
				{
					maxNum = a[i][j];
				}
			}
		}
		System.out.println(maxNum);
	}

}
