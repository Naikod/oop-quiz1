package id.ac.polinema.oop;

public class Cashier {
    public double calculateChange(Order order, double cash){
        double change = cash - order.getFinalTotal();
        if(change < 0){
            return change;
        } else {
            return change;
        }
    }
}
