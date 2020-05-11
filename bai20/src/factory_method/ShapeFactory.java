package factory_method;

public class ShapeFactory {
    public Shape getShape(String name){
        switch (name){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Ractangle();
            default:
                System.out.println("Erro !");
        }

        return null;
    }
}
