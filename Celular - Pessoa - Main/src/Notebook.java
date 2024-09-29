public class Notebook {
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    private double preco;
    private int capacidadeBateria;
    private String sistemaOperacional;
    private boolean tem5G;

    public Notebook() {
    }

    public Notebook(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public Notebook(String modelo, String marca, int ano, String cor, double preco, int capacidadeBateria, String sistemaOperacional, boolean tem5G) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.capacidadeBateria = capacidadeBateria;
        this.sistemaOperacional = sistemaOperacional;
        this.tem5G = tem5G;
    }

    public void ligar() {
        System.out.println("O Notebook está ligado.");
    }

    public void desligar() {
        System.out.println("O Notebook está desligado.");
    }

    public void carregar() {
        System.out.println("O Notebook está carregando.");
    }

    public void tirarFoto() {
        System.out.println("Tirando foto com o Notebook.");
    }

    public void mostrarInformacoes() {
        System.out.println("Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano);
    }

    public void alterarCor(String novaCor) {
        this.cor = Black;
        System.out.println("O Notebook agora está na cor " + Black);
    }

    public void instalarAplicativo(String nomeApp) {
        System.out.println("Instalando o aplicativo " + nomeApp + " no Notebook.");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public boolean isTem5G() {
        return tem5G;
    }

    public void setTem5G(boolean tem5G) {
        this.tem5G = tem5G;
    }
}
