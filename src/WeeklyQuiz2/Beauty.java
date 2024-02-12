package WeeklyQuiz2;

import java.math.BigDecimal;

public class Beauty extends Product implements  DeliveryChargeCalculator{
    Beauty(String name, double price, double weight){
        super(name,price,weight);
    }
    @Override
    public BigDecimal getDeliveryCharge(double price, double weight) {
        return calculateDeliveryPrice();
    }

}
