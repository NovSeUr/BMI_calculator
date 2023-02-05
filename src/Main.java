public class Main {
    public static void main(String[] args) {
        bmiService service = new bmiService();
        double weight = 77;
        double height = 1.78;
        double bodyMassIndex = service.calculate(weight,height);
        System.out.printf("%.2f", bodyMassIndex);

    }
}