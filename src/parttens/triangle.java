package parttens;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z,w;
	      for(x=1;x<=4;x++)
	      { 
	    	  for(y=6;y>=x;y--)
	    	  {
	    		  System.out.print("  ");
	    	  }
	    	  for(z=1;z<=x;z++)
	    	  {
	    		  System.out.print("*   " );
	    	  }

	    	  System.out.println();
	      }
			

	}

}
