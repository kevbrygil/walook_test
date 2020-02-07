public class Pila {
    //tope de la pila
    private Client init;
    //variable para el tamaño de la pila
    private int size;
    //constructor
    public void Pila(){
        init = null;
        size = 0;
    }
    //retorna true si el primer cliente no apunta a nada
    public boolean isEmpty(){
        return init == null;
    }
    // determina cuantos elementos(Clients) tiene la pila
    public int getSize(){
        return size;
    }
    //agrega un nuevo cliente a la pila
    public void push(String nombre){
        //definir un nuevo cliente
        Client nuevo = new Client();
        //agrega nombre al cliente
        nuevo.setName(nombre);
        //consulta si la pila esta vacia
        if (isEmpty()) {
            //inicializa la pila con el nuevo cliente
            init = nuevo;
        }
        //de lo contrario agrega el nuevo cliente al init de la pila
        else{
            nuevo.setNext(init);
            init = nuevo;
        }
        //incrementar el contador del tamaño
        size++;
    }
    //elimina el elemento tope de la pila
    public void pop(){
        if (!isEmpty()) {
            //asigna como primer cliente al siguiente de la pila
            init = init.getNext();
            //decrementa contador del tamaño de pila
            size--;
        }
    }
    //consulta el cliente que se encuentra en la cima de la pila
    public String top() throws Exception{
        if(!isEmpty()){
            return init.getName();
        } else {
            throw new Exception("La pila esta vacia.");
        }
    }
    //enlista los elementos de la pila
    public void list(){
        //crea una copia de la pila
        Client copy = init;
        //recorre la pila hasta el ultimo cliente
        while(copy != null){
            System.out.println(copy.getName());
            copy = copy.getNext();
        }
    }
}
