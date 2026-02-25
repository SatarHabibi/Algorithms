public class selection_sort {
    
    public static void main(String[] args){
       int numbers[]={1,20,4,6,7,8};
       int size=numbers.length;
       for(int outter=0; outter<size-1; outter++){
int min=outter;
for(int inner=outter+1; inner<size; inner++)
{
    if(numbers[inner]<numbers[min])
    {
        min=inner;
    }
}

int temp=numbers[outter];
numbers[outter]=numbers[min];
numbers[min]=temp;

       }
   for(int i=0; i<size; i++)
   {
    System.out.print(numbers[i]+" ");
   }




















        // int number[]={10,2,3,4,5,1};
        // int size =number.length;
        // for(int outter=0; outter<size-1; outter++){
        //     int min=outter;
        //     for(int inner=outter+1; inner<size; inner++){
        //         if(number[inner]<number[min]){
        //           min=inner;
        //         }     
        //     }
        //     int temp=number[outter];
        //     number[outter]=number[min];
        //     number[min]=temp;
        // }
        // for(int i=0; i<size; i++){
        //     System.out.print(number[i]+" ");
        // }

    }


}
