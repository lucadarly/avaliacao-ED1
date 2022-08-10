package grafoum;

public class main {

	public static void main(String[] args) {
		Grafo<String> grafo = new Grafo<String>();
		
		grafo.adicionarVertice("Luca");
		grafo.adicionarVertice("Milena");
		grafo.adicionarVertice("Joaquim");
		grafo.adicionarVertice("Rafael");
		
		
		grafo.adicionarAresta(3.0, "Luca", "Milena");
		grafo.adicionarAresta(2.0, "Luca", "Rafael");
		grafo.adicionarAresta(1.0, "Rafael", "Joaquim");
		grafo.adicionarAresta(2.0, "Rafael", "Milena");
		grafo.adicionarAresta(1.0, "Milena", "Joaquim");
		
		grafo.buscaEmLargura();
		
	}

}
