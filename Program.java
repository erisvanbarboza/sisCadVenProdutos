package programa;

import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void segurarTela(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("pause");
            }
        } catch (InterruptedException | IOException i) {
            System.err.println(i.getMessage());
        }
    }

    public static void limparTela(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (InterruptedException | IOException i) {
            System.err.println(i.getMessage());
        }
    }

    

    // public static void cadastrar() {
    //     Scanner in = new Scanner(System.in);

    //     ArrayList<Produto> produtos = new ArrayList<>();
        
    //     System.out.println("Insira o nome do produto a ser cadastrado: ");
    //     String nome = in.nextLine();

    //     System.out.println("Insira o código produto a ser cadastrado: ");
    //     int codigo = in.nextInt();

    //     System.out.println("Insira o valor do produto: R$ ");
    //     float valor = in.nextFloat();

    //     System.out.println("Insira a quantidade em estoque: ");
    //     int quantidadeEstoque = in.nextInt();

    //     Produto produto = new Produto();
    // }
    
    // public static void consultar(){
    //     Scanner in = new Scanner(System.in);
    //     if (produtos == null) {
    //         System.out.println("Não há produtos cadastrados.");
    //         segurarTela();
    //     } else {
    //         System.out.println("Digite o código do produto que está procurando: ");
    //         String codigo = in.nextLine();

    //         Produto produtos = null;
    //         if (produtos.getCodigo().equals(codigo)){
    //             System.out.println("Produto encontrado: " + produtos.getNome());
    //         } else{
    //             System.out.println("Código de produto não encontrado!");
    //         }
    //     }
    // }




    public static void main(String[] args) {
        int opcao;
        Cadastro novoCadastro = new Cadastro();
        Scanner in = new Scanner(System.in);

        do {
            limparTela();
            System.out.println("System developed by ERISVAN BARBOZA SOFTWARE S.A.\n");
            System.out.println("*** ===== MENU ===== ***");
            System.out.println("1 - Cadastrar produto.");
            System.out.println("2 - Consultar produto.");
            System.out.println("3 - Listar produtos cadastrados.");
            System.out.println("4 - Vendas por período (detalhado).");
            System.out.println("5 - Realizar venda.");
            System.out.println("0 - Sair.");
            System.out.print("OPÇÃO DIGITADA: ");
            opcao = in.nextInt();
            switch (opcao) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    novoCadastro.cadastrar();
                    break;
                case 2:
                    novoCadastro.consultar();
                    break;
                case 3:
                    novoCadastro.listar();
                    break;
                case 4:
                    // alocarEspaco();
                    break;
                default:
                    System.out.println("*** ERRO! Digite uma opção válida! ***");
                    segurarTela();
            }
        } while (opcao != 0);
    }
    
}
