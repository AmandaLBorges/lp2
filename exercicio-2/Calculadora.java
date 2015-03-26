public class Calculadora{

	int variavel1;
	int variavel2;
	int soma;
	int subtrair;
	float dividir;
	int multiplicar;

	public void soma(){
	
	soma = (variavel1 + variavel2 );

	System.out.println("A soma e: " + this.soma);
}

	public void subtrair(){
	
	subtrair = (variavel1 - variavel2);

	System.out.println("A subtracao e: " + this.subtrair);
}
	
	public void dividir(){
	
	dividir = (variavel1 / variavel2);

	System.out.println("A divisao e: " + this.dividir);
}

	public void multiplicar(){
	
	multiplicar = (variavel1 * variavel2);

	System.out.println("A multiplicacao e: " + this.multiplicar);
}


	public static void main(String[] args){
	
	Calculadora um = new Calculadora();
	Calculadora dois = new Calculadora();
	Calculadora tres = new Calculadora();

	um.variavel1 = 10;
	um.variavel2 = 5;
	um.soma();
	um.subtrair();
	um.dividir();
	um.multiplicar();

	
	dois.variavel1 = 20;
	dois.variavel2 = 5;
	dois.soma();
	dois.subtrair();
	dois.dividir();
	dois.multiplicar();

	tres.variavel1 = 18;
	tres.variavel2 = 6;
	tres.soma();
	tres.subtrair();
	tres.dividir();
	tres.multiplicar();

}	  
	
}
