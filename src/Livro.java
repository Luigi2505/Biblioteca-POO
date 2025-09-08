public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String ISBN;
    private int quantidade;

    public Livro(String titulo, String autor, int ano, String ISBN, int quantidade){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAno() {
        return ano;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        if(quantidade < 0) {
            System.out.println("Valor Inválido");
        }
        else {
            this.quantidade = quantidade;
        }
    }

    public String toString(){
        return getTitulo() + " | " + getAutor() + " | " + getAno() + " | " + getISBN() + " | " + getQuantidade();
    }






}
