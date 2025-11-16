public class Pais {
    private int id;
    private String nome;
    private String lingua;
    private String continente;
    
    public Pais(int id, String nome, String lingua, String continente) {
        this.id = id;
        this.nome = nome;
        this.lingua = lingua;
        this.continente = continente;
    }
    
    public void selecionarCidade() {}
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLingua() { return lingua; }
    public void setLingua(String lingua) { this.lingua = lingua; }
    public String getContinente() { return continente; }
    public void setContinente(String continente) { this.continente = continente; }
}
