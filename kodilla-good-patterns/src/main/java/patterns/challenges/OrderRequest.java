package patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private String game;
    private LocalDateTime rental;

    public OrderRequest(User user, String game, LocalDateTime rental) {
        this.user = user;
        this.game = game;
        this.rental = rental;
    }

    public User getUser() {
        return user;
    }

    public String getGame() {
        return game;
    }

    public LocalDateTime getRental() {
        return rental;
    }
}
