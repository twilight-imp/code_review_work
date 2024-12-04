public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(int a, int b) {
        int sum = add(a, b);
        int dif = dif(a, b);
        int div = div(sum, dif);
        int times = times(dif, times(a,b));
        return div;
    }
}
