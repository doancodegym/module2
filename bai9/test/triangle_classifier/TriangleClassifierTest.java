package triangle_classifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("Test tam giác đều")
    void checkTriangle() {
        TriangleClassifier.setAB(5);
        TriangleClassifier.setBC(5);
        TriangleClassifier.setAC(5);

        String check = "Tam giác đều";
        assertEquals(check,TriangleClassifier.checkTriangle());
    }
    @Test
    @DisplayName("Test tam giác cân")
    void checkTriangle1() {
        TriangleClassifier.setAB(5);
        TriangleClassifier.setBC(5);
        TriangleClassifier.setAC(6);

        String check = "Tam giác cân";
        assertEquals(check,TriangleClassifier.checkTriangle());
    }
    @Test
    @DisplayName("Test tam giác thường")
    void checkTriangle2() {
        TriangleClassifier.setAB(5);
        TriangleClassifier.setBC(6);
        TriangleClassifier.setAC(9);

        String check = "Tam giác thường";
        assertEquals(check,TriangleClassifier.checkTriangle());
    }
    @Test
    @DisplayName("Test không phải tam giác")
    void checkTriangle3() {
        TriangleClassifier.setAB(5);
        TriangleClassifier.setBC(-2);
        TriangleClassifier.setAC(5);

        String check = "Không phải tam giác";
        assertEquals(check,TriangleClassifier.checkTriangle());
    }
}