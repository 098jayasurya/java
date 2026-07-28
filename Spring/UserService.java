package Spring;

import org.w3c.dom.UserDataHandler;


interface MessageService{
    void serve();

}

class EmailService implements MessageService{
    public void serve(){
        System.out.println("Service from EmailService");
    }
}

class SMSService implements  MessageService{
    public void serve(){
        System.out.println("service from SMSService");
    }
}

public class UserService{
    private MessageService messageservice;

    public UserService(MessageService messageservice){
        this.messageservice = messageservice;
    }

    public void Service(){
        messageservice.serve();
    }

}
public class Service {
    public static void main(String[] args) {
        EmailService Es = new EmailService();
        SMSService Ss = new SMSService();

        UserService us = new UserService(Ss);
        us.Service();

        UserService us1 = new UserService(Es);
        us1.Service();
    }
}
