
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int apartmentPrice;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.apartmentPrice = (this.squares * this.pricePerSquare);
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {    
        int apartmentPriceDifference = (this.apartmentPrice - compared.apartmentPrice);

        if (apartmentPriceDifference < 0) {
            apartmentPriceDifference *= -1;
        }

        return apartmentPriceDifference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.apartmentPrice > compared.apartmentPrice) {
            return true;
        } else {
            return false;
        }       
    }

}
