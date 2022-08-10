
public class Pessoa implements Comparable <Pessoa>{
	private String nome; 
	private String numero;
	

	public Pessoa(String nome, String numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	public void setNome(String nome) {
		this.nome= nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setNumero(String numero) {
		this.numero= numero;
	}
	public String getNumero() {
		return this.numero;
	}
	
	public String toString() {
		return "Nome: "+ nome +" Telefone: "+numero +"\n";
	}
	@Override
	public int compareTo(Pessoa outraPessoa) {
		
		return this.nome.compareTo(outraPessoa.getNome());
	}

}
