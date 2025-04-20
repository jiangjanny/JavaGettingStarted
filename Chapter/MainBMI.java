import java.util.Scanner;

public class MainBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入您的體重 (公斤): ");
        double weight = scanner.nextDouble();

        System.out.print("請輸入您的身高 (公分): ");
        double heightCm = scanner.nextDouble();

        // 公分轉公尺
        double height = heightCm / 100;

        double bmi = weight / (height * height);

        System.out.printf("您的BMI數值是 : %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("體重過輕");
        } else if (bmi < 24) {
            System.out.println("體重正常");
        } else if (bmi < 27) {
            System.out.println("體重過重");
        } else {
            System.out.println("體重肥胖");
        }
    }
}
