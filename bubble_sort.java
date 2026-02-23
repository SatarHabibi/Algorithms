public class bubble_sort {
    
public static void main(String[] args)
{

int []numbers={10,2,4,6,8,1};
int size=numbers.length;

for(int outter=0; outter<size; outter++)
{

    for(int inner=0; inner<size-1-outter; inner++)
    {
        if(numbers[inner]>numbers[inner+1])
        {
            int temp=numbers[inner];
            numbers[inner]=numbers[inner+1];
            numbers[inner+1]=temp;
        }
    }

    

}

for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i]+"  ");
}

}
}
