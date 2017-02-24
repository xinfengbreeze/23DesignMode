package test;

import java.lang.annotation.Annotation;

public class Test {
	public static void main(String[] args){
//		System.out.println("-----------");
//		if(Bus.class.isAnnotationPresent(Run.class)){
//			System.out.println("是run注解");
//		}
//		for(Annotation cAnnotation : Bus.class.getAnnotations()){
//			Class annotationType =  cAnnotation.annotationType();
//			System.out.println("User类上的注释有: " +annotationType);
//		}
//		Run run = Bus.class.getAnnotation(Run.class);
//		System.out.println(run.name()+"    "+run.speed() +"    ");
//		for(String s : run.road()){
//			System.out.println(s);
//		}


		String a ="abc";
		String b ="abc";
		String c = new String("abc");
		System.out.println(a == b);
		System.out.println(a == c);
		tt(new String("abc"));
	}

	public static void tt(String nation){
		String a ="abc";
		System.out.println(a == nation);
	}
}
