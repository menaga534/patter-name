import java.util.Scanner;
public class Seat {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        int arr[][]= {{ 1, 2, 3, 4, 5, 6, 7, 8, 9,10},{11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30},};
        
        for(int k=0;k<arr.length;k++){
            for(int l=0;l<arr.length;l++){

                System.out.println("Available seats");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter your seat number :");
        int a = sc.nextInt();
        int flag =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(a==arr[i][j]){
                    System.out.println("Your seat is booked.");
                    flag =1;
                    arr[i][j] = 0;
                    break;
                    
                }
            }
            
        }
        if(flag ==0){
            System.out.println("The seat is already booked or Invalid Input");
        }


        System.out.println("Thank you for Coming");

            }
        }
        
        



    }
}