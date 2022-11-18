package Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		//cara 1
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0 ; i<a.length ; i++)
		{
			for(int j = 0 ; j<a.length ; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
		//a.lenght = 3
		
		
		
		//cara 2
		int b[][] = new int[2][3];
		b[0][0] = 1;
		b[0][1] = 2;
		b[0][2] = 3;
		b[1][0] = 4;
		b[1][1] = 5;
		b[1][2] = 6;
		
		for(int i = 0 ; i<2 ; i++) //bisa aja pake b.lenght karena nilainya b.lenght itu 2
		{
			for(int j = 0 ; j<3 ; j++) //gk bisa pake b.lenght karena nilainya b.lenght itu 2
			{
				System.out.print(b[i][j]);
			}
			System.out.println("");
		}
		
	}
	

}
