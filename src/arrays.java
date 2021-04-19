import java.util.Scanner;
public class arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int si = 1;
        int no = 0;
        int numero = sc.nextInt();
        int enteros [] = new int[10];
        int enteros2 [] = new int[10];
        while(salir == false) {
            numero = sc.nextInt();
            for (int i = 0; i < numero; i++) {
                enteros[i] = numero + i;
            }
            
            System.out.println("Quieres añadir otro numero? " + "Selecciona " + si + " Si desea continuar" +" o "+ no + " Si quiere parar");
            int decision = sc.nextInt();

            if(decision == 0 || decision > 1) {
                salir = true;
                System.out.println("Has añadido: " + enteros.length + " numeros");
            } 

        }
        for(int i = 0; i <= numero; i++) {
            enteros[numero] = enteros2[numero];
        }


    }

}
