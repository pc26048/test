package com.iiht;



class User{
	String type;
}
class Employee{
	String type;
}

class ObjectBuilderDemo{
	Object o;
	Object build(String type) {
		
		if(type.equals("u")) {
			o=new User();
		}
		else {
			o=new Employee();
		}
		return o;
		
	}
}
public class BuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String type="u";
		ObjectBuilderDemo demo=new ObjectBuilderDemo();
		System.out.println(demo.build(type));

	}

}
