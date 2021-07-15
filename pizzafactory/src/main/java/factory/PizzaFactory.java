package factory;

public class PizzaFactory {

    public static Pizza createPizza(String type){
        Pizza p = null;
        if(type == "veg")
        {
            p = new VegPizza();
        }
        else if (type == "cheese")
        {
            p = new CheesePizza();
        }
        else if (type == "chicken")
        {
            p = new ChickenPizza();
        }
        else
            p = new PanFryPizza();
    return p;

}}
