//Clase que representa una pizza dentro del sistema
public class Pizza {
    
    String nombre;
    String[] ingredientes;

    //Constructor que recibe el nombre y los ingredientes
    public Pizza(String nombre, String[] ingredientes){
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    //Muestra la pizza en consola
    public void mostrarPizza(){
        System.out.println("Pizza: " + nombre);

        for (int i=0; i < ingredientes.length; i++){
            System.out.println("- " + ingredientes[i]);
        }
    }
}
