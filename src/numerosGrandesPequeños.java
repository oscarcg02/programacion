import java.util.Scanner;
 
public class numerosGrandesPequeños{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
 
        int number;
        int max = 0;  
        int min = 0;  
 
        char choice;
 
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
 
            if(number > max)
            {
                max = number;
            }
 
            if(number < min)
            {
                min = number;
            }
 
            System.out.print("Quieres continuar? S/n? ");
            choice = console.next().charAt(0);
 
        }while(choice=='s' || choice == 'S');
 
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }  
}