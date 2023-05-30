package com.cg.mapinterface;
import java.util.*;
public class LinkedHashMapDemo {
// Program to demonstrate LinkedHashMap and to demonstrate how to use user defined datatype in map.
	public static void main(String[] args) {
		// The main difference between HashMaps and LinkedHashMap is LinkedHashMap maintains Order of Output and order of insertion.
		LinkedHashMap<Object, Integer> gradeList=new LinkedHashMap<>();
		//Student sZero=new Student(24,"Bat");
		//Student sZero=new LinkedHashMapDemo().new Student(24,"Bat");
		LinkedHashMapDemo l=new LinkedHashMapDemo();
		Student sZero=l.new Student(24,"Bat"); // com.cg.mapinterface.LinkedHashMapDemo$Student@1c4af82c=null

		gradeList.put(Student.roll(1), 99);
		gradeList.put(Student.roll(2), 98);
		gradeList.put(Student.roll(3), 92);
		gradeList.put(Student.roll(4), 99);
		gradeList.put(Student.roll(5), 97);
		gradeList.put(Student.roll(6), 98);
		gradeList.put(Student.roll(3), 99); // Value is updated but position of output is taken as the first instance of the key's occurance.
		//gradeList.put(sZero, 99.9);
		System.out.println(gradeList);// we can see Order of output is order of insertion.
		
		System.out.println("--------------------------------------------------------");
		//Iteration:
		Spliterator spitr=gradeList.entrySet().spliterator();
		spitr.forEachRemaining(Student::monitor);
	}
	public class Student{
		int rollNo;
		String name;
		Student(int rollNo,String name){
			this.name=name;
			this.rollNo=rollNo;
			//Student s=new Student(rollNo,name);
		}
		// Method to help spliterator
		public static void monitor(Object s) {
			Map.Entry<Integer, Integer> m=(Map.Entry<Integer, Integer>) s;
			 System.out.println("Roll Number: "+m.getKey()+"->"+m.getValue()+"/100");
		}
		public static Object indirect(Student s) {
			
			return s.rollNo+s.name;
		}
		public static int roll(int rollNo) {
			return rollNo;
		}
	}

}
