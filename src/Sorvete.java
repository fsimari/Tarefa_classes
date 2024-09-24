// Classe Sorvete representa um objeto do mundo real
class Sorvete {
    private String sabor;
    private String cor;
    private int tamanho;
    private float preco;

    /**
     *
     * @param sabor   O sabor do sorvete.
     * @param cor     A cor do sorvete.
     * @param tamanho O tamanho do sorvete em ml.
     * @param preco   O preço do sorvete.
     */
    public Sorvete(String sabor, String cor, int tamanho, float preco) {
        this.sabor = sabor;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    // Métodos Get e Set para as propriedades

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // metodo para mostrar as informações do sorvete
    public void mostrarInfo() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho + " ml");
        System.out.println("Preço: R$" + (preco ));
    }

}