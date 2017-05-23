import java.util.NoSuchElementException;

public class AsocArray {
	
	
	private class Node {
		public Node(){
			this(null,null,null);
		}
		
		private Node(String key, String value, Node sig) {
			this.key=key;
			this.value=value;
			this.sig=sig;
			
		}
		String key;
		String value;
		Node sig;
	}


private Node primero;
private int tam;

	

	public AsocArray(){
		this.primero=null;
		tam =0;
	}
	
	public AsocArray(String key,String value){
		primero = new Node(key,value,null);
		this.tam=1;
	}
	
	public int size(){
		return tam;
	}

	public String get(String key) {
		Node aux = primero;
		
		while(aux!=null && aux.key.compareTo(key)!=0){
			aux = aux.sig;
		}
		if (aux == null){
			
			throw new NoSuchElementException();
		}
		return aux.value;
	}

	public void put(String key, String value) {
		Node aux = primero;
		Node prev = null;
		
		while (aux!=null && aux.key.compareTo(key)!=0){
			prev=aux;
			aux=aux.sig;
		}
		
		if(aux!=null){
			aux.value =value;
		}else{
			if (prev == null){
				primero = new Node(key,value,null);
			}else{
				prev.sig= new Node(key,value,null);
		
			}
			tam++;
		}
	}

	public String getOrElse(String key, String value) {
		Node aux = primero;
	
		while(aux!=null && aux.key.compareTo(key)!=0){
			aux = aux.sig;
		}
		if (aux == null){
			return value;
		}else{
			return aux.value;
		}
		
	}
}