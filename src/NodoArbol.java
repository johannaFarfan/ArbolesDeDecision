
public class NodoArbol {

	int dato;
	String nombre;
	NodoArbol hijoDerecho;
	NodoArbol hijoIzquierdo;
	
	public NodoArbol (int d, String nom) {
		this.dato = d;
		this.nombre = nom;
		this.hijoDerecho = null;
		this.hijoIzquierdo = null;
	}
	
	public String toString() {
		return nombre + " Su dato es: " + dato;
	}
}
