public class ClassificationOfTriangles {
    public static boolean isEquilateralTriangle(double side1, double side2, double side3) {
        return side1 == side2 && side1 == side3;
    }

    public static boolean isIsoscelesTriangle(double side1, double side2, double side3) {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    public static boolean isRegularTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public static String typeOfTriangle(double side1, double side2, double side3) {
       if (isRegularTriangle(side1, side2, side3)) {
           if (isIsoscelesTriangle(side1, side2, side3)) {
               if (isEquilateralTriangle(side1, side2, side3)) {
                   return "Tam giac deu";
               }
               return "Tam giac can";
           }
           return "Tam giac thuong";
       }

        else return "Ko phai tam giac";
    }
}
