public class Task_06
{
    public static void main(String[] args)
    {
        System.out.println("Name: Hafsa Salman");
        System.out.println("OOP Lab 06: Task no. 06");
        System.out.println();

        Rectangle R =  new Rectangle(10, 12);
        R.area();
        R.perimeter();

        System.out.println();

        Square S = new Square(10);
        S.area();
        S.perimeter();
    }
}

class Rectangle
{
    int length;
    int width;

    public  Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public void area ()
    {
        int area;

        area = length * width;

        System.out.println("Area of rectangle: " + area);
    }

    public void perimeter()
    {
        int peri;

        peri = 2 * (length + width);

        System.out.println("Perimeter of rectangle: " + peri);
    }
}

class Square extends Rectangle
{
    int side;

    public Square(int side)
    {
        super(side, side);
        this.side = side;
    }

    public void s_area()
    {
        int sarea;

        sarea = side * side;

        System.out.println("Area of square: " + sarea);
    }

    public void s_perimeter()
    {
        int speri;

        speri = 4 * side;

        System.out.println("Perimeter of square: " + speri);
    }
}