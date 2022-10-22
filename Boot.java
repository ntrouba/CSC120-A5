/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  /*
   * Class for boot
   */
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * Modify this method to print ASCII Art Boot
     */
    public void display() {
    /*
     * Left boot and right boot display
     */
        if (this.direction.equals("left")) {
          //System.out.println("Left boot?");
          System.out.print("       |______|");
        } else if (this.direction.equals("right")) {
          //System.out.println("Right boot?");
          System.out.print("|______|");
        } else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
    /*
     * Displays the left and right boot
     * @param args
     * @return myLeftBoot, myRightBoot
     */
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
