public class Transmission {
    String type;
    int gears;

    public Transmission() {

    }
    public Transmission(String type) {
        this.type = type;
    }
    public Transmission(int gears) {
        this.gears = gears;
    }

    public Transmission(String type, int gears) {
        this.type = type;
        this.gears = gears;
    }
    // Метод, який приймає екземпляр того ж класу в якості параметру
    public void Transmission(Transmission otherTransmission) {
        System.out.println("Виклик методу з іншого екземпляра Transmission.");
        otherTransmission.printType();
        System.out.println("Type of other transmission: " + otherTransmission.type);
        // 1.2 Викликав змінну екземпляра із класу, екземпляр якого передано в параметрах.
    }
    // Метод посилкового типу для повернення нового об'єкту зі зміненими значеннями
    public Transmission createNewTransmission(String newType, int newGears) {
        return new Transmission(newType, newGears);
    }

    // Метод для виведення типу коробки передач
    public void printType() {
        System.out.println("Type of transmission: " + type);
    }
    public String getType() {
        return type;
    }
    // Перевизначив метод Maintenance
    public static void Maintenance(String action) {
        System.out.println("Обслуговування коробки передач: " + action);
    }
}
