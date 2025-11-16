public class Agente {
    private String matricula;
    private String nome;
    private String cpf;
    private String telefone;
    private String situacao;
    
    public Agente(String matricula, String nome, String cpf, String telefone, String situacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.situacao = situacao;
    }
    
    public void reprovar() { this.situacao = "Reprovado"; }
    public void aprovar() { this.situacao = "Aprovado"; }
    public void coletar() {}
    public void transportar() {}
    public void entregar() {}
    public void selecionarAgente() {}
    
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}
