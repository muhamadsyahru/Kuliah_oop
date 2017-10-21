	public class Mahasiswa{
		public static void main (String[] args){
		System.out.println ("int adalah method utama");
		
		Mahasiswa Syahru = new Mahasiswa();
		Syahru.printNama();
		System.out.println(Syahru.calculateumur());
	}
		
	public void printNama() {
		System.out.println("Syahru");
	}
	public int calculateumur(){
		int tahun_lahir = 1993;
		int tahun_sekarang = 2017;
		
		int umur;
		umur = tahun_sekarang - tahun_lahir;
		
		return umur;
	}
	}
	
	