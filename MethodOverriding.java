package KidsKodingVideos;
class Spongebob {
    void nickelodeonShows() {
        System.out.println("Spongebob Squarepants");
    }
}
class Patrick extends Spongebob {
	@Override
    void nickelodeonShows() {
        System.out.println("Loud House");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Spongebob obj2 = new Patrick();
        obj2.nickelodeonShows();
    }
}