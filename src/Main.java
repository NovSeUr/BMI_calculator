public class Main {
    public static void main(String[] args) {
        bmiService service = new bmiService();
        double bodyMassIndex = service.calculate(77,1.78);
        System.out.printf("%.2f", bodyMassIndex);

    }
}