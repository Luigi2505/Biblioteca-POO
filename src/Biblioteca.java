import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();


    public Biblioteca(){
    }

    public void adicionarLivros(Livro livro){
        livros.add(livro);
    }
    public void removerLivros(Livro livro){
        livros.remove(livro);
    }

    public void adicionarEmprestimos(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }
    public void removerEmprestimos(Emprestimo emprestimo){
        emprestimos.remove(emprestimo);
    }

    public void adicionarUsuarios(Usuario usuario){
        usuarios.add(usuario);
    }
    public void removerUsuarios(Usuario usuario){
        usuarios.remove(usuario);
    }


    public void listarLivros(){
        System.out.println("Livros Cadastrados: ");
        for(int i = 0; i < livros.size(); i++){
            System.out.println(livros.get(i));
        }
    }

    public void listarEmprestimos(){
        System.out.println("Empréstimos Ativos: ");
        for(int i = 0; i < emprestimos.size(); i++){
            System.out.println(emprestimos.get(i));
        }
    }

    public void listarHistoricoUsuario(Usuario usuario) {
        System.out.println("Histórico do Usuário: " + usuario.getNome() + " : ");
        boolean encontrou = false;
        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo emprestimo = emprestimos.get(i);
            if (emprestimo.getUsuario().getID() == usuario.getID()) {
                System.out.println(emprestimo.toString());
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum empréstimo encontrado para este usuário.");
        }
    }
}



