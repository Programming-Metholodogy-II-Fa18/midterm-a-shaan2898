package exam1;
import java.util.Arrays;

import exam1.Data;
import exam1.Data.Node;
public class Question3 {
	
	int ProblemThree(Data data, int value){
		
		
		return value;
		
	}
	
	int binarySearch(Node a, int value){
		Node m = getMiddle(a);
		
		if(a.data == value){
			return value;
		}
		
		while(a.data != value){
			if(value < a.data){
				getMiddle();
			}
			if(value > a[mid]){
				low =mid +1;
			}
			
			mid = (low+high)/2;
		}
	
		return mid;
		
	}
	
	Node getMiddle(Node a){
		Node one;
		Node two;
		
		one = first;
		two = first.next;
		
		while(two.next !=null){
			two = two.next;
			one = one.next;
		}
		return one;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
