package poo;

public interface CarroPai {

    public void acelerar(int velocidade);

    default public void freia() {
        this.acelerar(0);
    }

}
