package lojaMelhorGrupo.principal;

public class Estoque{

    // Area dos atributos
    private int quantidade;
    private String armazem;
    private String numeroDaPrateleira;
    private String nomeDoProduto;
    private double precoNoEstoque;


    // Area dos Construtores

    public Estoque(){}

    public Estoque(int quantidade, String armazem, String numeroDaPrateleira, String nomeDoProduto, Double precoNoEstoque) {
        this.quantidade = quantidade;
        this.armazem = armazem;
        this.numeroDaPrateleira = numeroDaPrateleira;
        this.nomeDoProduto = nomeDoProduto;
        this.precoNoEstoque = precoNoEstoque;
    }

    // Area dos Gets and setters


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getArmazem() {
        return armazem;
    }

    public void setArmazem(String armazem) {
        this.armazem = armazem;
    }

    public String getNumeroDaPrateleira() {
        return numeroDaPrateleira;
    }

    public void setNumeroDaPrateleira(String numeroDaPrateleira) {
        this.numeroDaPrateleira = numeroDaPrateleira;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPrecoNoEstoque() {
        return precoNoEstoque;
    }

    public void setPrecoNoEstoque(double precoNoEstoque) {
        this.precoNoEstoque = precoNoEstoque;
    }
}
