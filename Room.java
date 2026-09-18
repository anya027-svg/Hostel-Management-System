public class Room {

    private int roomNumber;
    private int capacity;
    private int occupied;

    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.occupied = 0;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getOccupied() {
        return occupied;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void increaseOccupied() {
        if (occupied < capacity) {
            occupied++;
        }
    }

    public void decreaseOccupied() {
        if (occupied > 0) {
            occupied--;
        }
    }

    public void displayRoom() {

        System.out.println("----------------------------");
        System.out.println("Room Number : " + roomNumber);
        System.out.println("Capacity    : " + capacity);
        System.out.println("Occupied    : " + occupied);
        System.out.println("Available   : " + (capacity - occupied));

        if (occupied < capacity) {
            System.out.println("Status      : Available");
        } else {
            System.out.println("Status      : Full");
        }

        System.out.println("----------------------------");
    }
}