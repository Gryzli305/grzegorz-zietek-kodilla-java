package patterns.challenges;

import java.time.LocalDateTime;

public interface RentalRepository {

    boolean createOrder(User user, String game, LocalDateTime rental);
}
