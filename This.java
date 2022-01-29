package KidsKodingVideos;
public class This {
    private int x = 3;
    private int y = 5;

    public This(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        This t = new This(5, 3);
        System.out.println(t.x / t.y);
    }
}
