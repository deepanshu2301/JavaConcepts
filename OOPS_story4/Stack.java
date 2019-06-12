package OOPS_story4;

// in interface only declaration is given, we cannot write a function. we can't change the return type of the function declared in interface.

//it is the duty of the person writing the interface to give the body to different functions declared in the stack.

// override here confirms that we are giving body to the function in the implemented class only  

// in implementation we can make our own new function

// we can overload the function also



public class Stack implements Stackl {

	public void push(int a, int item) {
		// TODO Auto-generated method stub

	}

	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void push(int item) {
		// TODO Auto-generated method stub

	}
}
