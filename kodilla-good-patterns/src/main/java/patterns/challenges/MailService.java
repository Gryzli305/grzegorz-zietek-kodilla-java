package patterns.challenges;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Thank You " + user.getName() + "for you order");
    }
}
