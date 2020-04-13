public class Fan {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Project Fan1 = new Project(FAST,true,10,"Yellow");

        Project Fan2 = new Project(MEDIUM,false,5,"Blue");

        Fan1.toStringFan();
        System.out.println("");
        Fan2.toStringFan();
    }

    public static class Project{
        int speed = 1;
        boolean on = false;
        double radius = 5;
        String color = "blue";
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
            return this.on =! this.on;
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
        public void toStringFan(){
            if(this.on){
                System.out.println("Info Fan :");
                System.out.println("Speed : "+ speed);
                System.out.println("Color : "+color);
                System.out.println("Radius : "+radius);
                System.out.println("Fan is on !");
            }
            else {
                System.out.println("Info Fan :");
                System.out.println("Color : "+color);
                System.out.println("Radius : "+radius);
                System.out.println("Fan is off !");
            }
        }
    }
}
