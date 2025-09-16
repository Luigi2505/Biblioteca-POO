public class Emprestimo {
    private Usuario usuario;
    private Livro livro;

    public Emprestimo(Usuario usuario, Livro livro){
        this.usuario = usuario;
        this.livro = livro;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void emprestar() {
        int qntd = livro.getQuantidade();
        if (qntd <= 0) {
            System.out.println("Livro Indisponível");
        }
        else {
            qntd -= 1;
            livro.setQuantidade(qntd);
            System.out.println("Livro Emprestado");
            System.out.println(usuario.getNome() + " | Prazo para devolução: " + usuario.getPrazoDevolucao() + " dias");
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
