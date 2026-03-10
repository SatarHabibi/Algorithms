public class decimalTobinary {
    public static void main(String[] args){
        convert(42);
        String []arr={"jan","khan","karim"};
        recurrencearray(arr, 0);
    }
    public static void convert(int number)
    {
        if(number>0)
        {
            convert(number/2);
            System.out.print("  "+number%2);

        }
      
    }

    //printing arrays elements using recursion
    public static void recurrencearray(String []arr, int index)
    {
if(index<arr.length)
{
    System.out.print("   "+arr[index]);
    recurrencearray(arr, index+1);
}
    }
}
