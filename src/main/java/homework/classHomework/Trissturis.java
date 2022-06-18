package homework.classHomework;

import java.util.Scanner;


public class Trissturis {
    public int firstSide;
    public int secondSide;
    public int thirdSide;
    public int Triangle_Area;


    public Trissturis() {
        System.out.println("Create triangle.");
    }

    public Trissturis(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;

        double Semi_Perimeter = (this.firstSide + this.secondSide + this.thirdSide) / 2.0;
        double area = Math.sqrt(Semi_Perimeter * (Semi_Perimeter - this.firstSide) * (Semi_Perimeter - this.secondSide) * (Semi_Perimeter - this.thirdSide));
        this.Triangle_Area = (int) area;

    }

    public boolean Equilateral() {
        return this.firstSide == this.secondSide && this.secondSide == this.thirdSide;
    }

    public boolean Isosceles() {
        return this.firstSide == this.secondSide || this.secondSide == this.thirdSide || this.thirdSide == this.firstSide;
    }
}


