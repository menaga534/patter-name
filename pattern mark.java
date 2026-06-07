import java.util.Scanner;

public class Twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][5];
        double[] avg = new double[n];
        int[] student = new int[n];

        for (int i = 0; i < n; i++) {
            student[i] = i + 1;

            System.out.println("Enter 5 marks for Student " + (i + 1));

            int sum = 0;
            for (int j = 0; j < 5; j++) {
                marks[i][j] = sc.nextInt();

                sum += marks[i][j];
            }

            avg[i] = sum / 5.0;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (avg[i] < avg[j]) {

                    double dse = avg[i];
                    avg[i] = avg[j];
                    avg[j] = dse;

                    int temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }

        System.out.println("\nRank List");

        for (int i = 0; i < n; i++) {
            System.out.println(
                "Student " + student[i] +
                " Average = " + avg[i]
            );
        }
    }
}