package triangle_classifier;

public class TriangleClassifier {
    public static int AB,BC,AC;

    public static int getAB() {
        return AB;
    }

    public static void setAB(int AB) {
        TriangleClassifier.AB = AB;
    }

    public static int getBC() {
        return BC;
    }

    public static void setBC(int BC) {
        TriangleClassifier.BC = BC;
    }

    public static int getAC() {
        return AC;
    }

    public static void setAC(int AC) {
        TriangleClassifier.AC = AC;
    }
    public static String checkTriangle(){
        if(AB <= 0 || BC <= 0 || AC <= 0){
            return "Không phải tam giác";
        }else {
            if(AB == BC && AB == AC){
                return "Tam giác đều";
            }else if(AB == BC || AB == AC){
                return "Tam giác cân";
            }else {
                return "Tam giác thường";
            }
        }
    }
}
