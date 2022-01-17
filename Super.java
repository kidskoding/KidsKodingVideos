package KidsKodingVideos;
class Parent { //superclass
	public void humanFood() { //superclass method
		System.out.print("Green ");
	}
}
class Child extends Parent { //childclass 
	@Override //annotation telling Java to override the method
	public void humanFood() { //Override the humanFood method
		super.humanFood(); /*the super keyword is used to make a call to any method
* that is in a superclass (parent class) */
		System.out.println("Beans"); 
	}
}
public class Super {
	public static void main(String[] args) {
		Child c = new Child(); //Creates object since method is instance (non-static)
		c.humanFood(); //calls method in our driver code
	}
}