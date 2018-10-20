package Party;

/**
 * KidsParty.java
 * Term 4 2018 Assignment 1 – This is the worker class
 *
 * @author Claude DE-TCHAMBILA (217035027)
 * @author Harmony MOUSSOUNDI (218293992)
 * Date: 17 October 2018
 */
public class KidsParty extends Party{

    private String theme;
    private String supervisor;

    public KidsParty(int numberOfGuests, double costPerHead, String address, String theme, String supervisor) {
        super(numberOfGuests, costPerHead, address);
        this.theme = theme;
        this.supervisor = supervisor;
    }

    @Override
    public double calculateCost() {
        return (costPerHead*numberOfGuests)+200;
    }

    @Override
    public String displayInvitation() {
        return "Please come to my Kids Party at " + address + "\n" +
                "Dress theme is " + theme +".\n" +
                "The supervisor is " + supervisor + ".";
    }

    @Override
    public String toString() {
        return "KidsParty{" +
                "theme='" + theme + '\'' +
                ", supervisor='" + supervisor + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                ", costPerHead=" + costPerHead +
                ", address='" + address + '\'' +
                '}';
    }
}
