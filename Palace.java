public class Palace {
    private boolean locked;
    private int numberOfRooms;
    public String location;

    public Palace(String l) {
        location = l;
        locked = false;
        numberOfRooms = 0;
    }

    public void paint(String color) {
        if (!locked) {
            System.out.println("Painting the palace in " + color + " color.");
        } else {
            System.out.println("Cannot paint the palace. It is locked.");
        }
    }

    public void lock() {
        locked = true;
        System.out.println("The palace at " + location + " is locked.");
    }

    public void buildRoom() {
        if (!locked) {
            numberOfRooms++;
            System.out.println("A new room is added to the palace. Total rooms: " + numberOfRooms);
        } else {
            System.out.println("Cannot build a room. The palace is locked.");
        }
    }
}
