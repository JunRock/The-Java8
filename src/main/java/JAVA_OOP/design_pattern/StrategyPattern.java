package JAVA_OOP.design_pattern;
public class StrategyPattern {
    public static void main(String[] args) {
        Dealer dealer=null;
        Buyer buyer=new Buyer();

        dealer=new SportCar();
        buyer.buy(dealer);

        System.out.println();

        dealer=new MotorCycle();
        buyer.buy(dealer);
    }
}

interface Dealer{ //클라이언트
    abstract void sale();
}
class SportCar implements Dealer{
    @Override
    public void sale() {
        System.out.println("부아아앙");
    }
}
class MotorCycle implements Dealer{
    @Override
    public void sale() {
        System.out.println("위이잉");
    }
}

class Gasoline implements Dealer{
    @Override
    public void sale() {
        System.out.println("부우웅");
    }
}

class Buyer{ //컨텍스트
    void buy(Dealer dealer){
        System.out.println("시동 ON");
        dealer.sale();
        System.out.println("구매");
    }
}

