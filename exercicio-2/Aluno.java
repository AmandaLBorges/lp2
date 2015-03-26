public class Aluno {

	String nome;
	int idade;
	String numeroMatricula;	

	public void imprimirDadosCadastrais(){
		System.out.println("Nome :" + this.nome);
		System.out.println("Idade :" + this.idade);
		System.out.println("Numero Matricula :" + this.numeroMatricula);
	}
	
	public static void main(String[] args){


	Aluno estudante = new Aluno();
	Aluno estudante1 = new Aluno();
	Aluno estudante2 = new Aluno();
	Aluno estudante3 = new Aluno();
	
		
	estudante.nome = "Amanda";
	estudante.idade = 17;
	estudante.numeroMatricula = "201318110025"; 
	estudante.imprimirDadosCadastrais();


	estudante1.nome = "Layane";
	estudante1.idade = 17;
	estudante1.numeroMatricula = "201318110173";
	estudante1.imprimirDadosCadastrais(); 

	estudante2.nome = "Helder";
	estudante2.idade = 17;
	estudante2.numeroMatricula = "201318110049";
	estudante2.imprimirDadosCadastrais();

	estudante3.nome = "Brenda";
	estudante3.idade = 17;
	estudante3.numeroMatricula = "201318110041";
	estudante3.imprimirDadosCadastrais();  

}	
	

}
