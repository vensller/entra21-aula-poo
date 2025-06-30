public class Produto {
    String nome;
    Double preco;
    Integer quantidade;

    void exibirDetalhes() {
        System.out.println(nome + " R$" + preco + " - " + quantidade + " unidades");
    }

    void vender(Integer unidades) {
        System.out.println("Vendendo " + unidades + " unidades de " + nome);
       quantidade = quantidade - unidades;
    }

    void repor(Integer unidades) {
        System.out.println("Repondo " + unidades + " unidades de " + nome);
        quantidade = quantidade + unidades;
    }
}
