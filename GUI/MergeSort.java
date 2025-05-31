class MergeSort 
{
	public static void merge(int[] arr, int left, int mid, int right){
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		
		int[] leftarray = new int[n1];
		int[] rightarray = new int[n2];
		
		
		for(int i =0;i<n1;i++){
			leftarray[i] = arr[left+i];
		}
		for(int j = 0;j<n2;j++){
			rightarray[j] = arr[mid + 1+j];
		}
		
		int i =0;j=0;k=left;
		while(i<n1 && j <n2){
			if(leftarray[i] <= rightarray[j]){
				arr[k] = leftarray[i];
				i++;
			}else{
				arr[k] = rightarray[j];
				j++;
			}
			k++;
		}
			
		while(i <n1) {
			arr[k] = leftarray[i];
			i++;
			k++;
			
		}
		
		while(j<n2){
			
			arr[k] = rightarray[j];
			j++;
			k++;
			
		}
		}
		
		public static void mergeSort(int[] arr, int left, int right){
			if(left < right){
				
				int mid = (left+right)/2;
				mergeSort(arr, left, mid);
				mergeSort(arr, mid+1,right);
				merge(arr, left, mid, right);
			}
			
			
		}
		
		
		public static void main(String args[]){
			int[] arr = {38,27,43,3,9,82,10};
			System.out.println("Original array: ");
			
			for(int num:arr){
				System.out.println(num + " ");
			}
			mergeSort(arr,0,arr.length-1);
			
			System.out.println("\n Sorted array");
			for(int num : arr){
				System.out.println(num + " ");
			}
			
			
		}
	}
	


