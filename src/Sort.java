/**
 * Created by Brion Mario on 19/07/2016.
 */
public class Sort {
    //Displaying the sorted names
    public static void displaySorted(Room[] hotel){
        sortRooms (hotel);
        for ( int k = 0;  k < hotel.length;  k++ ) {
            if(!hotel[k].getFirstName().equals("empty") || !hotel[k].getLastName().equals("empty"))
            System.out.println(hotel[k].getFirstName() + " " + hotel[k].getLastName() );
        }
        System.out.println("");
    }

    //Sort the names in alphabetical order
    public static void sortRooms(Room[] hotel){
        String tempFName;
        String tempLName;

        boolean isSorted = true;

        for(int i=0;i<hotel.length -1 ;i++){
            for(int j=0;j<hotel.length-1;j++){
                //compares the ascii value
                if( hotel[ j ].getFirstName().compareToIgnoreCase( hotel [ j+1 ].getFirstName() ) > 0){

                    tempFName = hotel[j].getFirstName();
                    tempLName = hotel[j].getLastName();

                    hotel[j].setFirstName(hotel[j+1].getFirstName());
                    hotel[j].setLastName(hotel[j+1].getLastName()); // swapping

                    hotel[j+1].setFirstName(tempFName);
                    hotel[j+1].setLastName(tempLName);

                    isSorted = false;
                }
            }
            if(isSorted) break;
        }
    }
}
