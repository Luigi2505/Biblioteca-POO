public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("A Metamorfose", "Franz Kafka",1912, "978-8571646858", 2);
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 1899, "978-8573263565", 3);

        Usuario u1 = new Usuario("Luigi", 1, true);
        Usuario u2 = new Usuario("Gui", 2, false);

        Emprestimo e1 = new Emprestimo(u1, l1);
        Emprestimo e2 = new Emprestimo(u2, l2);z

        Biblioteca b1 = new Biblioteca();

        b1.adicionarLivros(l1);
        b1.adicionarLivros(l2);

        e1.emprestar();
        b1.adicionarEmprestimos(e1);

        e2.emprestar();
        b1.adicionarEmprestimos(e2);

        b1.listarLivros();
        b1.listarEmprestimos();




    }
}