public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Task #1: The sum of values from 1 to N - ");
        value(3);
    }

    public static int value(int N){
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        int sum = 0;
        for(int i = 1; i < N; i++){
            sum = sum + i;
        }
        return value(N);
    }
}
