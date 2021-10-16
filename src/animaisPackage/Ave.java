package animaisPackage;

public class Ave extends Animal {

    private String cor;

    public Ave(){
        this.setTipoAnimal("Ave");
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    @Override
    public void comunicar() {
        System.out.println("piu piu");
    }

    @Override
    public void movimentar() {
        System.out.println("voar");
    }

}
