/*
* The Triangle program implements an application that
* creates a triangle.
*
* @author  Ben Whitten
* @version 1.1
* @since   2020-12-17
*/

import java.util.ArrayList;  // Import the ArrayList class

///////////////////////////////////////////////////////////////////////////////

public class Triangle {

  // variables for later.
  private final int maxNumberOfValues = 3;
  private int numberOfAA = 0;
  private int numberOfAB = 0;
  private int numberOfAC = 0;
  private int numberOfLA = 0;
  private int numberOfLB = 0;
  private int numberOfLC = 0;
  private int intAngle;
  private int intSideLength;
  private int angleA;
  private int angleB;
  private int angleC;
  private int sideA;
  private int sideB;
  private int sideC;
  private String returnValue;
  private String type;

  // THE ANGLES.
  /////////////////////////////////////////////////////////////////////////////
  public String setAngle (String angle, String whichAngle) {
    if (whichAngle.equals("A")) {
      returnValue = setAngleA(angle);

    } else if (whichAngle.equals("B")) {
      returnValue = setAngleB(angle);

    } else if (whichAngle.equals("C")) {
      returnValue = setAngleC(angle);

    } else {
      returnValue = "-1";
    }

    return returnValue;
  }

  protected String setAngleA (String angle) {
    try {
      numberOfAA += 1;
      intAngle = Integer.parseInt(angle);
      angleA = intAngle;
      returnValue = "1";
    } catch (Exception e) {
      returnValue = "-1";
    }

    return returnValue;

  }

  protected String setAngleB (String angle) {
    try {
      numberOfAB += 1;
      intAngle = Integer.parseInt(angle);
      angleB = intAngle;
      returnValue = "1";
    } catch (Exception e) {
      returnValue = "-1";
    }

    return returnValue;

  }

  protected String setAngleC (String angle) {
    try {
      numberOfAC += 1;
      intAngle = Integer.parseInt(angle);
      angleC = intAngle;
      returnValue = "1";
    } catch (Exception e) {
      returnValue = "-1";
    }

    return returnValue;

  }

  /////////////////////////////////////////////////////////////////////////////
  
  // THE SIDE LENGTHS.
  /////////////////////////////////////////////////////////////////////////////
  public String setSideLength (String sideLength, String whichSide) {
    if (whichSide.equals("a")) {
      returnValue = setSideA(sideLength);

    } else if (whichSide.equals("b")) {
      returnValue = setSideB(sideLength);

    } else if (whichSide.equals("c")) {
      returnValue = setSideC(sideLength);

    } else {
      returnValue = "-1";
    }

    return returnValue;
  }

  protected String setSideA (String sideLength) {
    try {
      numberOfLA += 1;
      intSideLength = Integer.parseInt(sideLength);
      sideA = intSideLength;
      returnValue = "1";
    } catch (Exception e) {
      returnValue = "-1";
    }

    return returnValue;

  }

  protected String setSideB (String sideLength) {
    try {
      numberOfLB += 1;
      intSideLength = Integer.parseInt(sideLength);
      sideB = intSideLength;
      returnValue = "1";
    } catch (Exception e) {
      returnValue = "-1";
    }

    return returnValue;

  }

  protected String setSideC (String sideLength) {
    try {
      numberOfLC += 1;
      intSideLength = Integer.parseInt(sideLength);
      sideC = intSideLength;
      returnValue = "1";
    } catch (Exception e) {
      returnValue = "-1";
    }

    return returnValue;

  }

  /////////////////////////////////////////////////////////////////////////////

  //public String getArea() {
    
  //}
  
  public String getName() {
    returnValue = isTriangleValid();
    if (returnValue == "-1") {
      type = "-1";
    } else {
      if ((sideA == sideB) || (angleA == angleB)
          || (sideB == sideC) || (angleB == angleC)
          || (sideA == sideC) || (angleA == angleC)) {

        type = "Isosceles";

      } else if ((angleA > 90) || (angleB > 90) || (angleC > 90)) {
      
        type = "Obtuse";
      
      } else if (((sideA == sideB) && ((angleA == 60) || (angleB == 60)
                                       || (angleC == 60)))
          || ((sideB == sideC) && ((angleA == 60) || (angleB == 60)
                                   || (angleC == 60)))
          || ((sideA == sideC) && ((angleA == 60) || (angleB == 60)
                                   || (angleC == 60)))
          || ((angleA == 60) && (angleB == 60)) 
          || ((angleB == 60) && (angleC == 60)) 
          || ((angleA == 60) && (angleC == 60))) {
      
        type = "Equalateral";
      
      } else if ((angleA == 90) || (angleB == 90) || (angleC == 90)) {
      
        type = "Right-angled";
      
      } else {
        type = "Scalene";
      }
    }
    
    return type;

  }

  protected String isTriangleValid() {
    if ((numberOfAA > 1) || (numberOfAB > 1) || (numberOfAC > 1)
        || (numberOfLA > 1) || (numberOfLB > 1) || (numberOfLC > 1)) {
      returnValue = "-1";
      
    } else if ((sideA > 0) && (sideB > 0) && (sideC > 0)) {
      if ((sideA > sideB) && (sideA > sideC)) {
        if (sideA > (sideB + sideC)) {
          returnValue = "-1";
        }
      
      } else if ((sideB > sideA) && (sideB > sideC)) {
        if (sideB > (sideA + sideC)) {
          returnValue = "-1";
        }
    
      } else if ((sideC > sideA) && (sideC > sideB)) {
        if (sideC > (sideA + sideB)) {
          returnValue = "-1";
        }
      }

    } else if ((angleA >= 180) || (angleB >= 180) || (angleC >= 180)) {
      returnValue = "-1";

    } else {
      returnValue = "1";
    }
    
    return returnValue;
    
  }
}
