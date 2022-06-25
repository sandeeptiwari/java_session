interface Member{
    void watch();
    void organise();

}
class VIP implements Member {
    @Override
    public void watch() {
        System.out.println("VIP Member is watching ");
    }

    @Override
    public void organise() {
        System.out.println("VIP Member is Organising ");
    }
}
class General extends VIP{
    public void watch(){
        System.out.println("General member is Watching ");
    }
}
class Prime implements Member{
    public void watch(){
        System.out.println("Prime member is watching ");
    }

    @Override
    public void organise() {
        System.out.println("Prime member is organising ");
    }
}

public class Main {
    public static void main(String[] args) {
        VIP obj1 = new VIP();
        General obj2 = new General();
        obj1.watch();
        obj1.organise();
        obj2.watch();
        Prime obj3 = new Prime();
        obj3.watch();
        obj3.organise();
    }
}