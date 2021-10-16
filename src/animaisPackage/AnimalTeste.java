package animaisPackage;

public class AnimalTeste {

    public static void main(String[] args) {

        Ave bemTeVi = new Ave();
        Cachorro doberman = new Cachorro();

        System.out.println("Acoes e dados do animal 1");
        System.out.println(bemTeVi.getTipoAnimal());
        bemTeVi.setCor("amarelo e verde");
        bemTeVi.setQtdPatas(2);
        bemTeVi.comunicar();
        bemTeVi.movimentar();
        System.out.println(bemTeVi.getCor());

        System.out.println("Acoes e dados do animal 2");
        System.out.println(doberman.getTipoAnimal());
        doberman.setPorte("grande");
        doberman.comunicar();
        doberman.movimentar();
        System.out.println(doberman.getPorte());

    }
}
