import java.util.Scanner;

public class ContadorPositivosYNegativos {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
	     boolean salir = false;
	     int si = 1;
         int no = 0;
	    while(salir == false) {
	    	 System.out.print("Introduce un numeros");
	            int num1 = leer.nextInt();
	    	 int decision = leer.nextInt();
	    	 System.out.println("¿Quieres introducir otro numero? Selecciona " + si + " Si desea continuar" +" o "+ no + " Si desea parar");
	    	 if(decision == 0 || decision > 1) {
		            salir = true;
		    }	
	    }
	}
}
