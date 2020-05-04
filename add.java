import java.util.Scanner;
class lab2
{
	public static void main(String Args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of row and column for square matrix");
		int r=s.nextInt();
		int c=s.nextInt();
		int a[][]=new int[r][c];
		int sum_ele=0;
		System.out.println("Enter the value of square matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			a[i][j]=s.nextInt();	
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			sum_ele+=a[i][j];	
			}
		}
		System.out.println("Sum of matrix elements is "+sum_ele);
	}
}