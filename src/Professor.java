public class Professor extends Usuario{

    public Professor(String nome, int ID){
        super(nome, ID);
    }
    public int getPrazoDevolucao(){
        return 30;
    }
}
