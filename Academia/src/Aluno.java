public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private int frequencia;
	
	public Aluno(String nome, int frequencia) {
		super();
		this.nome = nome;
		this.frequencia = frequencia;
	}
	
	public Aluno() {}
	
	public void setNome(String nome) {
		this.nome= nome;
		
	}
	public String getNome() {
		return nome;
	}
	
	public void setFrequencia(int frequencia) {
		this.frequencia= frequencia;
		
	}
	public int getFrequencia() {
		return frequencia;
	}
	
	
	public int compareTo(Aluno o) {
		
		if(this.frequencia< o.getFrequencia()) {
			return 1;
		}else if(this.frequencia>o.getFrequencia()) {
			return -1;
		}
		return 0;
	}
	public String toString() {
		return "Aluno nome = "+ nome + " frequencia=" + frequencia+"\n";
	}
		

}


