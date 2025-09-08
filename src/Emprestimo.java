public class Emprestimo {
    private Usuario usuario;
    private Livro livro;

    public Emprestimo(Usuario usuario, Livro livro){
        this.usuario = usuario;
        this.livro = livro;
    }

    public void emprestar(){
        int qntd = livro.getQuantidade();
        if(qntd <= 0){
            System.out.println("Livro Indisponível");
        }
        else {
            qntd -= 1;
            livro.setQuantidade(qntd);
            System.out.println("Livro Emprestado");
            if(usuario.isAluno()){
                System.out.println("Aluno. Prazo para devolução: 15 dias");
            }
            else{
                System.out.println("Professor. Prazo para devolução: 30 dias");
            }
        }
    }

    public void devolver(){
        int qntd = livro.getQuantidade();
        qntd += 1;
        livro.setQuantidade(qntd);
        System.out.println("Livro Devolvido");
    }

    public String toString(){
        return "Empréstimo realizado por: " + usuario.getNome() + " | Livro: " + livro.getTitulo();
    }

}
