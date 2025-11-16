public class Transporte {
    private String codigo;
    private String dtSaida;
    private String dataChegada;
    private String situacao;
    
    public Transporte(String codigo, String dtSaida, String dataChegada, String situacao) {
        this.codigo = codigo;
        this.dtSaida = dtSaida;
        this.dataChegada = dataChegada;
        this.situacao = situacao;
    }
    
    public void cadastrarTransporte() {}
    public void cadastrar() {}
    public void reprovar() { this.situacao = "Reprovado"; }
    public void aprovar() { this.situacao = "Aprovado"; }
    public void suspender() { this.situacao = "Suspenso"; }
    public void cancelarSuspensao() { this.situacao = "Ativo"; }
    public void transportar() {}
    public void armazenar() {}
    public void revisar() {}
    public void concluir() { this.situacao = "Concluído"; }
    
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getDtSaida() { return dtSaida; }
    public void setDtSaida(String dtSaida) { this.dtSaida = dtSaida; }
    public String getDataChegada() { return dataChegada; }
    public void setDataChegada(String dataChegada) { this.dataChegada = dataChegada; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
}
