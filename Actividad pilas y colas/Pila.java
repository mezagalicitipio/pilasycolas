
public class Pila {

    private static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
    private Nodo tope;
    // Constructor: inicia la pila vacía
    public Pila() {
        tope = null;
    }
    // Comprueba si la pila está vacía
    public boolean estaVacia() {
        return tope == null;
    }
    // Agrega un elemento a la pila
    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }
    // Elimina y devuelve el elemento superior
    public int pop() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        int valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }
    // Consulta el elemento superior sin eliminarlo
    public int peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return tope.dato;
    }
    // Cuenta los elementos de la pila
    public int tamano() {
        int contador = 0;
        Nodo actual = tope;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }
    // Muestra los elementos de la pila
    public void imprimir() {
        Nodo actual = tope;

        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return;
        }
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
