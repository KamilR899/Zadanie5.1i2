public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // Przesłonięta metoda start()
    @Override
    public void start() {
        System.out.println("Samochód uruchamia silnik.");
    }

    // Przesłonięta metoda stop()
    @Override
    public void stop() {
        System.out.println("Samochód gasi silnik.");
    }
}