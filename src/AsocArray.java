
public class AsocArray {
	
	
	private class Node {
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
		primero= new Node();
		primero.key=key;
		primero.value=value;
		primero.sig= null;
		this.tam=1;
	}
	
	public int size(){
		return tam;
	}
}