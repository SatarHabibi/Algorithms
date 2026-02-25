public class insertion_sort {
    public static void main(String[] args) {
    int number[]={10,2,3,4,5,1};
    int size =number.length;
    for(int outter=1; outter<size; outter++){
        int key=number[outter];
        int inner;
       for(inner=outter-1; inner>=0 && number[inner]>key; inner--){
           number[inner+1]=number[inner]; 
    }
    number[inner+1]=key;
}
    for(int i=0; i<size; i++){
        System.out.print(number[i]+" ");
    }
    }
    
}
