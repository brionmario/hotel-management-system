/**
 * Created by Brion Mario on 1/08/2016.
 */

public class Queue {
    //variable to hold the size of the queue
    private static int queueSize = 7;
    //a string array to store the que
    static String cusQueue[] = new String[queueSize];
    //variable to use when adding into the queue
    static int add = 0;
    //variable to use when reading the queue
    static int read = 0;
    //variable to control the maximum size of the array
    static int maxQueue = 0;
    //variable to keep track of the element count in the array
    static int count = 0;

        //method to add a customer to the queue
        public static void addqueue(String firstName) {
            //increase the maxQueue by 1
            maxQueue++;
            //check if the que is not full
            if(add<queueSize) {
                cusQueue[add] = firstName;
                //System.out.println("Customer " + firstName + " is in the " + add + " position of the queue \n");
                //setting the current size of the que
                add=maxQueue;
            }else{
                //if the maximum limit is reached
                if(maxQueue>=queueSize){
                    //displaying an error msg
                    System.out.println("The queue is full!");
                    //deleting the oldest que object
                    System.out.println("Customer " + cusQueue[0] + " will be removed from the que. \n");
                    cusQueue[0] = null;
                    //initializing the add and read variables back to 0 and 1
                    add=0;
                    read=1;
                }else{
                    add=maxQueue;
                }
            }
        }

        void displayqueue() {

            System.out.println("\t------------First 3 Customers------------\n");

            //will iterate three time and display the 1st 3 in the queue
            for (int i =0; i < 3; i++) {

                //will check if the index is empty
                if (cusQueue[read] != null) {

                    System.out.println(cusQueue[read]);
                    //remove the read element
                    maxQueue--;
                    //increase the read variable
                    read++;

                    //if all of the items are read
                    if( read==queueSize){
                        //initialize back to null
                        for (int j =0; j < 7; j++) {
                            cusQueue[j] = null;
                        }
                        count++;
                        //to display the most first details in queue
                        read=count;

                    }
                }else{
                    //if there's no one in the queue
                    System.out.println("------------Slot is empty------------");
                }
            }
            System.out.println("");

        }

    void deleteQueue(String firstName) {
        for(int i=0;i<7;i++){
            if(cusQueue[i].equalsIgnoreCase(firstName)){
                cusQueue[i] = null;
            }
        }
    }
    }

