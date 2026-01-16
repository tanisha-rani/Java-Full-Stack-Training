package playingwithNumbers;

public class BOX {

    double length;

    // Constructor
    public BOX(double length) {
        this.length = length;
    }

    // Default constructor
    public BOX() {
        this.length = 0;
    }

    // Helper / Factory methods
    public static BOX createBOX() {
        return new BOX();
    }

    public static BOX createBOX(double length) {
        return new BOX(length);
    }
}
