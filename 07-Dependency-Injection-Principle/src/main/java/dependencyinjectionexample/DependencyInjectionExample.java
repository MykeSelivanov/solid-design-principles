package dependencyinjectionexample;

interface Service {
    void write(String message);
}

class ServiceA implements Service {
    @Override
    public void write(String message){
        System.out.println(message);
    }
}

// constructor injection
class Client1 {
    private Service myService;

    // injection via constructor
    public Client1(Service myService) {
        this.myService = myService;
    }

    public void doSomething() {
        myService.write("This is a message through constructor injection");
    }
}

// setter injection
class Client2 {
    private Service myService;

    // injection via setter
    public void setService(Service service) {
        this.myService = service;
    }

    public void doSomething() {
        myService.write("This is a message through setter injection");
    }

}

public class DependencyInjectionExample {
    public static void main(String[] args) {
        Service service = new ServiceA(); // the injector
        Client1 client1 = new Client1(service); // injects via constructor
        client1.doSomething();

        Client2 client2 = new Client2();
        client2.setService(service);
        client2.doSomething();

    }
}
