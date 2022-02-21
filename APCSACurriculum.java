class A { //parent (super) class
	public void showAlbum() {
		System.out.println("DRIP SEASON 4 EVER - Gunna");
	}
}
class B extends A { //child (sub) class
	@Override //optional java annotation that tells a COMPILER a method from a super class is being overridden
	public void showAlbum() {
		System.out.println("Certified Lover Boy - Drake");
	}
}
public class APCSACurriculum {
	public static void main(String[] args) {
		A b = new B(); //This is polymorphism. Since B inherits A you can all an instance of class (object) A and pass it into B's constructor.
		//Since we are passing into B's constructor, the showAlbum() method from class B is getting called and printed to the terminal
		b.showAlbum(); //Calls method from class B and prints it to terminal
	}
}
