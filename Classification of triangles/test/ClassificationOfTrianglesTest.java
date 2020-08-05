import static org.junit.jupiter.api.Assertions.*;

class ClassificationOfTrianglesTest {

    @org.junit.jupiter.api.Test
    void typeOfTriangle() {
        String expected = "Tam giac can";
        String result = ClassificationOfTriangles.typeOfTriangle(2, 2, 3);
        assertEquals(expected,result);
    }
}