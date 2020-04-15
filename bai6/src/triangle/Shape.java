package triangle;

public class Shape {
    private String color = "Xanh";
    private boolean filled = true;

    Shape(){
    };
    Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return "Một hình học có màu " + getColor()+" và " + (isFilled() ? " tô nền" : " không tô nền");

    }
}
