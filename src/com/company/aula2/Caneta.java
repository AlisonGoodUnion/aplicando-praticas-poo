package com.company.aula2;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Esta tampada?: " + this.tampada);
        System.out.println("Quantidade de carga: " + this.carga);
    }

    void rabiscar() {
        if (this.tampada) { // this pode ser c1 ou c2, vai depender da instancia
            System.out.println("ERRO! Não pode rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;//this é uma referencia ao objeto que esta chamando este metodo.
    }

    void destampar() {
        this.tampada = false;
    }

}
