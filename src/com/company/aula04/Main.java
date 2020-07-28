package com.company.aula04;

public class Main {

    public static void main(String[] args) {
        Caneta caneta = new Caneta();
        caneta.status();
        caneta.setModelo("Bic");
//        caneta.modelo = "BIC"; //como o método não é public podemos acessar ele diretamente.
        caneta.setPonta(0.3f);
//        caneta.ponta = "BIC";//ponta has private access, então não conseguimos acesso direto ao atributo.
        caneta.status();

        //antes acessavamos diretamente o atributo, agora acessamos por get
        //então temos o atributo protegido de acesso direto;
        System.out.println("Tenho uma caneta:" + caneta.getModelo());

        //Aqui podemos ver que a caneta esta sendo constuida já com alguns atributos pre preenchidos no construtor.
        Caneta caneta1 = new Caneta();
        caneta1.status();

        //Aqui podemos constuir a caneta com algumas particularidades
        //populando seus valores atraves de um construtor publico.
        Caneta caneta2 = new Caneta("Bic2", "Amarelo", 0.5f);
        caneta1.status();
    }
}
