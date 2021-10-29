import java.util.Scanner;
public class latihanppt2 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
	int penumpang;
        Scanner scan = new Scanner(System.in); 
		String kota = scan.nextLine();
        penumpang = scan.nextInt();
		int penumpangbogor = penumpang*200000;
		int diskon = penumpangbogor/10;
		int diskonakhir = penumpangbogor - diskon;
		
        switch(kota){
            case "Jakarta":
                System.out.println("Tujuan : Jakarta" );
				System.out.println("Biaya : 145000 x "+ penumpang + " = " + penumpang*145000 );
                break;
			case "Bogor":
                if (penumpangbogor <= 250000) {
                System.out.println("Tujuan : Bogor" );
				System.out.println("Biaya : 200000 x " + penumpang + " = "+ penumpang*200000 );
               			
            } else if(penumpangbogor > 250000){
                System.out.println("Tujuan : Bogor" );
				System.out.println("Tambahan Diskon 10%" );				
				System.out.println("Biaya : 200000 x " + penumpang + " - Diskon 10% = "+ diskonakhir);
			}
                break;
            case "Garut":
                System.out.println("Tujuan : Garut" );
				System.out.println("Biaya : 75000 x " + penumpang + " = "+ penumpang*75000 );
                break;
            case "Purwakarta":
                System.out.println("Tujuan : Purwakarta" );
				System.out.println("Biaya : 75000 x " + penumpang + " = "+ penumpang*75000 );
                break;
			
			
        }
		
    }
}