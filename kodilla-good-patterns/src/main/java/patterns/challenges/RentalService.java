package patterns.challenges;

import java.time.LocalDateTime;

public interface RentalService {

    boolean rented (User user, String game, LocalDateTime rental);
}

