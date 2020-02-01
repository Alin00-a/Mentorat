import java.util.Scanner;

public class Exercitiul923 {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int numarTastatura;
		while(true) {
			System.out.println("Introduceti numarul: ");
			numarTastatura = scanner.nextInt();
			
			if(numarTastatura>0) {
				System.out.println("Numarul este pozitiv");
			}
			else{
				System.out.println("Numarul este negativ");
			}
		}
		
	}

}
