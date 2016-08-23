import java.util.Scanner;

class While{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String arString[] = new String[5];
		int a = 0;
		int b = 0;
		do{
			System.out.print("masukan nama teman anda : ");
			arString[a] = userInput.next();
			a++;
		}while(a < 5);
		do{
			System.out.println("nilai pada array index ke "+b+" adalah "+arString[b]);
			b++;
		}while(b < 5);
	}
}