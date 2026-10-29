
public class Main {

    public static void main(String[] args) {

        // Prueba de la pila
        Pila pila = new Pila();

        System.out.println("===== PILA =====");

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Elementos de la pila:");
        pila.imprimir();

        System.out.println("Elemento superior: " + pila.peek());
        System.out.println("Elemento eliminado: " + pila.pop());
        System.out.println("Tamaño de la pila: " + pila.tamano());

        // Prueba de la cola
        Cola cola = new Cola();

        System.out.println();
        System.out.println("===== COLA =====");

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        System.out.println("Elementos de la cola:");
        cola.imprimir();

        System.out.println("Primer elemento: " + cola.verFrente());
        System.out.println("Elemento eliminado: " + cola.desencolar());
        System.out.println("Tamaño de la cola: " + cola.tamano());
    }
}
