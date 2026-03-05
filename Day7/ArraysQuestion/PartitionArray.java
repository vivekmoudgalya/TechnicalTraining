package Day7.ArraysQuestion;
import java.util.Arrays;

public class PartitionArray
{
    public static void main(String[] args)
    {
        int[] arr={3,8,5,12,7,6};
        int left=0,right=arr.length-1;
        while(left<right)
        {
            while(arr[right]%2==0)
            {
                left++;//if the left side has even nos,move forward
            }
            while(arr[right]%2!=0)
            {
                right--;//if thr right side has odd numbers,move backwards
            }
            if(left<right)//if the numbers & sides don't match,swap
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
