package l�xa;

import java.util.Scanner;

public class l�xav36 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
		System.out.println("vad heter du?");
		String namn = input.nextLine();
		
		System.out.println("Hur gammal �r du?");
		String �lder = input.nextLine();
		
		System.out.println("vart bor du?");
		String adress = input.nextLine();
		
		System.out.println("vilket postnummer har du?");
		String postnummer = input.nextLine();
		
		System.out.println("i vilken stad bor du");
		String stad = input.nextLine();
		
		System.out.println("vad �r ditt telefonnummer?");
		String telefonnummer = input.nextLine();
		
		System.out.println(namn);
		System.out.println(�lder);
		System.out.println(adress);
		System.out.println(postnummer);
		System.out.println(stad);
		System.out.println(telefonnummer);
		
		System.out.println("infromation");
		System.out.println(namn + " " + �lder + " " + adress + " " + postnummer + " " + stad + " " + telefonnummer + " " );
		
	
		
	}
}
