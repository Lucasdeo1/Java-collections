package list.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    void adicionarContato( String nome, int numero ){
        contatoSet.add(new Contato(nome,numero));
    }

    void exibirContatos(){
        System.out.println(contatoSet);
    }

    Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato contato : contatoSet) {
            if(contato.getNome().startsWith(nome))
                contatosPorNome.add(contato);
        }
        return contatosPorNome;
    }

    Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for (Contato contato : contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Lucas", 123456789);
        agendaContatos.adicionarContato("Victor", 876543210);
        agendaContatos.adicionarContato("Leandro", 24681012);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Victor"));

        System.out.println("Contato atualizado: "+ agendaContatos.atualizarNumeroContato("Victor", 12345));
    }
    
    
}
