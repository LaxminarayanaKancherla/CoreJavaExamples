package parttens;

public class invertedTriangle {
	
		   public static void main(String[] args) {
			   int x,y,z,w;
			      for(x=1;x<=6;x++)
			      { 
			    	  for(y=1;y<=x;y++)
			    	  {
			    		  System.out.print("  ");
			    	  }
			    	  for(z=6;z>=x;z--)
			    	  {
			    		  System.out.print("*   " );
			    	  }

			    	  System.out.println();
			      }
		   }

}
