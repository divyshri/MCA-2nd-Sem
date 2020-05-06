class Box
{
    int length,width,height;
    Box()
    {
     length =10;
     width=15;
     height=10;
    }
    int area()
    {
        return (length*width*height);
    }
}
class Triangle extends Box
{
    int breadth,height;
    Triangle()
    {
        breadth=10;
        height=10;
    }
    int area()
    {
        return (breadth*height);
    }
    
}

class BoxInheritance
{
    public static void main(String args[])
    {
        Box b=new Box();
        Triangle t=new Triangle();
        System.out.println("Area of the box is = " + b.area());
        b=t;
        System.out.println("Area of the Triangle is = " + b.area());
        
    }
}