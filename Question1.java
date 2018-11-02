package exam1;

public class Question1 {

	void ExamSort(int[]a, int size){
		int n = a.length;
		int m = size/2;
		
		int[]left = new int[m];
		int[]right = new int[n-m];
		
		for(int i = 0; i < m; i++){
			left[i] = a[i];
		}
		for(int j = m; j < n; j++){
			right[j-m] = a[j];
		}
		
		ExamSort(left,m);
		ExamSort(right,n-m);
		merge(left,right,a);

	}   
	void merge(int[] left, int[] right, int[]a){
		int nL = left.length;
		int nR = right.length;
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i <=nL && j <=nR){
			if(left[i] < right[j]){
				a[k] = left[i];
				i++;
				k++;
			}
			else{
				a[k]= right[j];
				j++;
				k++;
			}
		}
		
		while(i <= nL){
			a[k] = left[i];
			i++;
			k++;
		}
		while(j <= nR){
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	void print(int[]a){
		int n = a.length;
		for(int i= 0; i < n; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Question1 test = new Question1();
		int[] a = {15,9,60,44,12,1,4};
		test.ExamSort(a, 7);

	}
	
}
