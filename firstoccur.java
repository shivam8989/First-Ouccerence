package Recursion;

public class firstoccur {
    public static int  fiestOuccerence(int arr[],int i,int x){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==x){
           return i;
        }
        return fiestOuccerence(arr,i+1 ,x);


    }
    public static void main(String args[]){
        int arr []= {1,2,3,4,5,6,7,8};
        System.out.println(fiestOuccerence(arr,0,7));
    }
}
