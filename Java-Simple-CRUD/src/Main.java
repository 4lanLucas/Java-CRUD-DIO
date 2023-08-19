//classe principal:
public class Main {
    //método principal:
    public static void main(String[] args) {
        //instanciando uma nova lista de tarefas:
        ListaTarefa listaDeTarefas = new ListaTarefa();
        //adicionando novas tarefas:
        listaDeTarefas.adicionarTarefa("tarefa 1");
        listaDeTarefas.adicionarTarefa("tarefa 1");
        listaDeTarefas.adicionarTarefa("tarefa 2");
        //removendo tarefa com título de tarefa 1:
        listaDeTarefas.removerTarefa("tarefa 1");
        //mostrando todas as tarefas:
        listaDeTarefas.mostrarTarefas();
    }
}