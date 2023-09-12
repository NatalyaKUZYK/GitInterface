public class iPhones implements SmartPhone, iOS{
    @Override
    public void call() {
        System.out.println("Calling from iPhone...");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from iPhone ...");
    }

    @Override
    public void internet() {
        System.out.println("Browsing internet from iPhone...");
    }
    @Override
    public void runApp(){
        System.out.println("Runing iOS app on iPhone...");
    }
}
