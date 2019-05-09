import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int opcion = 0;
		int elemento;
		String nombre;
		ArbolBinario arbolito = new ArbolBinario();
		do {
			try {
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Elija una opción! \n"
								+ "1. Agregar un nodo "
								+ "\n 2. InOrden \n "
								+ "3. PreOrden "
								+ "\n 4. PosOrede \n 5.Salir}",
						JOptionPane.QUESTION_MESSAGE));

				switch (opcion) {
				case 1:
					elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número del nodo ",
							"Adiriendo nodo", JOptionPane.QUESTION_MESSAGE));

					nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del nodo", JOptionPane.QUESTION_MESSAGE);

					arbolito.agregarNodo(elemento, nombre);
					break;

				case 2:
					if (!arbolito.estaVacio()) {
						arbolito.inOrden(arbolito.raiz);
					} else {
						JOptionPane.showMessageDialog(null, "El arbol se encuentra vacio", " ",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;

				case 3:
					if (!arbolito.estaVacio()) {
						arbolito.preOrden(arbolito.raiz);
					} else {
						JOptionPane.showMessageDialog(null, "El arbol se encuentra vacio", " ",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;

				case 4:
					if (!arbolito.estaVacio()) {
						arbolito.posOrden(arbolito.raiz);
					} else {
						JOptionPane.showMessageDialog(null, "El arbol se encuentra vacio", " ",
								JOptionPane.INFORMATION_MESSAGE);
					}
					break;
					
				case 5:
					JOptionPane.showMessageDialog(null, "Fin del Juego! ", "Salir", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opción invalida!", "Adventencia!",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Error " + nfe.getMessage());
			}
		} while (opcion != 2);
	}

}
