package exam1;
public class Question2{
public class Data {
	
	public class Node{
		int data;
		Node next;
	}
	
	Node first,last;
	int total;
	
	Data(){
		first = null;
		last = null;
		total = 0;
	}

	void add(int a){
		
		Node newnode = new Node();
		newnode.data = a;
		newnode.next = null;
		
		if(first == null){
			
			first = newnode;
			last = first;
		}
		
		Node oldlast = last;
		last = new Node();
		last.data = a;
		last.next = null;
		
		oldlast.next = last;
		total++;
		
	}
	
	int remove(){
		int value;
		value = first.data;
		first = first.next;
		return value;
	}
	
	int getValue(int i){
		Node a = first;
		int k = 0;
		if(i ==1){
			return first.data;
		}
		
		if(i > total){
			return -1;
		}
		while(a.next!= null && k < i){
			a = a.next;
			k++;
		}
		return a.data;
	}
	
	
	void print(){
		Node a = first;
		
		while(a.next != null){
			
			System.out.println(a.data);
			a = a.next;
		//
		}
		System.out.println(a.data);
	}
	
	
	
	public void main(String[] args) {
	
		Data test = new Data();
		test.add(1);
		test.add(9);
		test.add(4);
		test.add(5);
		test.add(10);
		test.add(0);
		//test.remove();
		//test.remove();
		System.out.println(test.getValue(0));
		System.out.println(test.getValue(3));
		
		//test.print();

	}

}}
