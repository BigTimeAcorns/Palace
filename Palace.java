public class Palace {

    // These are all the local variables for the class
    private boolean locked;
    private int numberOfRooms;
    private String location;
    private String color;

    // The constructor for the object and all its attributes
    public Palace(String l) {
        location = l;
        locked = false;
        numberOfRooms = 0;
        color = "white";
    }

    // Takes a color and sees if its a valid color
    public String setColor(String c) {
        if (!locked) {
            String[] colors = { "white", "black", "red", "green", "yellow", "brown", "beige" };
            for (int i = 0; i < colors.length; i++) {
                if (c == colors[i]) {
                    color = colors[i];
                    return c + "is a valid color and is now the color of your palace";
                }
            }
            return "That is not a valid color";
        }
        return "The palace is locked";
    }

    // returns the color of the palace
    public String getColor() {
        return color;
    }

    // returns whether or not the palace is locked
    public boolean getLocked() {
        return locked;
    }

    // returns the number of rooms in the palace
    public int getRooms() {
        return numberOfRooms;
    }

    public String move(String p) {
        String[] locations = { "New York", "San Diego", "New Orleans", "Chicago", "Denver", "Seatle", "Honolulu" };
        for (int i = 0; i < locations.length; i++) {
            if (p == locations[i]) {
                color = locations[i];
                return "You moved your palace to: " + location;
            }
        }
        return "You can't move your palace to: " + location;
    }

    // returns the location
    public String getLocation() {
        return location;
    }

    // sets the locked variable to either true or false passed on the password and
    // the current value
    public String setLock(String p) {
        if (p == "password") {
            if (locked) {
                locked = false;
                return "locked = false";
            }
            locked = true;
            return "locked = true";
        }
        return "wrong password";
    }

    // adds 1 to the room variable
    public String addRoom() {
        numberOfRooms++;
        return "added a room to palace";
    }

}
