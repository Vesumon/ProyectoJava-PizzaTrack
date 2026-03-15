//Nodo utilizado para construir la lista ligada de la pila
public class Nodo {
    Pizza pizza;
    Nodo siguiente;

    public Nodo(Pizza pizza){
        this.pizza = pizza;
        this.siguiente = null;
    }
}
