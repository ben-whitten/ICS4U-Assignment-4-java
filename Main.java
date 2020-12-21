/*
* The Main program implements an application that
* can find the triangle.
*
* @author  Ben Whitten
* @version 1.1
* @since   2020-12-17
*/

import java.util.Scanner;  // Import the Scanner class

///////////////////////////////////////////////////////////////////////////////

class Main {

  ////////////////////////////////////////////////////////////////////////////

  /**
   * This function handles all the inputs and outputs.
   */
  public static void main(String[] args) {

    // Creating a scanner.
    Scanner scanInputType = new Scanner(System.in);

    // Creating a scanner.
    Scanner scanSideLength = new Scanner(System.in);
    
    // Creating a scanner.
    Scanner scanAngle = new Scanner(System.in);

    // Creating Triangle.
    Triangle someTriangle = new Triangle();
    
    // Variables for later.
    final int maxInputs = 3;
    String returnValue;
    int error = 0;

    for (int inputNumber = 0; inputNumber < maxInputs; inputNumber++) {

      // Asking what to option the user want to input.
      
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"
                          + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.println("");
      System.out.println("                 Angle A                "
                          + '\n' + "                    /\\                  "
                          + '\n' + "                   /  \\                "
                          + '\n' + "                  /    \\                "
                          + '\n' + "          side c /      \\ side b        "
                          + '\n' + "                /        \\              "
                          + '\n' + "               /          \\             "
                          + '\n' + "              /            \\            "
                          + '\n' + "     Angle B /______________\\ Angle C   "
                          + '\n' + "                  side a                 "
                          + '\n');
      System.out.println("");
      System.out.println("Would you like to input a side length or an angle? "
                        + " [l = side length] [a = angle]");
      String option = scanInputType.nextLine();
      System.out.println();

      // If option chosen is side length.
      if (option.equals("l")) {
        System.out.println("Chosen option: Side Length");
        System.out.println("");
        System.out.println("Input which side to input [a] [b] [c]:");
        String whichSide = scanSideLength.nextLine();
        System.out.println("");
        // Getting side length.
        System.out.println("Input the length of side " + whichSide + ":" );
        String sideLength = scanSideLength.nextLine();

        returnValue = someTriangle.setSideLength(sideLength, whichSide);

        if (returnValue.equals("-1")) {
          error = 1;
          System.out.println("");
          System.out.println("ERROR: Failed to set side length");
          System.out.println("");
          break;

        } else {
          System.out.println("");
          System.out.println("Side length was set successfully");
          System.out.println("");
        }

      // If option chosen is angle.
      } else if (option.equals("a")) {
        System.out.println("Chosen option: Angle");
        System.out.println("");
        System.out.println("Input which angle to input [A] [B] [C]:");
        String whichAngle = scanAngle.nextLine();
        System.out.println("");
        // Getting angle mesurment.
        System.out.println("Input the value of angle " + whichAngle + ":");
        String angle = scanAngle.nextLine();

        returnValue = someTriangle.setAngle(angle, whichAngle);

        if (returnValue.equals("-1")) {
          error = 1;
          System.out.println("");
          System.out.println("ERROR: Failed to set angle");
          System.out.println("");
          break;

        } else {
          System.out.println("");
          System.out.println("Angle was set successfully");
          System.out.println("");
        }

      // Catching bob.
      } else {
        error = 1;
        System.out.println("ERROR: Invalid Input");
        break;
      }
    }

    if (error == 0) {
      String type = someTriangle.getName();
      if (type.equals("-1")) {
        System.out.println("ERROR: Invalid Triangle");
      } else {
        System.out.println("");
        System.out.println(type);
        System.out.println("");
      } 
    }
  }
}
