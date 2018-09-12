package läxa;

import java.util.Scanner;

public class läxav36 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
		System.out.println("vad heter du?");
		String namn = input.nextLine();
		
		System.out.println("Hur gammal är du?");
		String ålder = input.nextLine();
		
		System.out.println("vart bor du?");
		String adress = input.nextLine();
		
		System.out.println("vilket postnummer har du?");
		String postnummer = input.nextLine();
		
		System.out.println("i vilken stad bor du");
		String stad = input.nextLine();
		
		System.out.println("vad är ditt telefonnummer?");
		String telefonnummer = input.nextLine();
		
		System.out.println(namn);
		System.out.println(ålder);
		System.out.println(adress);
		System.out.println(postnummer);
		System.out.println(stad);
		System.out.println(telefonnummer);
		
		System.out.println("infromation");
		System.out.println(namn + " " + ålder + " " + adress + " " + postnummer + " " + stad + " " + telefonnummer + " " );
		
	
		
	}
}
