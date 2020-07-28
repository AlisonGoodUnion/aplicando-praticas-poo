package com.company.aula02;

public class Main {

    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.cor = "Azul";
//        caneta1.ponta = 0.5f; //apos mudar o atributo para private não podemos modificar o valor.
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();

        Caneta caneta2 = new Caneta();
        caneta2.modelo = "Bick";
        caneta2.cor = "Preta";
        caneta2.destampar();

        //como temos 2 intancias do objeto caneta cada uma se comporta
        //de maneira diferente.
        caneta1.rabiscar();
        caneta2.rabiscar();
        caneta2.status();
        caneta2.carga =10;
//        caneta2.tampada = true; // atributo private n podemos acessar. devemos utilizar os metodos
        caneta2.tampar();
        caneta2.status();
        caneta2.destampar();
        caneta2.status();

        caneta2.rabiscar();//caso o método seja private, não podemos acessar o método.
    }
}
