package com.company.aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta; // ponta tem acesso private. não podemos acessar apenas com a instancia, é necesario metodos de acesso.
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Esta tampada?: " + this.tampada);
        System.out.println("Quantidade de carga: " + this.carga);
    }

    public void rabiscar() {
        if (this.tampada) { // this pode ser c1 ou c2, vai depender da instancia
            System.out.println("ERRO! Não pode rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar() {
        this.tampada = true;//this é uma referencia ao objeto que esta chamando este metodo.
    }

    protected void destampar() {
        this.tampada = false;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPonta() {
        return this.modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
}
