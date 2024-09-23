import java.util.Scanner;

public class convertToFibonacci{
    public static void main(String[] args) {
        //Создание массива с числами Фибоначчи
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 20; i++){
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        //Вводим число в 10ой системе счисления и находим длину числа в сс Цекендорфа
        Scanner scan = new Scanner(System.in);
        int num10 = scan.nextInt();
        scan.close();
        int length = 0;
        for (int i = 0; i < 20; i++){
            if (num10 < fibonacci[i]){
                length = i;
                break;
            }
        }
        //Заводим переменную для вывода ответа на экран
        StringBuilder answer = new StringBuilder(length);
        //Находим коэффициенты
        for (int i = length-1; i > 0; i--){
            boolean flag = false;
            for (int ratio = 1; ratio < 11; ratio++){
                if ((fibonacci[i]*ratio) <= num10){
                    answer.append("1");
                    num10 -= (fibonacci[i]*ratio);
                    flag = true;
                    break;
                }
            }
            if (!flag){
                answer.append("0");
            }
        }
        System.out.println(answer);
    }
}
