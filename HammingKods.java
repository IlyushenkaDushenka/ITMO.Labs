package files;

import java.util.Scanner;

public class HammingKods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите код Хэмминга длины 7 символов");
        String number = scan.nextLine();
        scan.close();
        //Проверка на идиота
        if (number.length()!=7){
            System.out.println("Длины 7!");
            return;
        }
        char[] nums = new char[7];
        for (int i = 0; i < 7; i++){
            nums[i] = number.charAt(i);
        }
        //Находим синдром
        String sin = toString(nums, 1) + toString(nums, 2) + toString(nums, 3);
        //По синдрому определяем, есть ли в передаче ошибки и, если есть, исправляем
        switch (sin){
            case "000" -> System.out.printf("%s%s%s%s\nОшибок нет", nums[2], nums[4], nums[5], nums[6]);
            case "100" -> System.out.printf("%s%s%s%s\nОшибка в бите r1", nums[2], nums[4], nums[5], nums[6]);
            case "010" -> System.out.printf("%s%s%s%s\nОшибка в бите r2", nums[2], nums[4], nums[5], nums[6]);
            case "001" -> System.out.printf("%s%s%s%s\nОшибка в бите r3", nums[2], nums[4], nums[5], nums[6]);
            case "110" -> System.out.printf("%s%s%s%s\nОшибка в бите i1", (nums[2]+1)%2, nums[4], nums[5], nums[6]);
            case "101" -> System.out.printf("%s%s%s%s\nОшибка в бите i2", nums[2], (nums[4]+1)%2, nums[5], nums[6]);
            case "011" -> System.out.printf("%s%s%s%s\nОшибка в бите i3", nums[2], nums[4], (nums[5]+1)%2, nums[6]);
            case "111" -> System.out.printf("%s%s%s%s\nОшибка в бите i4", nums[2], nums[4], nums[5], (nums[6]+1)%2);
        }
    }
    //Метод для нахождения синдрома
    public static String toString(char[] nums, int type) {
        int[] ret = new int[1];
        if (type == 1){
            ret[0] = ((int) nums[0] + (int) nums[2] + (int) nums[4] + (int) nums[6]) % 2;
        }
        if (type == 2){
            ret[0] = ((int) nums[1] + (int) nums[2] + (int) nums[5] + (int) nums[6]) % 2;
        }
        if (type == 3){
            ret[0] = ((int) nums[3] + (int) nums[4] + (int) nums[5] + (int) nums[6]) % 2;
        }
        if (ret[0] == 0){
            return "0";
        }
        return "1";

    }
}
