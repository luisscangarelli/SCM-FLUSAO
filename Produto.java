import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private String situacao;
    private List<Item> itens;
    
    public Produto(int id, String nome, int quantidade, String situacao) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.situacao = situacao;
        this.itens = new ArrayList<>();
    }
    
    public void cadastrarProduto() {}
    public void selecionarProduto() {}
    public void atualizar() {}
    public void aprovar() { this.situacao = "Aprovado"; }
    public void reservar() { this.situacao = "Reservado"; }
    public void cancelar() { this.situacao = "Cancelado"; }
    public void vender() {}
    public void devolver() {}
    public void retornarAoEstoque() { this.situacao = "Disponível"; }
    public void adicionarItem(Item item) { itens.add(item); }
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }
    public List<Item> getItens() { return itens; }
}
