package factory;

public class PizzaStore {

//public static
Pizza OrderPizza (String type) {

    Pizza pizza = PizzaFactory.createPizza(type);

    pizza.preapre();
    pizza.bake();
    pizza.cut();

    return pizza;


}
}
