package poo;

import poo.Carro;

public class Teste {

    public static void main(String[] args) {
        Carro c = new Carro();
        c.setModelo("f40");
        c.acelerar(100);
        System.out.println(c.getVelocidade());
        c.freia();

        System.out.println(c.getVelocidade());
    }
}
