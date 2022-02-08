public class BmiService {
    public float calculate(float weightInKg, int heightInCm) {
        float bmi = weightInKg / (heightInCm * 2 / 100);
        return bmi;
    }
}
