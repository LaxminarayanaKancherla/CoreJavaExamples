package parttens;

public class butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
        int z=5;
        for(x=1;x<=z;x++)
        {
       	 for(y=1;y<=z;y++)
       	 {
       		 if(y==1||y==x||x+y==z+1||y==z)
       			 System.out.print("* ");
       		 else
       			 System.out.print("  ");
       	 }
       	 System.out.println();
        }

	}

}
