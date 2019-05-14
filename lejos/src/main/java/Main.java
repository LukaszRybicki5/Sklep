import lejos.hardware.Button;
import lejos.hardware.motor.Motor;

public class Main {

    public static void main(String[] args) {
        Button.waitForAnyPress();
        System.out.println("Dupa");

        Motor.A.forward();

    }
}
