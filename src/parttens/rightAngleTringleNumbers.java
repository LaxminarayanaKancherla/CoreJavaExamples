package parttens;

import java.util.Scanner;

public class rightAngleTringleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int num=1;
		for(int x=1;x<=n;x++)
		{
			
			for(int y=1;y<=x;y++)
			{
				
				System.out.print(num+" ");
				num++;
			}
				
							System.out.println();
		}

	}

}
