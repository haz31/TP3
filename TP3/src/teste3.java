
import java.util.Scanner;

public class teste3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		  
		Scanner sc = new Scanner(System.in);

		    System.out.println("Veuillez saisir un nombre:");
		       int deb = sc.nextInt();
		       
		    System.out.println("Veuillez saisir un deuxieme nombre:");
		       int fin = sc.nextInt();
		   
		    int middle = ( deb + fin) / 2;
		              
		    for( int i  = deb ; i <= fin ; i++) {
			
		    	if (i == middle){
		    	System.out.println("moitié");}
		    	
		    	 else  { 
				 System.out.println(i);
		   }
	  	}
	}
}    	
		    	
		    
	


