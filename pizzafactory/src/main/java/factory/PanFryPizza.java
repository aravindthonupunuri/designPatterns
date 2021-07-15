package factory;

public class PanFryPizza implements  Pizza {
    @Override
    public void preapre() {
        System.out.println("preapre panfry pizza");

    }

    @Override
    public void bake() {
        System.out.println("bake panfry pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut panfry pizza");
    }
}