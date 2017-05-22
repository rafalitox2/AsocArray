
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
	public int size(){
		return tam;
	}
}