package miprimerproyecto.Clase01;

public class BucleEjemplo {

	public static void main(String[] args) {
		int unNum = 10;
		
		System.out.println("Ciclo WHILE: Disminuye");
		while(unNum > 0){
			System.out.println(unNum);
			unNum = unNum -1;
		 }
		
		
		
		System.out.println("Ciclo FOR: Aumenta");
		
		for(int otroNum=0;otroNum > 10;otroNum++){
			
			System.out.println(otroNum);
			
		}
	}

}
