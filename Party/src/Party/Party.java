package Party;

/**
 * Party.java
 * Term 4 2018 Assignment 1 – This is the parent class
 *
 * @author Claude DE-TCHAMBILA (217035027)
 * @author Harmony MOUSSOUNDI (218293992)
 * Date: 17 October 2018
 */
public abstract class Party {

    protected int numberOfGuests;
    protected double costPerHead;
    protected String address;

    public Party(int numberOfGuests, double costPerHead, String address) {
        this.numberOfGuests = numberOfGuests;
        this.costPerHead = costPerHead;
        this.address = address;
    }

    public abstract double calculateCost();
    public abstract String displayInvitation();

    @Override
    public String toString() {
        return "Party{" +
                "numberOfGuests=" + numberOfGuests +
                ", costPerHead=" + costPerHead +
                ", address='" + address + '\'' +
                '}';
    }

}
