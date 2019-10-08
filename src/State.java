import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class State {

    private static String[][] STATE = {{"Maryland", "Oriole", "Black-eyed Susan"},
            {"Virginia", "Northern Cardinal", "American Dogwood"},
            {"Delaware", "Blue Hen Chicken", "Peach Blossom"}};

    public static int getStored(String stateEntered[][], String state){
        int hold = 0;

        for(int i = 0; i < stateEntered.length; i++){
            if(stateEntered[i][0].equalsIgnoreCase(state)) {
                hold = i;
            }
        }
        System.out.println(hold);//testing
        return hold;
    }//used to try to get data int stateEntered Array list

    public static void main(String[] args){

        String state;
        Scanner input = new Scanner(System.in);

        ArrayList<String> statesEntered = new ArrayList<>();// trying to use to store previous state information entered
       // while(state.equals("none") == false) {
        while(true){
            System.out.println("Please enter the state you would like information on");
            state = input.nextLine().trim();//get rid of spaces
           //state = state.toLowerCase();//lower case, so regardless of capatilization it'll be the same entry. Could switch to ignore case


            if (state.equals("none")) {
                System.out.println("**** Thank You ****");
                for(String stateEntered : statesEntered){//go through stored states
                    int print = getStored(STATE, stateEntered);
                    System.out.println(Arrays.toString(STATE[print]));//trying to print out info of state
                    System.out.println("Hello");
                }
                break;
            }else{
                int test = getStored(STATE, state);
                System.out.println("State Bird: " + STATE[test][1]);
                System.out.println("State Flower: " + STATE[test][2]);
                statesEntered.add(state);
            }
           /* else if ("Maryland".equalsIgnoreCase(state)/*state.equals("maryland")) {
                System.out.println("State Bird: " + STATE[0][1]);
                System.out.println("State Flower: " + STATE[0][2]);
                state = "Maryland";
                int test = getStored(STATE, state);
                statesEntered.add(state);//trying to add to the array list
            }
            else if (state.equals("virginia")) {
                System.out.println("State Bird: " + STATE[1][1]);
                System.out.println("State Flower: " + STATE[1][2]);
                state = "Virginia";
                int test = getStored(STATE, state);
                statesEntered.add(state);//trying to add to the array list
            }
           else if (state.equals("delaware")) {
                System.out.println(STATE[2][1]);
                System.out.println(STATE[2][2]);
            }*/
        }

    }
}
