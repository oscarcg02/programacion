import java.util.Random;
import java.util.Scanner;
public class adivinarNumero {
	 public static void main(String[] args)
	    {
		 Random rnd = new Random();
		 Scanner sc = new Scanner(System.in);
		int numeroAdivinar = rnd.nextInt(10); 
		System.out.println(numeroAdivinar);
		int number;
		 do
	        {
	            System.out.print("Enter the number ");
	            number = sc.nextInt();
	 
	            if(number > numeroAdivinar)
	            {
	            	System.out.println("Muy alto ");;
	            }
	 
	            if(number < numeroAdivinar)
	            {
	            	System.out.println("Muy bajo ");
	            }
	            
	 
	        }while(number != numeroAdivinar);
				System.out.print("Acertaste puto gilipollas ");
	    }
}
