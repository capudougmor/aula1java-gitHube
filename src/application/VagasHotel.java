package application;
import java.util.Locale;
import java.util.Scanner;
import entitites.Rent;

public class VagasHotel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms wil be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; ++i) {
			System.out.println();
			System.out.println("Rent #" +i+ ":");
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int room = sc.nextInt();
			vect[room] = new Rent(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; ++i) {
			if(vect[i] != null) {
				System.out.println(i+ ": " +vect[i]);
			}
		}
		System.out.println("End program!");
		
		sc.close();
	}

}
