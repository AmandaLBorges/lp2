package verificadorcpf;

import java.util.Scanner;
public class VerificadorCpf{
    String cpf;
    int  cpfInt[] = new int [11];
    int x = 0;
    int y = 0;
    int i;
    int peso;
    int resto;
 
public void ler(){
    Scanner input = new Scanner(System.in);
    System.out.println("9 primeiros numeros do CPF: ");
    cpf = input.next();
 
for(i=0; i<9; i++){
    char caracter = cpf.charAt(i);
    cpfInt[i] = Character.getNumericValue(caracter);
    }
}
 
public void Primeiro(){
    for(i=8,peso=2;i>=0;i--,peso++){
    x = cpfInt[i]*peso + x;
}
resto = (x%11);
    if (resto<2){
        cpfInt[9] = resto;
    }else{
        cpfInt[9] = 11 - resto;
    }
}
 
public void Segundo(){
    for (i=9,peso=2;i>=0;i--,peso++){
    y = cpfInt[i]*peso+y;
 }
resto = (y%11);
    if (resto<2){
        cpfInt[10] = resto;
    }else{
        cpfInt[10] = 11 - resto;
    }
}
public void Cpftodo(){
    System.out.println ("CPF: ");
    for(i=0; i<=10; i++){
    System.out.print (cpfInt[i]);
    }
}
 
public static void main(String args[]){
    VerificadorCpf amanda = new VerificadorCpf();
    amanda.ler();
    amanda.Primeiro();
    amanda.Segundo();
    amanda.Cpftodo();
    }
}
