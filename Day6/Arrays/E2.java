package Day6.Arrays;

public class E2
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1]=40;
        System.out.println(arr[1]);
        //Access & update elements in an array -> TC 0(1)
        //this is because of index_based access or
        //direct index-mapping
        //[idx=pos-1] or [pos=idx+1]
        for(int i=0;i< arr.length;i++) //arr.length is a property not a function or method
        {
            System.out.print(arr[1]+" ");
        }
        System.out.println();
        for(int x : arr)
        {
            System.out.print(x+ " ");
        }
        System.out.println();
        for(Object o:arr)
        {
            System.out.print(o+" ");
        }
        System.out.println();
        String name="Java";
        System.out.println(name.length());//length() method
        /*
        ✅ array.length is a property
        ✅ string.length() is a method
        ℹ️ memory management
        ⭐ array object is stored in the heap
        ⭐ variable reference is stored in the stack
        ⭐ elements are stored in contiguous memory blocks
        ℹ️ char[1][1][1][1] int[4][4][4][4] double[8][8][8][8]bytes
         */
    }
}
