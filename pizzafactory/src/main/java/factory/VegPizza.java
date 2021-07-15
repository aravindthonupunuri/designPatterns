package factory;

public class VegPizza implements Pizza{

    @Override
    public void preapre() {
        System.out.println("preapare veg pizza");

    }

    @Override
    public void bake() {
        System.out.println("bake veg pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut veg pizza");}
}
