import java.util.Scanner;
public class latihanmodul1 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
	int tahun;
	String bulan;
        Scanner keyboard = new Scanner(System.in); 
		
        
		
		System.out.print("Bulan	: ");
		bulan = keyboard.nextLine();
		
		System.out.print("Tahun	: " );
		tahun = keyboard.nextInt();
		
		
        switch(bulan){
            case "Januari":
                System.out.println(bulan +" "+ tahun + " memiliki 31 hari" );
				
                break;
			case "Februari":
                if (tahun %4 == 0) {
                System.out.println(bulan  +" "+  tahun + " memiliki 29 hari" );
               			
            } else if(tahun %4 != 0 ){
                System.out.println(bulan  +" "+  tahun + " memiliki 28 hari" );
			}
                break;
            case "Maret":
                System.out.println(bulan  +" "+  tahun + " memiliki 31 hari" );
                break;
            case "April":
                System.out.println(bulan  +" "+  tahun + " memiliki 30 hari" );
                break;
			case "Mei":
                System.out.println(bulan +" "+  tahun + " memiliki 31 hari" );
				
                break;
			case "Juni":
                System.out.println(bulan  +" "+  tahun + " memiliki 30 hari" );
				
                break;
			case "Juli":
                System.out.println(bulan +" "+  tahun + " memiliki 31 hari" );
				
                break;
			case "Agustus":
                System.out.println(bulan  +" "+  tahun + " memiliki 31 hari" );
				
                break;
			case "September":
                System.out.println(bulan +" "+ tahun + " memiliki 30 hari" );
				
                break;
			case "Oktober":
                System.out.println(bulan  +" "+  tahun + " memiliki 31 hari" );
				
                break;
			case "November":
                System.out.println(bulan +" "+  tahun + " memiliki 30 hari" );
				
                break;
			case "Desember":
                System.out.println(bulan  +" "+  tahun + " memiliki 31 hari" );
				
                break;
			
			
        }
		
    }
}