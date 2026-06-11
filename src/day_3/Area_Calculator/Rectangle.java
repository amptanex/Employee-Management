package day_3.Area_Calculator;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double area(){
        return height * width;
    }
}
