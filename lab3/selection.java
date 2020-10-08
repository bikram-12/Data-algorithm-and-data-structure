class selection{
	public static void main(String [] args)
	{
		int [] array = {2,5,7,4,8,6,9};
        for(int i:array){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selecting(array);

        for (int i:array){
        	System.out.print(i+"");
        }
    }
		


	public static void selecting(int [] arr){
		int n= arr.length;
		for (int i = 0; i < n- 1; i++){
			int smallest_index = i;//find out the smallest number..
			for (int j=i+1; j<n-1; j++){
				if (arr[j]< arr[smallest_index]){
					smallest_index=j;
				}

			}
			int smaller_number = arr[smallest_index];//swap or replace the smallest number..
			arr[smallest_index] = arr[i];

			arr[i]= smaller_number;
		}
	}
	
			
}
	  