import java.util.Scanner;
public class Homework {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // sum(4);
        // factorial(4);
        // hometask2();
        hometask3();
    }

    // hometask#1
    public static void sum(int N){
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        int Sum = 0;
        for(int i = 1; i <= N; i++){
            Sum = Sum + i;
        }
        System.out.printf("Сумма чисел от 1 до %d равна %d%n", N, Sum);
    }
    public static void factorial(int N) {
        int Factorial = 1;
        for (int i = 1; i <= N; i++) {
            Factorial *= i;
        }
        System.out.printf("Факториал числа %d равен %d%n", N, Factorial);
    }

    // hometask#2
    public static void hometask2(){
        // вывести все простые числа от 1 до 1000
        int n = 1000;
        primeTest(n);
    }
    public static void primeTest(int num){
            boolean res;
        System.out.printf("1, 2");
        for (int i = 3; i <= num; i += 2) {
            res = true;
            for (int j = 3; j < i / 3 + 1; j++) {
                if (i % j == 0) {
                    res = false;
                    break;
                }
            }
            if (res){
                System.out.printf(", %d", i);
            }
                
        }
        System.out.println();
    }

    // hometask#3
    public static void hometask3(){
        // Реализовать простой калькулятор
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("The resulr of operation: " + result);

    }
    public static int getInt(){
        System.out.println("Enter the number:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }
        else {
        System.out.println("You entered a wrong number, try again.");
        scanner.next();
        num = getInt();
    }
    return num;
    }
    public static char getOperation(){
        System.out.println("Enter the operation:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        else {
            System.out.println("You entered a wrong operation, try again.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }  
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("You entered a wrong operation, try again.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }  
}
