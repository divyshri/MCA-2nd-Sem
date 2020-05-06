class Shape{
    int length=0,width=0,height=0;
    int area(int x)
    {
        length=x;
        return (length*length);
    }
    int area(int x,int y)
    {
        length=x;
        width=y;
        return(length*width);
    }
    int area(int x,int y,int z){
        length=x;
        width=y;
        height=z;
        return((length+width)*height/2);
    }
}

public class Area {
    public static void main(String [] args)
    {
        
        Shape S1 =new Shape();
        Shape S2 =new Shape();
        Shape S3 =new Shape();
        System.out.println("Area of square: "+S1.area(5));
        System.out.println("Area of recyangle: "+S1.area(5,6));
        System.out.println("Area of trapezoid: "+S1.area(5,6,4));
    }
}
