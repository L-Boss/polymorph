package Contract_Features;

public class EmailNotification implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("This is an email notification");
    }
}
