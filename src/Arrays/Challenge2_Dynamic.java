package Arrays;

public class Challenge2_Dynamic {

	public static void main(String[] args) {
		//int a[][] = {{2,11,5},{3,4,7},{1,0,2}}; //output 11
		int a[][] = {{3,7,1,6,9},{2,9,15,10,0},{11,12,8,3,13}};  //output 13
		
		/*
		Pertanyaan
		----------
		2 11 5
		3 4 7
		1 0 2
		
		jadi cari minimum number dari 3x3 matrix ini, lalu di minimum number tersebut, cari maksimal number dalam 1 kolom
		output = 11
		penjelasan = minimum number disini 0, lalu di cari 1 kolom tersebut dari 0 adalah 11, 4, 0 lalu maksimal numbernya adalah = 11	
		*/
		
		int minNum = a[0][0];
		int minIndexColumn = 0;
		int maxNum = 0;
		
		int row = a.length;
		int column = a[0].length;
		
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < column; j++)
			{
				if(a[i][j]<minNum)
				{
					minNum = a[i][j];
					minIndexColumn = j;
				}
				
				if(i == row - 1 && j == column - 1)
				{
					maxNum = a[0][minIndexColumn];
					for(int k = 0; k< row ; k++)
					{
						if(a[k][minIndexColumn] > maxNum)
						{
							maxNum = a[k][minIndexColumn];
						}
					}
					
					System.out.println(maxNum);
				}
						
			}
			
			
		}
		

	}

}
