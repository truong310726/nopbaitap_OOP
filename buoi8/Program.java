package buoi8;

public class Program
{
    public static void main(String[] args)
    {
        Shape shape1 = new Circle();
        shape1.SetColor("Red");
        Shape shape2 = new Rectangle();
        shape2.SetColor("Blue");
        
        ShapeApp app = new ShapeApp();
        app.DrawShape(shape1);
        app.DrawShape(shape2);
        
        Person emp = new Employee("Test1", "123", 50000);
        Person cust = new Customer("Test2", "456", 1000);
        
        emp.display();
        cust.display();
        
        XeMay xe1 = new XeMayTT();
        XeMay xe2 = new XeMayLeoNui();
        
        xe1.brake();
        xe2.brake();
    }
}