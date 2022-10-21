/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    /* Parts of the Scarecrow
     * Uncomment remaining parts as you implement each class
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    private String message;

    /* Constructor
     * initialize remaining parts
     */
    public Scarecrow(Pumpkin h, Shirt s, Pants p, Boot l, Boot r, Banner b, String m) {
    /**
     * Initializes the scarecrow
     * @param
     * @return
     */
        head = h;
        body = s;
        legs = p;
        leftFoot = l;
        rightFoot= r;
        sign = b;
        message = m;
        



    }

    /* Displays the Scarecrow 
     * call the .display() method of each part... 
     *       ...in the right order!
    */
    public void display() {
    /*Displays the scarecrow
     * @param
     * @return
     */


        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
        }
        

    

    /* Main method (for testing) */
    public static void main(String[] args) {

        
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"), new Banner("meow"), new String());

        // If a message was passed in on the command line, extract and store it
        //  in Step 4, you'll pass this value along to your Banner constructor
        
        if (args.length > 0) {
             myScarecrow.message = args[0];
         }
         else{
            myScarecrow.message = "Slay";
         }

        myScarecrow.display();
        }
    

}
