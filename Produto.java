package programa;

public class Produto {
    public String nome;
    public int codigo;
    public float valor;
    public int quantidadeEstoque;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    @Override
    public String toString() {
        return "Produto: " + nome + "\nCódigo: " + codigo + "\nValor"
        + valor + "\nEstoque:" + quantidadeEstoque;
    }

    
    
}
