package assignment.main;

public class LinearSearch {
	
	public static int search(int[] ar,int val) {
        for(int i=0;i<ar.length;i++){    
            if(ar[i] == val){    
                return i;    
            }    
        }    
        return -1;    
    }   
	
	
	public static void main(String[] args) {
		int[] arr = {3,1,6,4,5,7,8,9};
		int key = 1;
		
		System.out.println("Key Found at position:" + search(arr,key));

	}

}
