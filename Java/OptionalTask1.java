import java.util.Scanner;

public class OptionalTask1 {


    public static void main(String []args) {

        int length = Integer.parseInt(args[0]);
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[length];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int elem : arr) {
            if (isDistinct(elem)) System.out.println(elem);
        }
    }

    private static boolean isDistinct(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }


}

