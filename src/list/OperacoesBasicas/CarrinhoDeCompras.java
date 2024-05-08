package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoCompra;//lista de carrinho de compra 

    public CarrinhoDeCompras(){
        this.carrinhoCompra = new ArrayList<>();
    }

    public void adicionarItem( String nome, double preco, int quantidade ){
        carrinhoCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem( String nome ){
        List<Item>carrinhoParaRemocao = new ArrayList<>();

        for ( Item compras : carrinhoCompra ) {
            if ( compras.getNome().equals(nome) ) {
                carrinhoParaRemocao.add( compras );
            }
        }
        carrinhoCompra.removeAll( carrinhoParaRemocao );
    }

    public double calcularValorTotal(){
        double total = 0.0;
        for (Item compras : carrinhoCompra) {
            total += compras.getPreco() * compras.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompra);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("caixa de leite", 5.00, 1);
        carrinhoDeCompras.adicionarItem("iogurte", 7.00, 3);
        
        System.out.println("total: R$" + carrinhoDeCompras.calcularValorTotal() + "0" );
        carrinhoDeCompras.removerItem("iogurte");
        System.out.println("total: R$" + carrinhoDeCompras.calcularValorTotal() + "0" );

        carrinhoDeCompras.exibirItens();

    
    }
}
