package WeeklyQuiz2;

import java.math.BigDecimal;

public class Product {
    String name;

    double price;

    double weight;

    Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    BigDecimal calculateDeliveryPrice() {
        BigDecimal basePrice = calculatePrice(price,weight);
        BigDecimal additionalCharge = calculateAdditions(price, weight);
        return basePrice.subtract(additionalCharge);
    }

    private BigDecimal calculatePrice(double price,double weight) {
        BigDecimal basePrice;
        if(weight < 3.0){
            basePrice = BigDecimal.valueOf(1000);
        }else if( weight < 10.0){
            basePrice = BigDecimal.valueOf(5000);
        }else {
            basePrice = BigDecimal.valueOf(10000);
        }
        return (price >= 100000) ? BigDecimal.ZERO : basePrice;
    }

    BigDecimal calculateAdditions(double price,double weight) {
        if(price < 30000){
            return BigDecimal.ZERO;
        }else if(price < 100000){
            return BigDecimal.valueOf(1000);
        }else
            return BigDecimal.ZERO;
    }
}