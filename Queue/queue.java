package Queue;

public class queue {

	protected int []data;
	protected int front;
	protected int size;
	
	public queue(){
		this(5);
	}
	
	public queue(int cap){
		this.data= new int[cap];
		this.front=0;
		this.size=0;
	}
	
	public void enqueue(int item) throws Exception{
		
		if(this.size==this.data.length){
			throw new Exception("queue is full.");
		}
		int idx=(this.front+this.size)%this.data.length;
		this.data[idx]=item;
		this.size++;
	}
	
	public int dequeue() throws Exception{
		
		if(this.size==0){
			throw new Exception("queue is Empty.");
		}
		int rv=this.data[this.front];
		this.data[this.front]=0;
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return rv;
	}
	
	public int getfirst(){
		int val=this.data[this.front];
		return val;
	}
	
	public int size(){
		return this.size;
		
	}
	
	public boolean isempty(){
		return this.size==0;
	}
	
	public void display(){
		for(int i=0; i<this.size;i++){
			System.out.print(this.data[(i+this.front)%this.data.length] + " ");
		}
		System.out.println();
	}
}
