package com.iiht;


class Singleton{
	public static Singleton s;
	private Singleton(){
		System.out.println("SingletonDemo");
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s=new Singleton();
		}
		return s;
	}
}

public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1=Singleton.getInstance();
		
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s3.hashCode());
		System.out.println(s1+" "+s2+ " "+s3);
		
		
		
		

	}

}
