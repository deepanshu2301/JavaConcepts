package Stack;

public class dynamicstack extends Stack{

	
//	when the new version of a code is released we always override the data 
//	it will take place of the earlier data function
//	here the need of linked list arises
//	we need to expand the array
	@Override
	public void push(int item) throws Exception{
		if(this.data.length==this.size())
		{
			int []os =this.data;
			int []ns = new int[2*os.length];
			
			for(int i=0;i<os.length;i++){
				ns[i]=os[i];
			}
			this.data = ns;
		}
		super.push(item);
	}
	
}
