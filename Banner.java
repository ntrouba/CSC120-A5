/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * Modify this method to print a decorative banner, resized to fit the message
     */
    public void display() {
    /*
     * Establishes and prints a decorative banner
     * @param counter
     * @return
     */
       // System.out.println(this.message);
        int counter = 0;
        while (counter < this.message.length()){
            System.out.print("$*");
            counter++;
        }
        System.out.println();
        System.out.println("<3**"+this.message+"**<3");
        counter = 0;
        while (counter < this.message.length()){
            System.out.print("*$");
            
            
    
            counter++;
            
        }
        System.out.println();
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}
