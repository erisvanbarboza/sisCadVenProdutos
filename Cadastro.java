package programa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Cadastro {
  
    ArrayList<Produto> cadProdutos = new ArrayList<>();

    Scanner in = new Scanner(System.in);

    public void cadastrar(){

        for (int i = 1; i <= 1; i++){
            Produto produto = new Produto();

            System.out.println("\nDigite o nome do produto: ");
            produto.setNome(in.next());

            System.out.println("Digite o codigo do produto: ");
            produto.setCodigo(in.nextInt());

            System.out.println("Digite o valor do produto: ");
            produto.setValor(Float.parseFloat(in.next()));

            System.out.println("Digite a quantidade em estoque: ");
            produto.setQuantidadeEstoque(in.nextInt());

            System.out.println("\nDigite 1 para confirmar cadastro ou 0 para cancelar\n");
            if (in.nextInt() == 1) {

                cadProdutos.add(produto);

                System.out.printf("\nCadastrado com sucesso.\n");
            } else {
                System.out.printf("\nCadastro não concluído.\n");
            }
        

        }
    }

    public void consultar(){

        Produto produto = new Produto();

        System.out.println("\n========== CONSULTAR PRODUTO ==========");
        System.out.println("Digite o código do produto: ");
        int codigo = in.nextInt();

        if (cadProdutos.equals(codigo)){
            
            System.out.println(produto.toString());

            segurarTela();
        }else {
            System.out.println("Produto não encontrado!");
        }
    }

    public void listar() {
        System.out.println("=========== LISTA DE PRODUTOS ==========");
        if (cadProdutos == null) {
            System.out.println("Não há produtos cadastrados.");
            
            segurarTela();
        } else {
            System.out.println(cadProdutos.size());
        }
    }

    public static boolean contains(String codigo) {
        return false;
    }

    public ArrayList<Produto> getCadProdutos() {
        return cadProdutos;
    }

    public void setCadProdutos(ArrayList<Produto> cadProdutos) {
        this.cadProdutos = cadProdutos;
    }

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
   
}
