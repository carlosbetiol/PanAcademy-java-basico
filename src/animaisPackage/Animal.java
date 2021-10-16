package animaisPackage;

public class Animal {

    private String tipoAnimal;
    private String sexo;
    private boolean vertebrado;
    private int qtdPatas;

    public void setTipoAnimal(String tipoAnimal){
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipoAnimal() {
        return this.tipoAnimal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isVertebrado() {
        return vertebrado;
    }

    public void setVertebrado(boolean vertebrado) {
        this.vertebrado = vertebrado;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public void comunicar(){
        System.out.println("comunicou de forma generica");
    }


    public void movimentar(){
        System.out.println("movimentou de forma generica");
    }

}
