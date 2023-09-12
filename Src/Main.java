public class Main {
    public static void main(String[] args) {
        SmartPhone androidPhone = new Androids();
        SmartPhone iPhone = new iPhones();
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        System.out.println("-----------");
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
    }
}
