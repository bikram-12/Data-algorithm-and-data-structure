public class insertion{  
    public static void insertion_1(int arr[]) {  
        int n = arr.length;  
        for (int j = 1; j < n; j++) {  
           
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > key ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] array = {9,5,8,5,3,6,7};    
       
        for(int i:array){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertion_1(array);   
           
         
        for(int i:array){    
            System.out.print(i+" ");    
        }    
    }    
} 