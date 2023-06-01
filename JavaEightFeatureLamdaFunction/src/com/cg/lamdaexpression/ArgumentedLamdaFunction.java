package com.cg.lamdaexpression;
// To demonstrate how to use functional Interface with arguments

// Functional Interface with one argument:
	// Area of a Circle
	interface Circle{
		void area(Float f);// One argument
	}
//-----------------------------------------------------------------	
//Functional Interface with more than one arguments:
	// Area of a Rectangle
		interface Rectangle{
			float area(Float w,float h);// Two arguments
		}
		
public class ArgumentedLamdaFunction {
	public static void main(String[] args) {
		// Using Lamda Expression to implement the above two Interfaces:
		
		//Circles:
		Circle c=(Float f)->{System.out.println("Area of A Circle with Radius "+f+" is: "+f*f*3.14);};
		c.area(5f);
		
		//Rectangles:
		Rectangle r=(Float h,float w)->{System.out.println("Area of A Rectagle with height: "+h+" and width: "+w+" is: ");
		return h*w;};
		System.out.println(r.area(20f, 12));
		
		//If we only want to return the result, we can use this syntax: ()->();
		Rectangle rReturnOnly=(Float h,float w)->(h*w);
			System.out.println("Area of your Rectangle is: ");
			System.out.println(rReturnOnly.area(20f, 12));;
			
		
		
 
	}

}
