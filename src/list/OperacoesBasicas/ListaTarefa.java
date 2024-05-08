package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listTarefa;

    public ListaTarefa(){
        this.listTarefa = new ArrayList<>();
    }

    public void adicionaTarefa( String descricao ){
        listTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa( String descricao ){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listTarefa){
            if( t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        listTarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listTarefa.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listTarefa);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionaTarefa("tarefa 1");
        listaTarefa.adicionaTarefa("tarefa 2");
        listaTarefa.adicionaTarefa("tarefa 3");
        System.out.println("numero total " + listaTarefa.obterNumeroTotalTarefas());
        
        
        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("numero total " + listaTarefa.obterNumeroTotalTarefas());
    
        listaTarefa.obterDescricoesTarefas();
    
    }       

}
