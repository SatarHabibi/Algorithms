public class practice {

    public static void sort_bubble(int arr[])
    {
        int size=arr.length;
        for(int outer=0;outer<size-1; outer++)
        {
            for(int inner=0; inner<size-outer-1; inner++)
            {
                 if (arr[inner]>arr[inner+1]) {

    int temp=arr[inner];
    arr[inner]=arr[inner+1];
    arr[inner+1]=temp;

                    }

            }
           System.out.print("Passed" +( outer+ 1)+ ": ");
            printarray(arr);

        }
    }
    public static void printarray(int arr[])
    {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int data[]={64, 90, 25, 12, 22, 11, 10};
        System.out.println("orginal array");
        printarray(data);
        
        sort_bubble(data);
        System.out.println("sorted array");
        printarray(data);
       
        
    }
     
   
    
}