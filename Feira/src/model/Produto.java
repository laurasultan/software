package model;

public class Produto {
    private long codProduto;
    private String nomeProduto;
    private String infoNutri;
    private boolean fabricado;
    private boolean distribuido;
    private Produtor produtor;
    private int estoque;

    public long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(long codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getInfoNutri() {
        return infoNutri;
    }

    public void setInfoNutri(String infoNutri) {
        this.infoNutri = infoNutri;
    }

    public boolean isFabricado() {
        return fabricado;
    }

    public void setFabricado(boolean fabricado) {
        this.fabricado = fabricado;
    }

    public boolean isDistribuido() {
        return distribuido;
    }

    public void setDistribuido(boolean distribuido) {
        this.distribuido = distribuido;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void receberEstoque(Produtor fornecedor, int qtd) {
        //Implementação do método
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", infoNutri='" + infoNutri + '\'' +
                ", fabricado=" + fabricado +
                ", distribuido=" + distribuido +
                ", produtor=" + produtor +
                ", estoque=" + estoque +
                '}';
    }
}
