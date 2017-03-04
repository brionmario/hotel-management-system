/**
 * Created by Brion Mario on 17/07/2016.
 */
public class Room {
    private int roomNumber;
    private String firstName;
    private String lastName;
    private String title;
    private static int x=-1;

    @Override
    public String toString() {
        return
                roomNumber +
                        " " + title +
                " " + firstName +
                " " + lastName ;
    }

    public Room(){

        firstName = "empty";
        lastName = "empty";
        title ="empty";
        roomNumber=x;
        x++;
        //System.out.println("New Room Created Room number " + roomNumber + "\n");
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {

        if(roomNumber>=0 && roomNumber<10) {
            this.roomNumber = roomNumber;
        }else{
            System.out.println("The room you requested doesn't exist.");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

