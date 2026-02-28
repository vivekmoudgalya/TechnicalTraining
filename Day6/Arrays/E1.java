package Day6.Arrays;

public class E1
{
    public static void main(String[] args) {
        int[] arr1;//Declaration
        arr1=new int[5];//memory allocation[20 bytes]
        //declaration + memory allocation in single line
        //if we don't provide value
        //the JVM uses "Fallback Mechanisms"
        //It uses the default value of that data type
        //method 2
        int[] arr2=new int[5];
        System.out.println(arr2[4]);//0
        System.out.println(arr1[3]);//0
        //Method 3
        int[] arr3={1,2,3,4,5};
        //method 4
        int[] arr4=new int[]{1,2,3,4,5};
    }
}
