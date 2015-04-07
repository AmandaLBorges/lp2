
import java.util.Scanner;

public class BigInt {

    int x[] = new int[30];
    int y[] = new int[30];
    int somar[] = new int[30];
    int multiplicar[] = new int[30];

    public void ler() {
        Scanner imput = new Scanner(System.in);
        System.out.println("Primeiro numero: ");
        String a = imput.next();
        int quantidade = a.length() - 1;
        int contador = 29;
        while quantidade>= 0) {
            this.x[contador] = Character.getNumericValue(a.charAt(quantidade));
            contador--;
            quantidade--;
        }

        System.out.println("Segundo numero: ");
        String b = imput.next();

        tamanho = b.length() - 1;
        contador = 29;
        while (quantidade >= 0) {
            this.y[i] = Character.getNumericValue(b.charAt(quantidade));
            contador--;
            quantidade--;
        }

    }

    public void soma() {

        int aux1= 0;
        for (int i = 29; i >= 0; i--) {
            this.somar[i] = (this.x[i] + this.y[i] + aux1+ this.somar[i]) % 10;
            sobe = (this.x[i] + this.y[i] + aux1) / 10;
        }
    }

    public void escreveSoma() {
        for (int i = 0; i <= 29; i++) {
            System.out.print(this.somar[i]);
        }
        System.out.println("");
    }

    public void multiplica() {

        for (int i = 29; i >= 0; i--) {
            int aux2 = 0;
            int k = i;
            int j = 29;
            while((j>=0) && (k>=0)){
            this.multiplicar[k] = this.multiplicar[k] + (((this.x[j] * this.y[i]) + aux2) % 10);
            aux2 = (((this.x[j] * this.y[i]) + aux2) / 10);
            k--;
            j--;
            }
        }
        int aux1 = 0;
        int i;
        for (i = 29; i >= 0; i--) {
           aux1 = this.multiplicar[i]/10;
           this.multiplicar[i] = ((this.multiplicar[i] + aux1)%10);
            
            
          
        }
    }

    public void escreveMultiplicacao() {
        for (int i = 0; i <= 29; i++) {
            System.out.print(this.multiplicar[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        BigInt amanda= new BigInt();
        amanda.ler();
        amanda.soma();
	      amanda.multiplica();
        amanda.escreveSoma();
        amanda.escreveMultiplicacao();

    }
}
