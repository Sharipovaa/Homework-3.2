public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
    double weight = 53.4;
    double hight = 163.5;

    if (weight / hight < 16.5) {
        System.out.println("deficit");
    }
    else if (weight / hight >= 18.5) {
        System.out.println("normal");
    }
    else if (weight / hight > 30.5) {
        System.out.println("obesity");
        }
    double deficit = 16.5;
    double normal = 18.5;
    double obesity = 30.5;
    System.out.println();

    }
}
