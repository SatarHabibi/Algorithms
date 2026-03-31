public class mergesort {
    public static void main(String[] args) {
        int data[]={1,0,4,6,7,3,9};
app obj=new app();
obj.mergesort(data, 0, data.length-1);
for (int i : data) {
    System.out.print(i+"      ");
}
    }
    public void mergesort(int arr[], int p, int r)
    {
        if(p<r)
        {
        int q=(p+r)/2;
        mergesort(arr,p,q);
        mergesort(arr, q+1,r);
        merge(arr, p,q, r);
        }
       
    }
    public void merge(int arr[],int p,int q,int r)
    {
        int n1=q-p+1;
        int n2=r-q;
        int leftarray[]=new int[n1];
        int rightarray[]=new int[n2];
        for(int i=0; i<n1; i++)
        {
            leftarray[i]=arr[p+i];
        }
        for(int j=0; j<n2; j++)
        {
            rightarray[j]=arr[q+1+j];
        }
        int i=0 , j=0;
        int k=p;
        while (i<n1&&j<n2) {
            
            if(leftarray[i]<rightarray[j])
            {
                arr[k]=leftarray[i];
                i++;
            }else
            {
                arr[k]=rightarray[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k]=leftarray[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=rightarray[j];
            j++;
            k++;

        }

    }
}


