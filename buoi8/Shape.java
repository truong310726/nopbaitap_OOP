package buoi8;

public abstract class Shape
{
    public abstract void draw();
    String color;
    public String GetColor()
    {
        return color;
    }
    public void SetColor(String color)
    {
        this.color = color;
    }
}

class Circle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Rectangle");
    }
}
class ShapeApp
{
    public void DrawShape(Shape shape)
    {
        shape.draw();
        System.out.println("Color: " + shape.GetColor());
        
    }
}