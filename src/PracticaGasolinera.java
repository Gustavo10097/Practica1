import java.util.Scanner;

/**
 * 
 */

/**
 * @author VI110A04
 *
 */
public class PracticaGasolinera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lleno = 70;
		int casilleno = 60;
		int trescuartos = 40;
		int medio = 35;
		int suficiente = 20;
		int insuficiente = 1;
		int medida = 0;
		  boolean esAutenticado = false;
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte cantidad de nivel de gasolina de 1 a 70: ");
        int num1 = scanner.nextInt();
        
         if (num1 >= insuficiente  &&  num1 < suficiente ) {
        	 System.out.println("la cantidad de tanque es insuficiente " + num1 );
         }
         if (num1 >= suficiente  &&  num1 < medio ) {
        	 System.out.println("la cantidad de tanque es suficiente " + num1 );
         }
         if (num1 >= medio  &&  num1 < trescuartos ) {
        	 System.out.println("la cantidad de tanque es medio " + num1 );
         }
         if (num1 >= trescuartos  &&  num1 < casilleno ){
        	 System.out.println("la cantidad de tanque es tres cuartos " + num1 );
         }
         if (num1 >= casilleno  &&  num1 < lleno ) {
        	 System.out.println("la cantidad de tanque es casi lleno " + num1 );
         }
         if (num1 < casilleno  &&  num1 >= lleno ) {
        	 System.out.println("la cantidad de tanque es lleno " + num1 );
         }
        
	}

}
