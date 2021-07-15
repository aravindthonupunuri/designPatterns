
class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;


    public Flys flyingType;
    public String tryToFly(){

        return flyingType.fly();

    }
    public void setFlyingAbility(Flys newFlyType){

        flyingType = newFlyType;

    }

}

class Dog extends Animal {

    public void digHole() {

        System.out.println("Dug a hole");

    }

    public Dog() {


        flyingType = new CantFly();

    }
}
class Bird extends Animal{


    public Bird(){

        flyingType = new ItFlys();

    }

}
interface Flys {

    String fly();

}



class ItFlys implements Flys{

    public String fly() {

        return "Flying High";

    }

}

class CantFly implements Flys{

    public String fly() {

        return "I can't fly";

    }

}
public class AnimalPlay{

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());



        sparky.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + sparky.tryToFly());

    }

}

