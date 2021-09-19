package harddependenciesexample;

class Client {
    // Internal reference to the service used by this client
    private ExampleService service;

    Client(){
        // specify a specific implementation in the constructor instead of using dependency injection
        service = new ExampleService();
    }

    public String greet() {
        return "Hello " + service.getName();
    }
}

public class HardDependenciesExample {
    public static void main(String[] args) {

    }
}
