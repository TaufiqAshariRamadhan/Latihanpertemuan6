import java.util.Scanner;
public class latihanmodul2 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
        Scanner scan = new Scanner(System.in); 
		char c = scan.next().charAt(0);
        
		
		switch(c){
				case 'A':
                System.out.println("Excellent" );
				
                break;
				case 'B':
                System.out.println("Good" );
				
                break;		
				case 'C':
                System.out.println("Average"  );
				
                break;		
				case 'D':
                System.out.println("Failed" );
				
                break;
		}
    }
}