
public class Aula {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		  
   
	 FilaComPrioridade aula = new FilaComPrioridade();
	 
	 
	 aula.enfileira(new Aluno("Luca", 50)); //Frequencia de 50%
	 aula.enfileira(new Aluno("Roberto", 42)); //Frequencia de 42%
	 aula.enfileira(new Aluno("Maria", 22)); //Frequencia de 22%
	 aula.enfileira(new Aluno("Sergio", 97)); //Frequencia de 97%
	 aula.enfileira(new Aluno("Bruna", 55)); //Frequencia de 55%
	 aula.enfileira(new Aluno("Joao", 90)); //Frequencia de 90%
	 
	 System.out.println(aula);
	 System.out.println("Aula com capacidade de 5 alunos. (Removendo aluno menos frequente)");
	 System.out.println(aula.desenfileira());
	 System.out.println("Aula composta por: ");
	 System.out.println(aula);

	 

	 
	}

}
