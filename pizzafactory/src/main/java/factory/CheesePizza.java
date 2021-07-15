package factory;

public class CheesePizza implements Pizza {
    @Override
    public void preapre() {
        System.out.println("preapare cheese pizza");

    }

    @Override
    public void bake() {
        System.out.println("bake cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut cheese pizza");}
}
