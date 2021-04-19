import java.util.Scanner;
public class suma1 {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
	     boolean salir = false;
	    while(salir == false) {
	        System.out.print("Introduce dos numeros");
	            int num1 = leer.nextInt();
	            int num2 = leer.nextInt();
	            int resultado = num1 + num2;
	            int si = 1;
	            int no = 0;
	        System.out.println("El resultado es: " + resultado);

	        System.out.println("Quieres continuar? " + "Selecciona " + si + " Si desea continuar" +" o "+ no + " Si quiere parar");
	        int decision = leer.nextInt();

	        if(decision == 0 || decision > 1) {
	            salir = true;
	    }

	        }
	     }
	}

	
