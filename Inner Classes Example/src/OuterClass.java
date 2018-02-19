
public class OuterClass {
	
	public void outerClassMethod(){
		System.out.println("This is outer class method called");
	}
	protected void outerClassMethod(String s){
		System.out.println("This is outer class method called with params :"+s);
	}
	
	class InnerClass{
		public void innerClassMethod(){
			System.out.println("This is inner class method called");
		}
		
		public void callOuterClassMethodFromInnerClass(){
			outerClassMethod("called from innerClass");
		}
	}
}


