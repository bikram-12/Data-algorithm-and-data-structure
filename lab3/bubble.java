class bubble{
	public static void main(String [] args)
	{
		int [] array = {2,5,7,4,8,6,9};
        for(int i:array){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        bubbling(array);

        for (int i:array){
        	System.out.print(i+"");
        }

    }

    public static void bubbling(int arr[])
    {
        int n= arr.length;
        int x=0;
        for (int i = 0; i < n- 1; i++){

            for (int j=i+1; j<n-1; j++){
                if (arr[j-1]> arr[j])
                {
                    x= arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = x;
                }
            }
        }
            
    }

}
    

