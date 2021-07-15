class ItalianHoagie extends Hoagie{

    String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
    String[] cheeseUsed = { "Provolone" };
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    public void addMeat(){

        System.out.print("Adding the Meat: ");

        for (String meat : meatUsed){

            System.out.print(meat + " ");

        }

    }

    public void addCheese(){

        System.out.print("Adding the Cheese: ");

        for (String cheese : cheeseUsed){

            System.out.print(cheese + " ");

        }

    }

    public void addVegetables(){

        System.out.print("Adding the Vegetables: ");

        for (String vegetable : veggiesUsed){

            System.out.print(vegetable + " ");

        }

    }

    public void addCondiments(){

        System.out.print("Adding the Condiments: ");

        for (String condiment : condimentsUsed){

            System.out.print(condiment + " ");

        }

    }

}


    abstract class Hoagie {

        boolean afterFirstCondiment = false;

        // This is the Template Method
        // Declare this method final to keep subclasses from
        // changing the algorithm

        final void makeSandwich(){

            cutBun();

            if(customerWantsMeat()){

                addMeat();

                // Here to handle new lines for spacing
                afterFirstCondiment = true;

            }

            if(customerWantsCheese()){

                if(afterFirstCondiment) { System.out.print("\n"); }

                addCheese();

                afterFirstCondiment = true;

            }

            if(customerWantsVegetables()){

                if(afterFirstCondiment) { System.out.print("\n"); }

                addVegetables();

                afterFirstCondiment = true;

            }

            if(customerWantsCondiments()){

                if(afterFirstCondiment) { System.out.print("\n"); }

                addCondiments();

                afterFirstCondiment = true;

            }

            wrapTheHoagie();

        }



        abstract void addMeat();
        abstract void addCheese();
        abstract void addVegetables();
        abstract void addCondiments();

        public void cutBun(){

            System.out.println("The Hoagie is Cut");

        }



        boolean customerWantsMeat() { return true; }
        boolean customerWantsCheese() { return true; }
        boolean customerWantsVegetables() { return true; }
        boolean customerWantsCondiments() { return true; }

        public void wrapTheHoagie(){

            System.out.println("\nWrap the Hoagie");

        }

        public void afterFirstCondiment(){

            System.out.println("\n");

        }

    }
class VeggieHoagie extends Hoagie{

    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    boolean customerWantsMeat() { return false; }
    boolean customerWantsCheese() { return false; }

    public void addVegetables(){

        System.out.print("Adding the Vegetables: ");

        for (String vegetable : veggiesUsed){

            System.out.print(vegetable + " ");

        }

    }

    public void addCondiments(){

        System.out.print("Adding the Condiments: ");

        for (String condiment : condimentsUsed){

            System.out.print(condiment + " ");

        }

    }

    void addMeat() {}

    void addCheese() {}


}
public class SandwichSculptor {

    public static void main(String[] args){

        ItalianHoagie cust12Hoagie = new ItalianHoagie();

        cust12Hoagie.makeSandwich();

        System.out.println();

        VeggieHoagie cust13Hoagie = new VeggieHoagie();

        cust13Hoagie.makeSandwich();

    }

}