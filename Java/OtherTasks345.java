import java.util.Random;
import java.util.Scanner;

public class OtherTasks345{

    public static void main(String[] args) {
        int length = Integer.valueOf(args[0]);
        task3(length);

        task4();
        task5();
    }

    public static void task3(int length) {
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {

            Random random = new Random();
            int digit = Math.abs((int) random.nextInt());
            System.out.print(digit + " ");
            arr[i] = digit;
        }

        System.out.println('\n' + "Elements with new line");

        for (int y = 0; y <= arr.length - 1; y++) {
            System.out.println(arr[y]);
        }

    }

    public static void task4() {

        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int sum = 0;
        int multip = 1;
        int[] arr = new int[amount];

        System.out.println("Enter the elements of array");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            multip*= arr[i];
        }
        System.out.println("Sum :" + sum);
        System.out.println("Multiplication :"+ multip);
    }

    public static void task5() {
        System.out.println("Enter the number from 1 to 12");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Please, enter the number between 1 and 12");
        }


    }

}