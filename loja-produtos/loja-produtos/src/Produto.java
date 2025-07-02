public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes() {
        System.out.println(nome + " R$" + preco + " - " + quantidade + " unidades");
    }

    public void vender(Integer unidades) {
        System.out.println("Vendendo " + unidades + " unidades de " + nome);
       quantidade = quantidade - unidades;
    }

    public void repor(Integer unidades) {
        System.out.println("Repondo " + unidades + " unidades de " + nome);
        quantidade = quantidade + unidades;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
