public class FilaComPrioridade<T> extends EstruturaEstatica<T>{
	
	public FilaComPrioridade(){
		super();
	}
	
	public FilaComPrioridade(int capacidade){
		super(capacidade);
	}

	public void enfileira(T elemento){
		Comparable<T> chave = (Comparable<T>) elemento;
		
		int i;
		for (i=0; i<this.tamanho; i++){
			if (chave.compareTo(this.elementos[i]) < 0){
				break;
			}
		}
		this.adiciona(i, elemento);
	}
public T espiar(){
		
		if (this.estaVazia()){
			return null;
		}
		
		return this.elementos[0];
	}
	
	public T desenfileira(){
				
		if (this.estaVazia()){
			return null;
		}
		
		T elementoASerRemovido = this.elementos[this.tamanho-1];
		
		this.remove(this.tamanho-1);
		
		return elementoASerRemovido;
		
	}
	
}