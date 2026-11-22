class Payment{
    void pay(double amount){
        System.out.println("Processing Payment of " + amount);
    }
}
class CashPayment extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Paid through Cash: " + amount);
    }
}
class CardPayment extends Payment{
    @Override
    void pay(double amount){
        System.out.println("Paid by Card: " + amount);
    }
}
class OnlinePayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid Online: " + amount);
    }
}
public class PaymentSystem {
    public static void main(String [] args){
        Payment p;
        p=new CashPayment();
        p.pay(5000);
        p=new CardPayment();
        p.pay(59.0);
        p=new OnlinePayment();
        p.pay(5739.8);

    }
}
