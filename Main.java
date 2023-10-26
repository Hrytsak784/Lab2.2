public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry");
        Engine engine1 = new Engine("бензиновий");
        Transmission transmission1 = new Transmission();
        Transmission transmission2 = new Transmission("Автомат");
        Transmission transmission3 = new Transmission(6);
        Transmission transmission4 = new Transmission("Механіка", 5);
        Car car2 = new Car("Mercedes", "GLS");
        Engine engine2 = new Engine("дизельний");
        Car car3 = new Car("BMW", "M5");
        Engine engine3 = new Engine("гібридний");

        System.out.println(car1.getInfo());
        engine1.start();
        int horsepower1 = engine1.getHorsepower();
        System.out.println("Потужність двигуна: " + horsepower1 + " к.с.");
        System.out.println("Тип трансмісії: " + transmission1.getType());
        car1.drive(120);
        System.out.println();

        // Викликаю методи Maintenance для екземплярів класів
        Car.Maintenance("Заміна масла в двигуні");
        Engine.Maintenance("Перевірка системи охолодження");
        Transmission.Maintenance("Регулювання механічної коробки передач");
        System.out.println();

        // Викликаю метод, який приймає інший екземпляр Transmission в параметрах
        transmission1.Transmission(transmission2);

        // Викликаю метод посилкового типу
        Transmission newTransmission = transmission1.createNewTransmission("Полуавтомат", 7);
        newTransmission.printType(); // Виведе новий тип коробки передач

        // Виведення інформації про початкові об'єкти Transmission
        transmission1.printType();
        transmission2.printType();

        System.out.println();
        System.out.println(car2.getInfo());
        engine2.start();
        int horsepower2 = engine2.getHorsepower();
        System.out.println("Потужність двигуна: " + horsepower2 + " к.с.");
        car3.drive(60);
        System.out.println();

        System.out.println(car3.getInfo());
        car3.startEngine();
        int horsepower = engine3.getHorsepower();
        System.out.println("Потужність двигуна: " + horsepower + " к.с.");
        car3.drive(80);
    }
}
