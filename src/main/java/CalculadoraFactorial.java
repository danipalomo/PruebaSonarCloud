public class CalculadoraFactorial extends Calculadora {

    public float x, y;

    public CalculadoraFactorial(int x, float y){
        super(x, y);
    }

    public float calculate(TypeOperation operation) {
        return calculateFactorial();
    }

    private int calculateFactorial(){
        int res = 1;

        if(x!=0 && y!=0){
            for(int i=2; i<x; i++){
                res*=i;
            }
            return res;
        } else if (y!=0){
            for(int i=2; i<y; i++){
                res*=i;
            }
            return res;
        } else {
            return 1;
        }
    }
}
