package com.cg.genericclass;
// In this program I will demonstrate how to build class that accepts generic.

//Generic type class
class GenericClass<T>{
	T objectOfTtype;
	GenericClass(T objectTtype){
		objectOfTtype=objectTtype;
		System.out.println(print());
	}
	T print() {
		return objectOfTtype;
	}
}


// Driver class
public class GenericClassDemo {
	public static void main(String[] args) {
		//Basic usage demonstration
		GenericClass<String> gString=new GenericClass<>("String Type Input");
		GenericClass<Integer> gInteger=new GenericClass<>(1010101010);
		GenericClass<Boolean> gBoolean=new GenericClass<>(true);
		GenericClass<Float> gFloat=new GenericClass<>(73737f);
	}

}
