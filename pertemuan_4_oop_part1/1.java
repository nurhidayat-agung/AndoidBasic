class Manusia{
	String nama;
	String jenkel;
	byte usia;
	String alamat;
}
class DemoManusia{
	public static void main(String args[]){
		Manusia m1,m2;
		m1 = new Manusia();
		m2 = new Manusia();
		m1.nama="Hendro";
		m1.jenkel="Laki-laki";
		m1.usia=23;
		m1.alamat="Jl.Kemiri Sari no.7 Salatiga";
		m2.nama="Steven";
		m2.jenkel="Laki-laki";
		m2.usia=23;
		m2.alamat="Jl.Kemiri Sari no.7 Salatiga";
		System.out.println("Nama : "+m1.nama);
		System.out.println("Nama : "+m2.nama);
	}
}