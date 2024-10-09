public class Rectangle
{
    private int xPosition;
    private int yPosition;
    private int length;
    private int width;


    public Retangle (xPosition, yPosition, length, width)
    {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.length = length;
        this.width = width;
    }
    public Rectangle(length, width)
    {
        this(0, 0, length, width);
    }
    public void move(int newX, int newY)
    {
        this.xPosition = newX;
        this.yPosition = newY;
    }
    public void newWidth(int newWidth)
    {
        this.width = newWidth;
    }
    public String toString()
    {
        return ("(" + xPosition +", "+ yPosition + ")" + "Length: "+ length + ", " + "Width: " + width);
    }
    public int area()
    {
        return length * width;
    }
    public int perimeter()
    {
        return length*2 + width*2;
    }
    public boolean isSquare()
    {
        if (this.length == this.width)
        {
            return true
        }
        if (this.length != this.width)
        {
            return false
        }
    }
    public boolean equals(Rectangle other)
    {
        if (this.xPosition == other.xPosition && this.yPosition == other.yPosition && this.width == other.width && this.length == other.length)
        {
            return true
        }
        else
        {
            return false
        }
    }
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(5,4);
        Rectangle r2 = new Rectangle(5,4);
        system.out.println(r1.equals(r2));
    }



}