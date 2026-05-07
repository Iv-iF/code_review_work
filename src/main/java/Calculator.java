public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        if (b != 0) {
            return a / b;
        }
        return a/b;
    }
    public int times(int a, int b){
        return a*b;
    }
    public int solver(){
        int a = add(2,10);
        int b = dif(10,2);
        int c = div(30,2);
        return (add(b,div(times(a,c),2))); // 1) Умножение a на c 2) Деление результата на 2 3) Сложение результата с b
    }
}
