package EasyPayment;

import EasyPayment.Interface.EasyPaymentInterface;

public class Hello implements EasyPaymentInterface {


    @Override
    public void hello() {
        System.out.println("heelo");
    }

    @Override
    public void hello2(int price) {
        System.out.println(price);
    }
}
