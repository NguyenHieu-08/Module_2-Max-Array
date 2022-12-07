import java.util.Scanner;

public class MaxArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai mang: ");
        int n = sc.nextInt();

        int array[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.printf("Nhap phan tu %d: ", i);
            array[i] = sc.nextInt();
        }

        int max = array[0];
        for(int i=0; i<n; i++){
            if(max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("So lon nhat: "+ max);

    }
}