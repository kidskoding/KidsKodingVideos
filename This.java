package KidsKodingVideos;
public class This {
    public int x = 3;
    public int y = 5;

    public This(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        This t = new This(5, 3);
        System.out.println(t.x / t.y);
    }
}
