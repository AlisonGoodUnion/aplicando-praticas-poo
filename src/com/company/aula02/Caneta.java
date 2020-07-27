package com.company.aula2;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

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

    public void tampar() {
        this.tampada = true;//this é uma referencia ao objeto que esta chamando este metodo.
    }

    public void destampar() {
        this.tampada = false;
    }

}
