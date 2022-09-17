public class Question9 {
    public static void main(String[] args) throws Exception {
        //both name and name2 point to the same String object, 
        //but it doesn't really matter because String objects are immutable;
        // there are no methods in String that will change the underlying object 
        // which means that there's nothing you can do to name that will also affect name2
        String name = "Joe";
        String name2 = name;

        //creates a new String object because .toLowerCase() creates a new String object rather than modifies the existing String
        name = name2.toLowerCase();
        System.out.println(name + name2);
    }
}
