package methods2;

public class main {

	public static void main(String[] args) {
         String mesaj = "Bugün hava çok güzel.";
         String yeniMesaj = sehirVer();
         System.out.println(yeniMesaj);
         int sayi = topla(15,7,6);
         System.out.println(sayi);
         int toplam = topla2(2,4,5);
         System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
		
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
		 
	}
	
	public static int topla(int sayi1,int sayi2,int sayi3) {
		return sayi1+sayi2+sayi3;
	}
	public static int topla2(int... sayilar) {
		int toplam =0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	
	

}
