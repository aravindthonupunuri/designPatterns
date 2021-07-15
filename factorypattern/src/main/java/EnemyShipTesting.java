import java.util.Scanner;

class EnemyShip {

    private String name;
    private double speed;
    private double directionX;
    private double directionY;
    private double amtDamage;

    public String getName() { return name; }
    public void setName(String newName) { name = newName; }

    public double getDamage() { return amtDamage; }
    public void setDamage(double newDamage) { amtDamage = newDamage; }

    public void followHeroShip(){

        System.out.println(getName() + " is following the hero");

    }

    public void displayEnemyShip(){

        System.out.println(getName() + " is on the screen");

    }

    public void enemyShipShoots() {

        System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");

    }

}
class UFOEnemyShip extends EnemyShip {

    public UFOEnemyShip(){

        setName("UFO Enemy Ship");

        setDamage(20.0);

    }

}
class RocketEnemyShip extends EnemyShip {

    public RocketEnemyShip(){

        setName("Rocket Enemy Ship");

        setDamage(10.0);

    }

}
class EnemyShipFactory{


    public EnemyShip makeEnemyShip(String newShipType){

        EnemyShip newShip = null;

        if (newShipType.equals("U")){

            return new UFOEnemyShip();

        } else

        if (newShipType.equals("R")){

            return new RocketEnemyShip();

        } else return null;

    }

}
public class EnemyShipTesting {

    public static void main(String[] args){
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.print("What type of ship? (U / R )");

        if (userInput.hasNextLine()){

            String typeOfShip = userInput.nextLine();

            theEnemy = shipFactory.makeEnemyShip(typeOfShip);

            if(theEnemy != null){

                doStuffEnemy(theEnemy);

            } else System.out.print("Please enter U or R next time");

        }


    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){

        anEnemyShip.displayEnemyShip();

        anEnemyShip.followHeroShip();

        anEnemyShip.enemyShipShoots();

    }

}