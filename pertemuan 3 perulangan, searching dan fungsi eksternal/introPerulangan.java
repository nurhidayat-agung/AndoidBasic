import java.util.Scanner;

class IntroPerulangan{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float arAngka[] = new float[5];
		for (int a = 0; a < arAngka.length ; a++ ) {
				System.out.print("masukan angka ke dalam array : ");
				arAngka[a] = Float.parseFloat(userInput.next());
			}

		for (int b =0 ;b < arAngka.length ;b++ ) {
				System.out.println("nilai pada array index ke "+b+" adalah "+arAngka[b]);
			}	
	}
}