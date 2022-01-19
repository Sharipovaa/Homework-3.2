public class Main {
    public static void main(String[] args) {
        BmiIndex index = new BmiIndex();
        double hight = 163.5; // рост
        double weight = 53.4; // вес

        double mass = index.calculate(weight, hight);
        System.out.println(mass);

    }
}
