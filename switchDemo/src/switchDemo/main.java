package switchDemo;

public class main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;
		case 'B':
			System.out.println("Cok guzel : Gectiniz");
			break;
		case 'C':
			System.out.println("Iyi : Gectiniz");
			break;
		case 'D':
			System.out.println("Fena Degil : Gectiniz ");
			break;
		case 'F':
			System.out.println("Malesef Kaldiniz");
			break;
		default:
			System.out.println("Gecersiz Not Girdiniz");
		}

	}

}
