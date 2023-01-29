package javaapplication2;

public class video_31 {
    public static void main(String args[]){
        
        // array of elements
        
       /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);*/
        
       
        //float arr[]={2.5f,3.5f,4.5f,5.5f,6.6f,9.9f,8.9f};
        String name[]={"Sachin","Naman","Jivesh","Prabhjot","Shikha"};
        // length of array
        System.out.println("The length of array is "+name.length);
        
        // standard for loop in java
       for(int i=0;i<name.length;i++){
            System.out.println("Element of array on index "+i+" is "+name[i]);
        }
        
        // for each loop in java
        for(String entity:name){
            System.out.println(entity);
        }
        
        
        
    }
}
