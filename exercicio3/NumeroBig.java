
package numeromuitogrande;

import java.util.Scanner;

public class NumeroBig {
  
        Scanner input = new Scanner(System.in);
        String n1;
        String n2;
        int i, j;
        int aux1;
        int aux2;
        int soma[] = new int[30];
        int multiplica[] = new int[30];
        int x[] = new int[30];
        int y[] = new int[30];

        public void lerVetor(){
        System.out.print("Primeiro Númer: ");
        n1 = input.next();
        System.out.print("Segundo Número: ");
        n2 = input.next();
    
        for (i = n1.length(), j = 0; i > 0; i--, j++) {
            char caracter = n1.charAt(j);
            x[i] = Character.getNumericValue(caracter);
        }
        for (i = n2.length(), j = 0; i > 0; i--, j++) {
            char caracter = n2.charAt(j);
            y[i] = Character.getNumericValue(caracter);
        }
       }
        
        public void somarVetor(){
          for (i = 29; i >= 0; i--) {
            soma[i] += (x[i] + y[i] + aux1) %10;
            aux1 = (x[i] + y[i] + aux1)/10;
            
            }
        System.out.print("Soma: "); 
        int k;
        for (k = 29; k >= 0; k--) {
            if (soma[k] > 0) {
                System.out.print(soma[k]);
            }
        }
      }
 
        public void multiplicarVetor(){

        for (int i = 29; i >= 0; i--) {
            int aux1 = 0;
            int aux2 = i;
            int j = 29;
            while((j>=0) && (aux2>=0)){
            multiplica[aux2] = multiplica[aux2] + (((x[j] * y[i]) + aux1) % 10);
            aux1 = (((x[j] * y[i]) + aux1)  / 10);
            aux2--;
            j--;
            }
        }
        int aux3 = 0;
        for (i = 29; i >= 0; i--) {
           aux3 = multiplica[i]/10;
           multiplica[i] = ((multiplica[i] + aux3)%10);
        }                 
        System.out.print("Multiplicacao: ");
        int k;
         for (k = 0; k <=29; k++) {
                System.out.print(multiplica[k]);
                }
            }

public static void main(String[] args) {
    NumeroBig amanda = new NumeroBig();
    amanda.lerVetor();
    amanda.somarVetor();
    amanda.multiplicarVetor();
    }   
