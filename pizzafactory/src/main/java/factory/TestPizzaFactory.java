package factory;

public class TestPizzaFactory {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.OrderPizza("chicken");
        pizzaStore.OrderPizza("veg");
       // pizzaStore.OrderPizza("efe");

    }
}
