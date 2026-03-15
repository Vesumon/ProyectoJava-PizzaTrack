import java.util.Scanner;

//Clase principal del sistema PizzaTrack
public class GestionPedidos {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Pila principal donde se guardan los pedidos
        Pila pilaUndo = new Pila();

        //Pila secundaria para rehacer pedidos
        Pila pilaRedo = new Pila();

        int opcion;

        do{

            System.out.println("\n--- PIZZA TRACK ---");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("Nombre de la pizza: ");
                    String nombre = sc.nextLine();

                    String[] ingredientes = new String[3];

                    for (int i = 0; i < 3; i++){
                        System.out.print("Ingrediente " + (i + 1) + ": ");
                        ingredientes[i] = sc.nextLine();
                    }

                    Pizza pizza = new Pizza(nombre, ingredientes);

                    pilaUndo.push(pizza);

                    System.out.println("Pizza registrada correctamente.");

                    break;
            
                case 2:
                    
                    Pizza deshecha = pilaUndo.pop();

                    if (deshecha != null) {

                        pilaRedo.push(deshecha);
                        System.out.println("Pedido deshecho.");
                        
                    } else {

                        System.out.println("No hay pedidos para deshacer.");

                    }

                    break;

                case 3:

                    Pizza rehacer = pilaRedo.pop();

                    if (rehacer != null){

                        pilaUndo.push(rehacer);
                        System.out.println("Pedido recuperado.");

                    } else {

                        System.out.println("No hay pedidos registrados.");

                    }

                    break;

                case 4:

                    Pizza actual = pilaUndo.peek();

                    if (actual != null){

                        System.out.println("\nPedido actual:");
                        actual.mostrarPizza();

                    } else {

                        System.out.println("No hay pedidos registrados.");

                    }

                    break;

                case 0:

                System.out.println("Saliendo del sistema...");

                break;

                default:

                System.out.println("Opción inválida.");

            }

        } while (opcion != 0);
        
        sc.close();
        
    }
}