package Contract_Features;

public class PushNotification implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("This is a push Notification");
    }

}
