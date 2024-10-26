package parttens;

public class daimondPartten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int r=1;r<=4;r++) 
	        { 
	            for(int sp=3;sp>=r;sp--){ 
	                System.out.print(" "+" "); 
	            } 
	            for(int c=1;c<=r;c++){ 
	                if (c==4&&r==4) 
	                { 
	                    System.out.print(0+" "); 
	                } 
	                else{ 
	                    System.out.print(c*c+" "); 
	                } 
	     
	            } 
	            for(int c1=r-1;c1>=1;c1--){ 
	                System.out.print(c1*c1+" "); 
	            } 
	            System.out.println(); 
	        } 
	        int f=1; 
	        for(int r2=3;r2>=1;r2--){ 
	            for(int sp1=1;sp1<=f;sp1++){ 
	            System.out.print(" "+" "); 
	            } 
	            for(int c2=1;c2<=r2;c2++){ 
	                System.out.print(c2*c2+" "); 
	            } 
	            for(int c3=r2-1;c3>=1;c3--){ 
	                System.out.print(c3*c3+" "); 
	            } 
	            System.out.println(); 
	            f++; 
	        } 

	}

}
