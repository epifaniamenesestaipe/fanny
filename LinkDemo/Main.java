import java.util.*;
import java.lang.Math;
class Main {
  
  public static void main(String[] args) {
    System.out.println("Forme un polígono de 6 lados ingresando las coordinadas!");

    //declarando variables
    // String LinkPrimario = "https://www.keene.edu/campus/maps/tool/?coordinates=";
    // String intermedioVariable = "%2C%20";
    // String finalVariable = "%0A";
    // String Cordinantea1 = "-72.2814560";
    // String Cordinantea2 = "42.9270721";
    // String Cordinanteb1 = "-72.2790098";
    // String Cordinanteb2 = "42.9267971";
    // String Cordinantec1 = "-72.2796321";
    // String Cordinantec2 = "42.9255323";
    // String Cordinanted1 = "-72.2820783";
    // String Cordinanted2 = "42.9257601";
    // String Cordinantee1 = "-72.2814989";
    // String Cordinantee2 = "42.9270485";

    // System.out.println("El link es: " + LinkPrimario + Cordinantea1 + intermedioVariable + Cordinantea2 + finalVariable + Cordinanteb1 + intermedioVariable + Cordinanteb2 + finalVariable + Cordinantec1 + intermedioVariable + Cordinantec2 + finalVariable + Cordinanted1 + intermedioVariable+ Cordinanted2 + finalVariable+ Cordinantee1 + intermedioVariable + Cordinantee2);

    // desde aqui
    String LinkPrimario = "https://www.keene.edu/campus/maps/tool/?coordinates=";
     String intermedioVariable = "%2C%20";
    String finalVariable = "%0A";
    String resultado;

    Double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6,y6 ;


    Scanner lector = new Scanner(System.in);
    System.out.print("Ingresa un coordinada en x1: ");
    x1 = lector.nextDouble();
    System.out.print("Ingresa un coordinada en y1: ");
    y1 = lector.nextDouble();
    System.out.print("Ingresa un coordinada en x2: ");
    x2 = lector.nextDouble();
    System.out.print("Ingresa un coordinada en y2: ");
    y2 = lector.nextDouble();
     System.out.print("Ingresa un coordinada en x3: ");
    x3 = lector.nextDouble();
    System.out.print("Ingresa un coordinada en y3: ");
    y3 = lector.nextDouble();
    System.out.print("Ingresa un coordinada en x4: ");
    x4 = lector.nextDouble();
    System.out.print("Ingresa un coordinada en y4: ");
    y4 = lector.nextDouble();
     System.out.print("Ingresa un coordinada en x5: ");
    x5 = lector.nextDouble();
    System.out.print("Ingresa un coordinada en y5: ");
    y5 = lector.nextDouble();
    System.out.print("Ingresa un coordinada en x6: ");
    x6 = lector.nextDouble();
    System.out.print("Ingresa un coordinada en y6: ");
    y6 = lector.nextDouble();

    resultado = LinkPrimario + Double.toString(x1)+intermedioVariable + Double.toString(y1) + finalVariable + Double.toString(x2) + intermedioVariable + Double.toString(y2)+ finalVariable + Double.toString(x3) + intermedioVariable + Double.toString(y3) + finalVariable + Double.toString(x4) + intermedioVariable + Double.toString(y4) + finalVariable + Double.toString(x5) + intermedioVariable + Double.toString(y5) + finalVariable + Double.toString(x6) + intermedioVariable + Double.toString(y6);

     System.out.println("El link es: " +  resultado);


    // System.out.println("El link es: " + LinkPrimario + x1 + intermedioVariable + y1 + finalVariable + x2 + intermedioVariable + y2 + finalVariable + x3 + intermedioVariable + y3 + finalVariable + x4 + intermedioVariable+ y4 + finalVariable+ x5 + intermedioVariable + y5);

  }
}