// Implementación manual de una pila usando lista ligada
public class Pila {
    
    //Puntero al nodo que está en el tope
    Nodo tope;

    public Pila(){
        tope = null;
    }

    //Verifica si la pila está vacía
    public boolean isEmpty(){
        return tope == null;
    }

    //Inserta una pizza en el tope de la pila
    public void push(Pizza pizza){
        Nodo nuevo = new Nodo(pizza);

        //El nuevo nodo apunta al antiguo tope
        nuevo.siguiente = tope;

        //El tope ahora es el nuevo nodo
        tope = nuevo;
    }

    //Elimina el elemento del tope
    public Pizza pop(){

        if(isEmpty()){
            return null;
        }

        //Guardamos la pizza del nodo superior
        Pizza pizza = tope.pizza;

        // Movemos el tope al siguiente nodo
        tope = tope.siguiente;

        return pizza;
    }

    public Pizza peek(){

        if (isEmpty()) {
            return null;
        }

        return tope.pizza;
    }
}
