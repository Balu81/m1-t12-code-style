import java.util.Scanner;

public class DepositCalculator {
    double calculateComplexPercent(double a, double y,int d ) {
        double pay = a * Math.pow ((1 + y / 12), 12 * d);
        return rnd(pay, 2);
    }
    double calculateSimplePercent(double amount, double yearRate, int period) {
        return rnd(amount + amount * yearRate * period, 2);
    }

    double rnd(double value, int places) {
       double ScaLe= Math.pow(10, places);
       return Math.round(value * ScaLe) / ScaLe;
    }

    void calculate()
    {
        int period, action ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:") ;
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double result = 0;
        if (action == 1) {
            result = calculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            result = calculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + result);
    }

    public static void main (String[] args) {
        new DepositCalculator().calculate();
    }




}
