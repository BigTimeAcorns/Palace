public class Main {
    public static void main(String[] args) {
        Palace p = new Palace("New York");
        System.out.println(p.setLock("APCSA"));
        System.out.println(p.setLock("password"));
        System.out.println(p.setColor("purple"));
        System.out.println(p.setLock("password"));
        System.out.println(p.setColor("purple"));
        System.out.println(p.setColor("red"));
        System.out.println(p.getColor());
        System.out.println(p.addRoom());
        System.out.println(p.addRoom());
        System.out.println(p.getRooms());
        System.out.println(p.getLocation());
    }

}
