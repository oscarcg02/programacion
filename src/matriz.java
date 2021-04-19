public class matriz
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class matriz
     */
    public matriz()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        inicializar(matriz);
        visualizarMatriz(matriz);
        int[] diagoPrincipal = new int[matriz.length];
        int[] diagoSecundaria = new int[matriz.length];

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    diagoPrincipal[i] = matriz[i][j];
                }

                if(i+j == matriz.length-1){
                    diagoSecundaria[i] = matriz[i][j];
                }
            }
        }
        System.out.println("\nDiagonal Principal");
        visualizarArray(diagoPrincipal);

        System.out.println("\n\nDiagonal Secundaria");
        visualizarArray(diagoSecundaria);
    }

    static void visualizarArray(int[] pArray){
        for(int i=0;i<pArray.length;i++){
            System.out.print("\t" + pArray[i]);
        }
    }

    static void inicializar(int[][] pMatriz){
        int aux = 1;
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] = aux;
                aux++;
            }
        }
    }

    static void visualizarMatriz(int[][] pMatriz){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                System.out.print("\t" + pMatriz[i][j]);
            }
            System.out.println();
        }
    }
}
