package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listPessoa;


    public OrdenacaoPessoas(){
        this.listPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);//duplicando lista não ordenada 
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
        
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("nome 1", 20,1.56);
        ordenacaoPessoas.adicionarPessoa("nome 2", 23,1.70);
        ordenacaoPessoas.adicionarPessoa("nome 3", 17,1.56);

        System.out.println(ordenacaoPessoas.listPessoa);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
