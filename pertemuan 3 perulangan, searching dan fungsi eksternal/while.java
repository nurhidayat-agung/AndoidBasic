import java.util.Scanner;

class While{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String arString[] = new String[5];
		int a = 0;
		int b = 0;
		while(a<5){
			System.out.print("masukan nama teman anda : ");
			arString[a] = userInput.next();
			a++;
		}
		while(b < 5){
			System.out.println("nilai pada array index ke "+b+" adalah "+arString[b]);
			b++;
		}
	}
}