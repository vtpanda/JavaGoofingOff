public class Question3 {
    public static void main(String[] args) throws Exception {

        
        //create variable controller1, 
        //instantiate a new Player object, 
        //put this new Player object off in memory somewhere that we don't have direct access to
        //and assign its memory address to controller1
        Player controller1 = new Player();

        //create variable controller2, and set it to the same memory address as controller1
        Player controller2 = controller1;

        //NOTE that there is only one Player object instantiated in memory, 
        // and both controller1 and controller2 point to this same object

        //If instead I had done this:
        // Player controller2 = new Player();
        //Now I've got two objects in memory, and controller1 points to one and controller2 points to the other
        // and changes made on one wouldn't be seen by the other

        //Take the memory address in controller1 (which is the same memory address as controller2),
        // find the Player object at that location in memory
        // and perform the changeOutfit() method on it
        //Notably, a String object within the Player object will be created and assigned to its internal variable, 
        // but it doesn't mean that a new Player object will be created
        controller1.changeOutfit();

        //Because controller1 and controller2 point to the same object, both will "see" the changes made
        System.out.print(controller1.getOutfit());
        System.out.print(controller2.getOutfit());
    }
}
