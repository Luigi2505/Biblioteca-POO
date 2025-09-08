import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    //Construtor
    public Biblioteca(){
    }

    //Adicionar e remover na lista de livros
    public void adicionarLivros(Livro livro){
        livros.add(livro);
    }
    public void removerLivros(Livro livro){
        livros.remove(livro);
    }

    //Adicionar e remover na lista de emprestimos
    public void adicionarEmprestimos(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }
    public void removerEmprestimos(Emprestimo emprestimo){
        emprestimos.remove(emprestimo);
    }

    //Adicionar e remover na lista de usuários
    public void adicionarUsuarios(Usuario usuario){
        usuarios.add(usuario);
    }
    public void removerUsuarios(Usuario usuario){
        usuarios.remove(usuario);
    }

    //Listar
    public void listarLivros(){
        for(int i = 0; i < livros.size(); i++){
            System.out.println(livros.get(i));
        }
    }

    public void listarEmprestimos(){
        for(int i = 0; i < emprestimos.size(); i++){
            System.out.println(emprestimos.get(i));
        }
    }




}
