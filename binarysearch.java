public class binarysearch {
    
    public static void main(String[] args) {
int data[]={1,2,5,8,9,10};
int result=binarysearch(data, 10);
if(result!=-1)
{
    System.out.println("data found at index :"+result);
}else
{
    System.out.println("data not found!");
}        
    }

   public static int binarysearch(int data[], int key)
   {
int low=0;
int high=data.length-1;
while (low<=high) {
    int mid=(low+high)/2;

    if(data[mid]==key)
    {
        return mid;
    }else if(data[mid]<key)
    {
         low=mid+1;
    }else
    {
         high=mid-1;
    }

    }

    return -1;
   }



    
}













// public static int binarysearch(int data[], int key)
//     {
//         int low=0;
//         int high=data.length-1;
        
//         while(low<high) {
//             int mid=(low+high)/2;
//             if (data[mid]==key) {
//                 return mid;
//             }
//             else if (data[mid]>key) {
//                 high=mid-1;
//             }else
//             {
//                 low=mid+1;
//             }
//         }
//         return -1;
//     }