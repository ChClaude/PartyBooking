package Party;

/**
 * DinnerParty.java
 * Term 4 2018 Assignment 1 – This is the worker class
 *
 * @author Claude DE-TCHAMBILA (217035027)
 * @author Harmony MOUSSOUNDI (218293992)
 * Date: 17 October 2018
 */
public class DinnerParty extends Party{

    private String dinnerChoice;

    public DinnerParty(int numberOfGuests, double costPerHead, String address, String dinnerChoice) {
        super(numberOfGuests, costPerHead, address);
        this.dinnerChoice = dinnerChoice;
    }

    public String getDinnerChoice(){
        return dinnerChoice;
    }

    //Implementing abstract methods
    @Override
    public double calculateCost() {
        double dinnerChoiceFee = 0.0f;

        switch(dinnerChoice){
            case "Buffet":
                dinnerChoiceFee = 0.0f;
                break;
            case "Spit-Braai":
                dinnerChoiceFee = 150.00f;
                break;
            case "Sit-down":
                dinnerChoiceFee = 100.00;
        }
        return (costPerHead*numberOfGuests) + dinnerChoiceFee;
    }

    @Override
    public String displayInvitation() {
        return "Please come to my Dinner Party at " + address +".";
    }

    @Override
    public String toString() {
        return "DinnerParty{" +
                "dinnerChoice='" + dinnerChoice + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                ", costPerHead=" + costPerHead +
                ", address='" + address + '\'' +
                '}';
    }
}
