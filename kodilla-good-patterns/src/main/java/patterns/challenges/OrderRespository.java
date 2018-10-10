package patterns.challenges;

import java.time.LocalDateTime;
import java.util.Random;

public class OrderRespository implements RentalRepository {

    @Override
    public boolean createOrder(User user, String game, LocalDateTime rental) {
        return new Random().nextBoolean();
    }
}
