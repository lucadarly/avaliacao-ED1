import java.util.Set;
import java.util.TreeSet;

public class main {
	public static void main(String[] args) {
		
	Set<Pessoa> agenda = new TreeSet<>();	
	
	agenda.add(new Pessoa("Luca","21970217298"));
	agenda.add(new Pessoa("Ana","21217298"));
	agenda.add(new Pessoa("Sergio","219702172"));
	agenda.add(new Pessoa("Bia","21970217298"));
	
	for(Pessoa pessoa: agenda) {
		System.out.println(pessoa);
	}
	

	

}
	}
