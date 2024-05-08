package list.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    Produto( String nome,long cod,double preco,int quantidade){
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    String getNome() {
        return nome;
    }

    long getCod() {
        return cod;
    }

    double getPreco() {
        return preco;
    }

    int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Produto produto)) return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public String toString() {
        return nome +" ," + cod +" ," + preco + " ," + quantidade;
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }      
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(),p2.getPreco());
    }
}