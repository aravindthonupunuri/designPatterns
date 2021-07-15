package factory;

public class ChickenPizza implements Pizza {
    @Override
    public void preapre() {
        System.out.println("preapre chicken pizza");

    }

    @Override
    public void bake() {
        System.out.println("bake chicken pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut chicken pizza");
    }
}
