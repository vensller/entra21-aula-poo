public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a loja de produtos");
        Produto camiseta = new Produto();
        camiseta.nome = "Regata GG Tommy";
        camiseta.preco = 219.99;
        camiseta.quantidade = 10;
        camiseta.exibirDetalhes();
        camiseta.vender(15);
        camiseta.exibirDetalhes();
        camiseta.repor(20);
        camiseta.exibirDetalhes();

        Produto calca = new Produto();
        calca.nome = "Calça 44 Levis";
        calca.preco = 272.93;
        calca.quantidade = 7;
        calca.exibirDetalhes();
        calca.vender(3);
        calca.exibirDetalhes();
        calca.repor(6);
        calca.exibirDetalhes();
    }
}