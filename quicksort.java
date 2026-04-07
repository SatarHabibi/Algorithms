public class quicksort {

public static void main(String[] args) {
 
    int data[]={1,0,9,3,8,4};
    quicksort sort=new quicksort();
    sort.quicksort(data, 0,data.length-1);
    // for (int i : data) {
    //     System.out.print("  "+i);
    // }
    
}
public void quicksort(int data[],int p, int r)
{
    if(p<r)
    {
    int pivote=partition(data,p,r);
    quicksort(data, p, pivote-1);
    quicksort(data, pivote+1, r);

    }
    

}
public int partition(int data[],int p, int r)
{
    int pivote=data[r];
int i=p-1;
for(int j=p; j<=r-1; j++)
{
    if(data[j]<pivote)
    {
        i++;
        int temp=data[j];
        data[j]=data[i];
        data[i]=temp;
    }
}

int temp=data[i+1];
data[i+1]=data[r];
data[r]=temp;
return i+1;


}







}