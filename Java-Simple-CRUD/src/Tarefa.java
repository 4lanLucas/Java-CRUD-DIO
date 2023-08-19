public class Tarefa {
    //atributos
    private String descricao;

    //métodos

    public Tarefa(String descricao)
    {this.descricao = descricao;}

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
