public class Pedido {
    private Itens i;

    public Pedido(String i) {
        this.i = new Itens(i);
        System.out.println("Pedido criado com o item: " + this.i.nome);
    }
}
