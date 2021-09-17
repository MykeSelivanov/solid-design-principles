package interfacesegregationprinciple;

interface RestaurantInterface {
    public void walkInCustomerOrder();
//    public void payInPerson();
//    public void payOnline();
//    public void acceptOnlineOrder();
//    public void takeTelephoneOrder();
}

interface TelephoneOrder {
    public void payInPerson();
    public void takeTelephoneOrder();
}

interface OnlineOrder {
    public void payOnline();
    public void acceptOnlineOrder();
}

class OnlineClientImpl implements OnlineOrder {
    @Override
    public void payOnline() {

    }

    @Override
    public void acceptOnlineOrder() {

    }
}

public class InterfaceSegregationExample2 {
    public static void main(String[] args) {

    }
}
