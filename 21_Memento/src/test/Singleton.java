package test;

public class Singleton {
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		return Student.INSTANCE.getSingleton();
	}
	
	
	private enum Student{
		INSTANCE;
		Singleton signleton;
		private Student(){
			signleton = new Singleton();
		}
		public Singleton getSingleton(){
			return signleton;
		}
	}
}
