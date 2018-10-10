package patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriver {

    public OrderRequest order() {
        User user = new User("John", "English");
        String game = "Bro Force";

        LocalDateTime rental = LocalDateTime.of( 2018,10,9,12,0);
        return new OrderRequest(user,game,rental);
    }
}
