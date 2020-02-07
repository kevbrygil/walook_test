public class Client {
    //atributos
    private String name;
    // Variable para enlazar los clientes.
    private Client next;
    //Constructor
    public void Client(){
        this.name = "";
        this.next = null;
    }
    // Métodos get y set para los atributos.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Client getNext() {
        return next;
    }
    public void setNext(Client next) {
        this.next = next;
    }
}
