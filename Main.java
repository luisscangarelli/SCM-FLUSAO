public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais(1, "Brasil", "Português", "América do Sul");
        Cidade sp = new Cidade("SP", "São Paulo", "011", 1, brasil);
        Item item1 = new Item(1, "Processador", 10);
        Produto produto1 = new Produto(1, "Notebook", 5, "Disponível");
        produto1.adicionarItem(item1);
        Armazem armazem1 = new Armazem(1, "Armazém Central", sp, sp);
        Empresa empresa1 = new Empresa("12345678000199", "Transportes Rápidos");
        Agente agente1 = new Agente("AG001", "João Silva", "12345678900", "11999999999", "Ativo");
        Transporte transporte1 = new Transporte("TR001", "2024-11-14", "2024-11-15", "Em trânsito");
        
        System.out.println("Sistema SCM Flusão iniciado!");
        System.out.println("País: " + brasil.getNome());
        System.out.println("Cidade: " + sp.getNome());
        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Agente: " + agente1.getNome());
        System.out.println("\nSistema funcionando corretamente!");
    }
}
