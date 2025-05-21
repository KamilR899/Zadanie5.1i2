
public class Main {
    public static void main(String[] args) {
        // Utworzenie instancji klasy Car
        Car myCar = new Car(5); // Załóżmy, że samochód ma 5 miejsc

        // Wywołanie przesłoniętych metod start() i stop() z klasy Car
        myCar.start(); // Wyświetli: Samochód uruchamia silnik.
        myCar.stop();  // Wyświetli: Samochód gasi silnik.


        // Dla porównania, jeśli mielibyśmy obiekt Vehicle:
        Vehicle Fiat = new Vehicle();
        Fiat.start();
        Fiat.stop();
    }
}