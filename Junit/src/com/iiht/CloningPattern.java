package com.iiht;



class Student implements Cloneable{
	
	Integer cloneId;
	String name;
	Student(){
	
		cloneId=45;
		name="Prakash";
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
	
}

public class CloningPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Student st=new Student();
		System.out.println(st.cloneId+" "+" "+st.name+" "+st.hashCode());
		
		Student st1=(Student)st.clone();
		
		System.out.println(st1.cloneId+" "+st1.name+" "+st1.hashCode());
		
		Student st2=(Student)st.clone();
		System.out.println(st2.cloneId+" "+st2.name+" "+st2.hashCode());
		
		
		

	}

}
