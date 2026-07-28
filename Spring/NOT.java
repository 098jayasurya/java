package Spring;

import javax.management.Notification;

interface notification{
    void notify();
}

class EmailNotification implements notification{
    public void notify(){
        System.out.println("email nmotification");
    }
}
class SMSNotification implements notification{

    public void notify(){
        System.out.println("sms");
    }
}

class WhatsappNotification implements notification{

    public void notify(){
        System.out.println("whatsapp");
    }
}

class NotificationService{
    private final notification notificatie;

    public NotificationService(notification notificatie){
        this.notificatie = notificatie;
    }

    void notify(){
        notificatie.notify();
    }
}
public class NOT {
    public static void main(String[] args) {
        NotificationService NS = new NotificationService(new EmailNotification());
        NS.notify();
    }
    
}
