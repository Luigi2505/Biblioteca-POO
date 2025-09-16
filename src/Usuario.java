public class Usuario {
    private String nome;
    private int ID;

    public Usuario(String nome, int ID){
        this.nome = nome;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public int getID() {
        return ID;
    }

    public int getPrazoDevolucao(){
        return 7;
    }
}
