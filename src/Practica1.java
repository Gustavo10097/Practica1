import java.util.Scanner;

/**
 * 
 */

/**
 * @author VI110A04
 *
 */
public class Practica1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el numero1: ");
        int num1 = scanner.nextInt();
        System.out.print("ingrres el numero2: ");
        int num2 = scanner.nextInt();
        
      min = (num1 < num2)? num1:num2;
      min = (min < num2)? min:num2;
 
      
      System.out.println("num1 : " + num1);
      System.out.println("num2 : " + num2);
      System.out.println("nel minimo es  : " + min);
	}
}
