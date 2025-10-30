import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void testCheckInMakesRoomOccupiedAndDirty() {
        Room room = new Room(2, 100.00, false, false);
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void testCheckoutMakesRoomNotOccupied() {
        Room room = new Room(2, 100.00, true, true);
        room.checkout();
        assertFalse(room.isOccupied());
    }

    @Test
    public void testCleanRoomMakesRoomNotDirty() {
        Room room = new Room(2, 100.00, false, true);
        room.cleanRoom();
        assertFalse(room.isDirty());
    }

    @Test
    public void testCannotCheckInIfAlreadyOccupied() {
        Room room = new Room(2, 100.00, true, false);
        room.checkIn();
        assertTrue(room.isOccupied()); // stays occupied
    }

    @Test
    public void testCannotCleanIfOccupied() {
        Room room = new Room(2, 100.00, true, true);
        room.cleanRoom();
        assertTrue(room.isDirty()); // still dirty
    }
}

