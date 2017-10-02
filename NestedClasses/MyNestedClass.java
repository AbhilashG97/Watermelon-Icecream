public class MyNestedClass {

	//Shadowing of inner classes

	private String sampleText = "Watermelon";
	
	public class InnerClass{
		private String sampleText = "Leechi";
		public void printText(){
			System.out.println(sampleText);
			System.out.println(MyNestedClass.this.sampleText);
		}
	}
}