package Queue;

public class dynamimcqueue extends queue{

	
//	when the new version of a code is released we always override the data 
//	it will take place of the earlier data function
//	here the need of linked list arises
//	we need to expand the array
	
	@Override
	public void enqueue(int item) throws Exception{
		if(this.data.length==this.size())
		{
			int []os =this.data;
			int []ns = new int[2*os.length];
			
			for(int i=0;i<os.length;i++){
				int idx=(this.front+i)%this.data.length;
				ns[i]=os[idx];
			}
			this.data = ns;
			front=0;
		}
//		We can excess our parent class using super
		super.enqueue(item);
	}
}
