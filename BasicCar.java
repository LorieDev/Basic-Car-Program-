public class BasicCar {

    public static void main(String[] args) {
        // Car info
        String make = "Toyota";
        String model = "Corolla";
        int year = 2020;
        String color = "Blue";
        int speed = 0;

        // Print car info
        System.out.println("Car Info:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Current speed: " + speed + " mph");

        // Accelerate
        speed = accelerate(speed, 30);
        speed = brake(speed, 10);
        speed = accelerate(speed, 20);

        // Final speed
        System.out.println("Final speed: " + speed + " mph");
    }

    public static int accelerate(int currentSpeed, int increaseBy) {
        int newSpeed = currentSpeed + increaseBy;
        System.out.println("Accelerated by " + increaseBy + " mph. New speed: " + newSpeed);
        return newSpeed;
    }

    public static int brake(int currentSpeed, int decreaseBy) {
        int newSpeed = currentSpeed - decreaseBy;
        if (newSpeed < 0) {
            newSpeed = 0;
        }
        System.out.println("Braked by " + decreaseBy + " mph. New speed: " + newSpeed);
        return newSpeed;
    }
}
