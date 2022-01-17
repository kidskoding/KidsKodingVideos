package KidsKodingVideos;
import pies.*;
public class ModifiersDemoV2 extends ModifiersDemo { //inheritance. subclass
    public static void main(String[] args) {
        ModifiersDemoV2 m = new ModifiersDemoV2();
        m.jessie(m.rossKids);
    }
    @Override
    protected void jessie(String[] rossKids) {
        for(String i : rossKids) {
            System.out.print(i + " ");
        }
    }
}
