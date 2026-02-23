public class Count{

public static void main(String[] args) {
        
String []people={"jan","khan","Nasir","Jalil"};

int size=people.length;
int counter=0;

//counting people one by one
// for(int i=0; i<size; i++)
// {
//     counter++;
//     System.out.println(counter);

// }

// counting people tow to tow
for(int i=0; i<size; i++)
{
    counter+=2;
    if(counter/2==0)
    {

        System.out.println(counter);
    }
    

}}


}