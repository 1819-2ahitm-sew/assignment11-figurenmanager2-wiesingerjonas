public class Ellipse extends Figure{
    int X;
    int Y;
    int mainAxis;
    int minorAxis;

    public Ellipse(int X, int Y, int mainAxis, int minorAxis){
        this.X = X;
        this.Y = Y;
        this.mainAxis = mainAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public void setArea(double area) {
        super.setArea(Math.PI * mainAxis * minorAxis);
    }

    @Override
    public void setCircumference(double circumference) {
        super.setCircumference(circumference);
    }
}
