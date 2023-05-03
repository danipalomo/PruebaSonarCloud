import java.lang.Math;

public class Calculadora {

    public float x, y;

    public Calculadora(int x, float y){
        this.x = x;
        this.y = y;
    }

    public enum TypeOperation {
        SUMA, RESTA, MULT, DIV
    }

    public float calculate(TypeOperation operation){
        float resultado = 0;
        double aux;

        switch(operation){
            case SUMA:
                resultado = x + y;
                break;
            case MULT:
                resultado = x * y;
                break;
        }
        return resultado;
    }
}
