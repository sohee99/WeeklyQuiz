package WeeklyQuiz2;

import java.math.BigDecimal;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{
    LargeAppliance(String name, double price, double weight){
        super(name,price,weight);
    }
    @Override
    public BigDecimal getDeliveryCharge(double price, double weight) {
        return calculateDeliveryPrice();
    }
}