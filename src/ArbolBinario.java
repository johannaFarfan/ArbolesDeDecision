
public class ArbolBinario {
	NodoArbol raiz;

	public ArbolBinario() {
		raiz = null;
	}

	/**
	 * Metdo para realizar la insercion del Nodo del Arbol
	 * 
	 * @param d
	 * @param nom
	 */
	public void agregarNodo(int d, String nom) {
		NodoArbol nuevo = new NodoArbol(d, nom);

		if (raiz == null) {
			raiz = nuevo;
		} else {
			NodoArbol auxiliar = raiz;
			NodoArbol padre;

			while (true) {
				padre = auxiliar;
				if (d < auxiliar.dato) {
					auxiliar = auxiliar.hijoIzquierdo;
					if (auxiliar == null) {
						padre.hijoIzquierdo = nuevo;
						return;
					}
				} else {
					auxiliar = auxiliar.hijoDerecho;
					if (auxiliar == null) {
						padre.hijoDerecho = nuevo;
						return;
					}
				}
			}
		}
	}

	/**
	 * Metodo para conocer si el arbol se encuentra vacio
	 * 
	 * @return
	 */
	public boolean estaVacio() {
		return raiz == null;
	}
	
	/**
	 * Metodo usado para recorrer el arbol en InOrden
	 * @param nodoArbol
	 */
	public void inOrden (NodoArbol nodoArbol) {
		if(nodoArbol != null ) {
			inOrden(nodoArbol.hijoIzquierdo);
			System.out.println(nodoArbol.hijoIzquierdo);
			inOrden(nodoArbol.hijoDerecho);
		}
	}

	/**
	 * Metodo usado para recorrer el arbol en preOrden
	 * @param nodoArbol
	 */
	public void preOrden (NodoArbol nodoArbol) {
		if(nodoArbol != null) {
			System.out.println(nodoArbol.dato);
			inOrden(nodoArbol.hijoIzquierdo);
			inOrden(nodoArbol.hijoDerecho);
		}
	}
	
	/**
	 * Metodo usado para recorree el arbol en PosOrde
	 * @param nodoArbol
	 */
	public void posOrden (NodoArbol nodoArbol) {
		if(nodoArbol != null) {
			posOrden(nodoArbol.hijoIzquierdo);
			posOrden(nodoArbol.hijoDerecho);
			System.out.println(nodoArbol.dato);
		}
	}
}

