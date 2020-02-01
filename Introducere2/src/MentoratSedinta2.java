import java.util.Scanner;

public class MentoratSedinta2 {
	
	public static void main(String[] args) {
		double numar1 = 3.0;
		double numar2 = 3.0D;
		if(numar1 == numar2) {
			System.out.println("egale");
		}
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		//System.out.println("Introdu un numar care va reprezenta o zi din saptamana");
		int ziuaSaptamanii; //=scan.nextInt();
//		if(ziuaSaptamanii == 1) {
//			System.out.println("Luni");
//		} else if (ziuaSaptamanii == 2) {
//			System.out.println("Marti");
//		} else if (ziuaSaptamanii == 3) {
//			System.out.println("Miercuri");
//		}else if (ziuaSaptamanii == 4) {
//			System.out.println("Joi");
//		}else if (ziuaSaptamanii == 5) {
//			System.out.println("Vineri");
//		}else if (ziuaSaptamanii == 6) {
//			System.out.println("Sambata");
//		}else if (ziuaSaptamanii == 7) {
//			System.out.println("Duminica");
//		}else {
//			System.out.println("Eroare! Introdu un numar de la 1 la 7");
//		}
		while(true) {
			System.out.println("Introdu un numar care va reprezenta o zi din saptamana");
			ziuaSaptamanii =scan.nextInt();
			switch(ziuaSaptamanii) {
				case 1:
					System.out.println("Luni");
				break;
				case 2:
					System.out.println("Marti");
				break;
				case 3:
					System.out.println("Miercuri");
				break;
				case 4:
					System.out.println("Joi");
				break;
				case 5:
					System.out.println("Vineri");
				break;
				case 6:
					System.out.println("Sambata");
				break;
				case 7:
					System.out.println("Duminica");
				break;
				default:
					System.out.println("Eroare! Introdu un numar de la 1 la 7");
					
			}
		}
		
		
		
	
	}
}
