public class Cidade {
    private String sigla;
    private String nome;
    private String ddd;
    private int id;
    private Pais pais;
    
    public Cidade(String sigla, String nome, String ddd, int id, Pais pais) {
        this.sigla = sigla;
        this.nome = nome;
        this.ddd = ddd;
        this.id = id;
        this.pais = pais;
    }
    
    public void selecionarCidade() {}
    
    public String getSigla() { return sigla; }
    public void setSigla(String sigla) { this.sigla = sigla; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDdd() { return ddd; }
    public void setDdd(String ddd) { this.ddd = ddd; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Pais getPais() { return pais; }
    public void setPais(Pais pais) { this.pais = pais; }
}
