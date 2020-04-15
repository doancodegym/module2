package movablepoint;

public class MovablePoint extends Point{
    private float xSpeed = 0;
    private float ySpeed = 0;

    MovablePoint(){
    }
    MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[]speed = {this.xSpeed,this.ySpeed};
        return speed;
    }
    public String toString(){
        return super.toString()+"\nSpeed = ("+xSpeed+","+ySpeed+")";
    }
    public void move(){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+ySpeed);
    }
}
