public class recursion {
    public static void main(String[] args) {
       
              System.out.println(multyply(10, 1));

    }
public static int multyply(int m , int n)
{
    int result;
    if(n==1)
    {
        return m;
    }
    else
    {
     result=m+multyply(m, n-1);
    }
    return result;
}





















    // public static int multyply(int m , int n)
    // {
    //     int result;
    //     if(n==1)
    //     {
    //         return m;
    //     }
    //     else{
    //         result=m+multyply(m, n-1);
    //     }
    //     return result;
    // }
    // public static int print(int n){
    //     if(n==1) return 1;
    //     System.out.println(n);
    //     return print(n-1);
    // }

  
}
