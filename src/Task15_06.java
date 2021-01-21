import java.util.Scanner;

public class Task15_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] arr = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        int player = 0;
        int a, b;
        boolean noWin = true;
        while (noWin) {


            if (player % 2 == 0) {
                System.out.println("Player 1, enter your coordinates.");
                a = scanner.nextInt();
                b = scanner.nextInt();
                arr[a - 1][b - 1] = "O";
            } else {
                System.out.println("Player 2, enter your coordinates.");
                a = scanner.nextInt();
                b = scanner.nextInt();
                arr[a - 1][b - 1] = "X";
            }
            player++;
            for (String[] x : arr) {
                for (String y : x) {
                    System.out.print(y + " ");
                }
                System.out.print("\n");
            }
            for (int i = 0; i < 3; i++) {
                if (arr[i][0].equals(arr[i][1]) && arr[i][1].equals(arr[i][2])) {
                    if (arr[i][0] == "O") {
                        noWin = false;
                        System.out.println("Player 1 wins!!!");
                    }
                    if (arr[i][0] == "X") {
                        noWin = false;
                        System.out.println("Player 2 wins!!!");
                    }
                }
                if (arr[0][i].equals(arr[1][i]) && arr[1][i].equals(arr[2][i])) {
                    if (arr[0][i] == "O") {
                        noWin = false;
                        System.out.println("Player 1 wins!!!");
                    }
                    if (arr[0][i] == "X") {
                        noWin = false;
                        System.out.println("Player 2 wins!!!");
                    }
                }
            }
            if ((arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2])) || (arr[2][0].equals(arr[1][1]) && arr[1][1].equals(arr[0][2]))) {
                if (arr[1][1] == "O") {
                    noWin = false;
                    System.out.println("Player 1 wins!!!");
                }
                if (arr[1][1] == "X") {
                    noWin = false;
                    System.out.println("Player 2 wins!!!");
                }
            }


        }
    }
}
