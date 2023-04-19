package homeworks;

public class HW14 {
    public static float price = 1521.0f;
    public static float discountPercentage = 7.4f;

    public static void main(String[] args) {

      discount(price, discountPercentage);
    }

    //Discount method

    public static float discount(float price, float discountPercentage){

    float priceNotRounded = price - (price*discountPercentage/100);
    float priceRounded = Math.round(priceNotRounded*100)/100f;

        System.out.println("Price not rounded is: " + priceNotRounded);

        System.out.println("Final price is: " + priceRounded);

        return priceRounded;
    }
}
