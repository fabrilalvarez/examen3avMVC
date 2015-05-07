package superficies;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Modelo {

    float sideLength, sideHeight, result;
    String shapeType;

    /**
     *
     * @return shapeType to choose (square, circle, triangle, rectangle)
     */
    public String getType() {
        return shapeType;
    }

    // setter & getter
    public float getNum1() {
        return sideLength;
    }

    public void setNum1(float num1) {
        this.sideLength = num1;
    }

    public float getNum2() {
        return sideHeight;
    }

    public void setNum2(float num2) {
        this.sideHeight = num2;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

}
