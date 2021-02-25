

import java.util.Scanner;

public class Task1and2 {

    public static void main(String[] args) {
        String name;
        System.out.println("Enter your name?");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        task1(name);
        task2();

    }


    public static String task1(String name) {

        System.out.println("Hello " + name);
        return name;

    }

    public static void task2() {

        System.out.println("Enter the length of array?");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter the elements of array");

        for (int i = 0; i <= length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("ARRAY IN REVERSE ORDER");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }




    }
}
