public class Livro {
    private int id;
    private String titulo;
    private int lancamento;
    private int quantidade;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Livro(int id, String titulo, int lancamento, int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.lancamento = lancamento;
        this.quantidade = quantidade;
    }


}
