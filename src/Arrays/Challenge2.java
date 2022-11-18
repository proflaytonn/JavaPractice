package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {

	public static void main(String[] args) {
		//int a[][] = {{2,11,5},{3,4,7},{1,0,2}}; //output 11
		int a[][] = {{3,7,1},{2,9,15},{11,12,8}};  //output 15
		
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
		
		
		//cara Jessen tanpa nyontek
		int minNum = a[0][0];
		int minIndexColumn = 0;
		
		ArrayList<Integer> compare = new ArrayList<Integer>();
		int maxNum = 0;
		
		for(int i = 0 ; i < 3 ; i++)
		{
			for(int j = 0 ; j < 3; j++)
			{
				if(a[i][j]<minNum)
				{
					minNum = a[i][j];
					minIndexColumn = j;
				}
				
				if(i == 2 && j == 2)
				{
					//a[2][1]
					//mau ambil a[0][1], a[1][1], a[2][1]
					//otomatis harus buat 1 variable dimana akan menyimpan 1 nya itu
					
					//cara 1, konsep nyimpen nilai ke arraylist
//					for(int k = 0; k< 3 ; k++)
//					{
//						compare.add(a[k][minIndexColumn]);
//					}
//					
//					maxNum = compare.get(0);
//					
//					for(int l = 0 ; l< compare.size(); l++)
//					{		
//						if(compare.get(l) > maxNum)
//						{
//							maxNum = compare.get(l);
//						}
//					}
//					System.out.println(maxNum);
					
					
					//cara 2, langsung aja compare nilainya dengan index column yg sama, berhubung udah dapet nilainya
					//NOTE : untuk dinamis, nilai row = a.length, column = a[0].length
					maxNum = a[0][minIndexColumn];
					for(int k = 0; k< 3 ; k++)
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
