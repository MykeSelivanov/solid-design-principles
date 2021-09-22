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

class Client {
    private Service myService;

    // injection via constructor
    public Client(Service myService) {
        this.myService = myService;
    }

    public void doSomething() {
        myService.write("This is a message through constructor injection");
    }
}

public class DependencyInjectionExample {
    public static void main(String[] args) {
        Service service = new ServiceA(); // the injector
        Client client = new Client(service); // injects via constructor
        client.doSomething();

    }
}
