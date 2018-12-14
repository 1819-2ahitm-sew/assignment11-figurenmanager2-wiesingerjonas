public class Quadrat extends Figure {

    int X;
    int Y;
    int length;

    public Quadrat(int X, int Y, int length){
        this.X = X;
        this.Y = Y;
        this.length = length;
    }

    @Override
    public void setCircumference(double circumference) {
        super.setCircumference(length * 4);
    }

    @Override
    public void setArea(double area) {
        super.setArea(Math.pow(length, 2));
    }
}
