public class Car {
    String producer;
    String model;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String getInfo() {
        return "Автомобіль " + producer + " " + model;
    }

    public void startEngine() {
        System.out.println("Запуск двигуна автомобіля " + producer + " " + model);
    }


    public void drive(int distance) {
        System.out.println(producer + " " + model + " поїхав " + distance + " км.");
    }
    // Тут я перевизначив метод з іншим типом параметру
    public void drive(double distance) {
        System.out.println(producer + " " + model + " поїхав " + distance + " км.");
    }
    // Перевизначив метод Maintenance
    public static void Maintenance(String action) {
        System.out.println("Обслуговування автомобіля: " + action);
    }
}
