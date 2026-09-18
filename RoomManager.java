import java.util.ArrayList;

public class RoomManager {

    private ArrayList<Room> rooms = new ArrayList<>();

    // Add room
    public void addRoom(Room room) {

        for (Room r : rooms) {

            if (r.getRoomNumber() == room.getRoomNumber()) {
                System.out.println("Room number already exists!");
                return;
            }
        }

        rooms.add(room);

        System.out.println("Room added successfully!");
    }

    // View rooms
    public void viewRooms() {

        if (rooms.isEmpty()) {
            System.out.println("No rooms found.");
            return;
        }

        System.out.println("\n===== ALL ROOMS =====");

        for (Room room : rooms) {
            room.displayRoom();
        }
    }

    // Search room
    public void searchRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {
                room.displayRoom();
                return;
            }
        }

        System.out.println("Room not found.");
    }

    // Allocate room
    public void allocateRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                if (room.getOccupied() < room.getCapacity()) {

                    room.increaseOccupied();

                    System.out.println(
                            "Room allocated successfully!"
                    );

                } else {

                    System.out.println(
                            "Room is already full!"
                    );
                }

                return;
            }
        }

        System.out.println("Room not found.");
    }

    // Vacate room
    public void vacateRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                if (room.getOccupied() > 0) {

                    room.decreaseOccupied();

                    System.out.println(
                            "Room vacated successfully!"
                    );

                } else {

                    System.out.println(
                            "Room is already empty!"
                    );
                }

                return;
            }
        }

        System.out.println("Room not found.");
    }
}