package circles;

import java.util.ArrayList;
import java.util.List;

public class Circle {
    static List<Circle> circleList = new ArrayList<>();
    double radius;

    public Circle(double radius){
        this.radius = radius;
        circleList.add(this);
    }
    public double getCircumference(){
        double circumference;
        circumference = 2 * Math.PI * radius;
        return circumference;
    }
    public String getFormattedCircumference(){
        return formatNumber(getCircumference());
    }
    public double getArea(){
        double area;
        area = 2 * Math.PI * (radius * radius);
        return area;
    }
    public String getFormattedArea(){
        return formatNumber(getArea());
    }
    private String formatNumber(double x){
        return String.format("%.2f", x);
    }
    public static int getObjectCount(){
        return circleList.size();
    }
}
