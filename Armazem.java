public class Armazem {
    private int id;
    private String nome;
    private Cidade origem;
    private Cidade destino;
    
    public Armazem(int id, String nome, Cidade origem, Cidade destino) {
        this.id = id;
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
    }
    
    public void selecionarArmazem() {}
    public void origem() {}
    public void destino() {}
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Cidade getOrigem() { return origem; }
    public void setOrigem(Cidade origem) { this.origem = origem; }
    public Cidade getDestino() { return destino; }
    public void setDestino(Cidade destino) { this.destino = destino; }
}
