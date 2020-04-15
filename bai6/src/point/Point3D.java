package point;

public class Point3D  extends Point2D {
    private float z = 0;

    Point3D(){
    }
    Point3D(float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public String toString(){
        return super.toString()+"\n"+"Z : "+this.getZ();
    }
}
