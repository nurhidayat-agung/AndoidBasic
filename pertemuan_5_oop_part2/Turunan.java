class Manusia{
	String nama;
	int umur;
	String alamat;
	float kecepatan;
	void setkecepatan(){
		kecepatan = (float)umur*10;
	}
	void identitas(){
		System.out.println("nama manusia : " + nama);
		System.out.println("umur manusia : " + umur);
		System.out.println("kecepatan lari : " + kecepatan);
		System.out.println("alamat : " + alamat);
	}
	
}
// class bayi memiliki apa-apa yang dimiliki manusia
class Bayi extends Manusia{
	void identitas(){
		System.out.println("nama bayi : " + nama);
		System.out.println("umur bayi : " + umur);
		System.out.println("kecepatan lari : " + kecepatan);
		System.out.println("alamat : " + alamat);
	}
}
class Show{
	public static void main(String[] args) {
		Bayi ikhwani = new Bayi();
		ikhwani.nama = "Al Ikhwani";
		ikhwani.umur = 3;
		ikhwani.alamat = "banyumas";
		ikhwani.setkecepatan();
		ikhwani.identitas();
	}
}