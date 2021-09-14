import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n], nums = new int[100000];

        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            nums[arr[i]] = 1;
        }
        for(int i = 0; i < n; i++){
            if(nums[arr[i]] != 2){
                System.out.print(arr[i] + " ");
                nums[arr[i]] = 2;
            }
        }
    }
}
