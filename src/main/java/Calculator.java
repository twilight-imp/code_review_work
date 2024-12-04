public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Дление на 0");
        }
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(int a, int b) {
        return add(dif(b, a),times(a, b));
    }
}
