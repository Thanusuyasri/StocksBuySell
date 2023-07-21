import java.util.Scanner;

public class StocksBuySell {
    public static int maxProfit(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(min>i)
            {
                min=i;
            }
            if(max<i)
            {
                max = i;
            }
        }
        return (max-min);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println(maxProfit(arr));

    }
}
