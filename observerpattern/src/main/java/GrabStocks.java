import java.util.ArrayList;

interface Subject {

    public void register(Observer o);
    public void notifyObserver();

}
interface Observer {

    public void update(double ibmPrice, double aaplPrice, double googPrice);

}
class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){

        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {

        observers.add(newObserver);

    }


    public void notifyObserver() {



        for(Observer observer : observers){

            observer.update(ibmPrice, aaplPrice, googPrice);

        }
    }



    public void setIBMPrice(double newIBMPrice){

        this.ibmPrice = newIBMPrice;

        notifyObserver();

    }

    public void setAAPLPrice(double newAAPLPrice){

        this.aaplPrice = newAAPLPrice;

        notifyObserver();

    }

    public void setGOOGPrice(double newGOOGPrice){

        this.googPrice = newGOOGPrice;

        notifyObserver();

    }

}
class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){


        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);



        stockGrabber.register(this);

    }



    public void update(double ibmPrice, double aaplPrice, double googPrice) {

        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();

    }

    public void printThePrices(){

        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");

    }

}
public class GrabStocks{

    public static void main(String[] args){

        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(676.40);


    }

}