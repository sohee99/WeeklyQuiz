package WeeklyQuiz2;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    BigDecimal getDeliveryCharge(double price, double weight);
}
