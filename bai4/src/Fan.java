public class Fan {
    public static void main(String[] args) {
        Project Fan1 = new Project();
        Fan1.setSpeed(Fan1.FAST);
        Fan1.setOn();
        Fan1.setColor("yellow");
        Fan1.setRadius(10);
        Project Fan2 = new Project();
        Fan2.setSpeed(Fan2.MEDIUM);
        Fan2.setColor("blue");
        Fan2.setRadius(5);
        Fan1.toString();
        Fan2.toString();
    }

    private static class Project{
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        private int speed = 1;
        private boolean on = false;
        private  double radius = 5;
        private String color = "blue";
        Project(){
        }
        Project(int speed,boolean on,double radius,String color){
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }
        private int getSpeed(){
            return this.speed;
        }
        private int setSpeed(int value){
            return this.speed = value;
        }
        private boolean getOn(){
            return this.on;
        }
        private boolean setOn(){
            return this.on != this.on;
        }
        private double getRadius(){
            return this.radius;
        }
        private double setRadius(double value){
            return this.radius = value;
        }
        private String getColor(){
            return this.color;
        }
        private String setColor(String value){
            return this.color = value;
        }
        public String toString(){
            if(this.on == true){
                System.out.println("Info Fan :");
                System.out.println("Speed : "+ this.getSpeed());
                System.out.println("Color : "+this.getColor());
                System.out.println("Radius : "+this.getRadius());
                System.out.println("Fan is on !");
            }
            else {
                System.out.println("Info Fan :");
                System.out.println("Color : "+this.getColor());
                System.out.println("Radius : "+this.getRadius());
                System.out.println("Fan is off !");
            }
            return null;
        }
    }
}
