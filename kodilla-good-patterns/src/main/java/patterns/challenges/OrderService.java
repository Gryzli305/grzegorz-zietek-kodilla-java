package patterns.challenges;

import java.time.LocalDateTime;
import java.util.Random;

public class OrderService implements RentalService {
    public boolean rented(User user, String game, LocalDateTime rental) {
        return new Random().nextBoolean();
    }
}
