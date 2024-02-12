package WeeklyQuiz2;

public class ProductPrint {
    public static void main(String[] args) {

        Beauty beauty = new Beauty("BBCream",20000,1.0);
        System.out.println("화장품 배송비 : " +beauty.getDeliveryCharge(beauty.price, beauty.weight));
        Grocery grocery = new Grocery("Strawberry", 60000,7.0);
        System.out.println("식료품 배송비 : " +grocery.getDeliveryCharge(grocery.price, grocery.weight));
        LargeAppliance largeAppliance = new LargeAppliance("Refrigerator",3000000,10.0);
        System.out.println("가전 제품 배송비 : " +largeAppliance.getDeliveryCharge(largeAppliance.price, largeAppliance.weight));

    }
}
