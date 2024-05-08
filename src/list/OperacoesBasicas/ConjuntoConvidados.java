package list.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    int contarConvidados(){
        return convidadoSet.size();
    }

    void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    static void main(String[] args) {
        
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " dentro do set de Convidados" );

        conjuntoConvidados.adicionarConvidado("Convidado 1",123);
        conjuntoConvidados.adicionarConvidado("Convidado 2",124);
        conjuntoConvidados.adicionarConvidado("Convidado 3",125);
        
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " dentro do set de Convidados" );

        conjuntoConvidados.removerConvidadoPorCodigoConvite(124);

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " dentro do set de Convidados" );
        
        conjuntoConvidados.exibirConvidados();




    }

}
