public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate(68,175);
        System.out.println("Your BMI is: " + index);
    }
}