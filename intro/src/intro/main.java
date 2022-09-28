package intro;

public class main {
//Bismillah
	public static void main(String[] args) {
	System.out.println("Hello World!");
	//değişken isimlendirmeleri javada camelCase yazılır ilk harf küçük sonra büyük
	String ortaMetin = "ilginizi çekebilir";
	String altMetin  = "Vade süresi ";
	
	
	System.out.println(ortaMetin);
    
	int vade = 12;
	
	
	double dolarDun = 18.20;
	double dolarBugun = 18.20;
	
	boolean dolarDustuMu = false;
	
	String okYonu = "";
	
	if (dolarBugun<dolarDun) { //true 
		okYonu = "down.svg";
		System.out.println(okYonu);
		
	}  
	else {
		okYonu = "up.svg";
		System.out.println(okYonu);
	}
	System.out.println("meraba");
		
	}

}
