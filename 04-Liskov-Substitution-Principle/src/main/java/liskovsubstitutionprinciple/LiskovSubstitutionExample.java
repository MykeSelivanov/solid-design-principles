package liskovsubstitutionprinciple;

abstract class Vehicle {
    abstract int getSpeed();
    abstract int getCubicCapacity();
}

class Car extends Vehicle {
    int getSpeed() {
        return 60;
    }
    int getCubicCapacity() {
        return 2500;
    }
    boolean isHatchBack() {
        return true;
    }
}

class Bus extends Vehicle {
    int getSpeed() {
        return 45;
    }
    int getCubicCapacity() {
        return 5500;
    }
    String getEmergencyExitLocation() {
        return "At the rear";
    }
}

public class LiskovSubstitutionExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();

        vehicle = new Car();
        vehicle.getCubicCapacity();
    }
}
