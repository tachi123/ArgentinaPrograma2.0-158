package miprimerproyecto.Clase01;

public class AlgoritmoMonotributo {

	public static void main(String[] args) {
		
		double ingresosCatA = 748382.07;
        int superficieCatA = 30;
        int energiaCatA = 3330;
        
        double ingresosCatB = 1112459.83;
        int superficieCatB = 45;
        int energiaCatB = 5000;
        
        double ingresosCatC = 1557443.75;
        int superficieCatC = 60;
        int energiaCatC = 6700;
        
        double ingresosCatD = 1934273.04;
        int superficieCatD = 85;
        int energiaCatD = 10000;
        
        double ingresosCatE = 2277684.56;
        int superficieCatE = 110;
        int energiaCatE = 13000;
        
        double ingresosCatF = 2847105.70;
        int superficieCatF = 150;
        int energiaCatF = 16500;
        
        double ingresosCatG = 3416526.83;
        int superficieCatG = 200;
        int energiaCatG = 20000;
        
        double ingresosCatH = 4229985.60;
        int superficieCatH = 200;
        int energiaCatH = 20000; 
        
        
        double ingreso = 50000;
        int superficie = 30;
        int energia = 10000;

              
        if(ingreso < ingresosCatA && superficie < superficieCatA && energia < energiaCatA)
			  System.out.println("Es categoría A");
		  else
			  if(ingreso < ingresosCatB && superficie < superficieCatB && energia < energiaCatB)
				  System.out.println("Es categoría B");
			  else
				  if(ingreso < ingresosCatC && superficie < superficieCatC && energia < energiaCatC)
					  System.out.println("Es categoría C");
				  else
					  if(ingreso < ingresosCatD && superficie < superficieCatD && energia < energiaCatD)
						  System.out.println("Es categoría D");
					  else
						  if(ingreso < ingresosCatE && superficie < superficieCatE && energia < energiaCatE)
							  System.out.println("Es categoría E");
						  else
							  if(ingreso < ingresosCatF && superficie < superficieCatF && energia < energiaCatF)
								  System.out.println("Es categoría F");
							  else
								  if(ingreso < ingresosCatG && superficie < superficieCatG && energia < energiaCatG)
									  System.out.println("Es categoría G");
								  else
									  if(ingreso < ingresosCatH && superficie < superficieCatH && energia < energiaCatH)
										  System.out.println("Es categoría H");
									  else
										  System.out.println("Debe ser responsable inscripto");

	}

}
