package KidsKodingVideos;
public class AppleStore {
	private String phoneColor;
	private String phoneSize;
	private boolean phoneCall;
	public static void main(String... args) { 
		AppleStore a = new AppleStore("(PRODUCT) RED", "128GB");
		System.out.println(a.isRinging(a.phoneCall));
	}
	public AppleStore(String phoneColor, String phoneSize) {
		System.out.println(phoneColor);
		System.out.println(phoneSize);
	}
	public boolean isRinging(boolean phoneCall) {
		if(phoneCall)
			return true;
		return false;
	}
}
