
public abstract class Payment {

    public abstract void send(String destination, double amount);

    public abstract void withdraw(String source, double amount);

}
