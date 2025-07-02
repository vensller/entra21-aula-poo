public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a loja de produtos");
        Produto camiseta = new Produto(
                "Regata GG Tommy",
                219.99,
                10);
        camiseta.exibirDetalhes();
        camiseta.vender(15);
        camiseta.exibirDetalhes();
        camiseta.repor(20);
        camiseta.exibirDetalhes();

        Produto calca = new Produto(
                "Calça 44 Levis",
                272.93,
                7
        );
        calca.exibirDetalhes();
        calca.vender(3);
        calca.exibirDetalhes();
        calca.repor(6);
        calca.exibirDetalhes();
    }
}