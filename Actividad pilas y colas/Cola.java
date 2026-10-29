
public class Cola {

    private static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }
    private Nodo frente;
    private Nodo fin;
    // Constructor: inicia la cola vacía
    public Cola() {
        frente = null;
        fin = null;
    }
    // Comprueba si la cola está vacía
    public boolean estaVacia() {
        return frente == null;
    }
    // Agrega un elemento al final
    public void encolar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }
    // Elimina y devuelve el primer elemento
    public int desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return valor;
    }
    // Consulta el primer elemento
    public int verFrente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }
    // Cuenta los elementos de la cola
    public int tamano() {
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }
    // Muestra los elementos de la cola
    public void imprimir() {
        Nodo actual = frente;
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return;
        }
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
