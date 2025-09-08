public class Usuario {
    private String nome;
    private int ID;
    private boolean isAluno;

    public Usuario(String nome, int ID, boolean isAluno){
        this.nome = nome;
        this.ID = ID;
        this.isAluno = isAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getID() {
        return ID;
    }

    public boolean isAluno() {
        return isAluno;
    }

}
