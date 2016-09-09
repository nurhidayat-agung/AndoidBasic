class Overloading{
	int a;
	float b;

	public void kali2(int x){
		System.out.println("data yang dimasukan integer " + x);
	}
	public void kali2(float y){
		System.out.println("data yang dimasukan float " + y);
	}
}

class Lihat{
	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.kali2(2.5f);
	}
}

//
// class DisplayOverloading2
// {
//     public void disp(double c)
//     {
//         System.out.println(c);
//     }
//     public void disp(int c)
//     {
//        System.out.println(c );
//     }
// }

// class Sample2
// {
//     public static void main(String args[])
//     {
//         DisplayOverloading2 obj = new DisplayOverloading2();
//         obj.disp(2.6);
//         obj.disp(5);
//     }
// }