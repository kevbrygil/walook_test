
//import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.push("Jorge");
        // pila.push("Alberto");
        // pila.push("Pedro");
        // pila.push("Perla");
        // pila.push("Ana");

        System.out.println("-----Pila------");
        pila.list();
        System.out.println("Size: " + pila.getSize());

        System.out.println("----POP-----");
        pila.pop();
        pila.list();
        System.out.println("Size: " + pila.getSize());

        System.out.println("----TOP-----");
        try {
          System.out.println("Size: " + pila.top());
        }
        catch(Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("----Es vacia?----");
        System.out.println(pila.isEmpty());

    }
}
