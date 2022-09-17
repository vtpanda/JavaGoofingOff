public class Player {

    private String outfit;

    public Player() {
        outfit = "tshirt";
    }

    public void changeOutfit() {
        //note that this does in fact create a new String object, 
        //but it's still encapulated within the same Player object
        outfit = "sweatshirt";
    }

    public String getOutfit() {
        return outfit;
    }
}
