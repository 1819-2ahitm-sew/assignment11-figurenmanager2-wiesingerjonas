public class Rechteck extends Figure {
    int X;
    int Y;
    int length;
    int width;

    public Rechteck(int X, int Y, int length, int width){
        this.X = X;
        this.Y = Y;
        this.length = length;
        this.width = width;
    }

    @Override
    public void setArea(double area) {
        super.setArea(width*length);
    }

    @Override
    public void setCircumference(double circumference) {
        super.setCircumference(2*(width+length));
    }
}

