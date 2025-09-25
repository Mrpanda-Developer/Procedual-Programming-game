public class takeAction {
    public static int Visitor(String action, int currentState) {
        if (currentState == 0 && action.equals("open the door")) {
            return 1; // you start the race
        } else if (currentState == 0 && action.equals("take item")) {
            return 2; // you take the Steel Ball
        } else if (currentState == 1 && action.equals("go east")) {
            return 3; // you encounter Diego Brando
        } else if (action.equals("quit")) {
            return 666; // quit state
        } else {
            return currentState; // no state change
        }
    }
}
