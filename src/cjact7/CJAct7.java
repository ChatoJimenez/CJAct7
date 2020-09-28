
package cjact7;


public class CJAct7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arreglos
        int[] numerosPrimos = encontrarPrimos(20);
        int[] fibonacci = encontrarFibonacci(20);
        //Iteración
        System.out.println("Números primos: ");
        for (int i = 0; i < numerosPrimos.length; i++) {
            if (i<numerosPrimos.length-1) {
                System.out.print(numerosPrimos[i] + ", ");
            } else {
                System.out.println(numerosPrimos[i]);
            }
        }
        System.out.println("Sucesión de Fibonacci");
        for (int i = 0; i < fibonacci.length; i++) {
            if (i<numerosPrimos.length-1) {
                System.out.print(fibonacci[i] + ", ");
            } else {
                System.out.println(fibonacci[i]);
            }
        }
    }
    
    public static int[] encontrarFibonacci(int n) {
        int a = 0, b= 1, c= 0;
        int[] sucesionFibonacci = new int[n];
        sucesionFibonacci[0] = a;
        sucesionFibonacci[1] = b;
        for (int i = 2; i < n; i++) {
            c = a + b;
            sucesionFibonacci[i] = c;
            a = b;
            b = c;
        }
        return sucesionFibonacci;
    } 
    
    public static int[] encontrarPrimos(int n) {
        int contador = 0, i = 1;
        int [] numerosPrimos = new int[n];
        do {
            if (esPrimo(i)) {
                numerosPrimos[contador] = i;
                contador++;
                i++;
            } else {
                i++;
            }
        } while (contador<n);
        return numerosPrimos;
    }
    
    public static boolean esPrimo(int n){
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                contador++;
            }
        }
        return (contador==2);
    }
    
}
