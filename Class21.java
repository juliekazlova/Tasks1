public class Class21 {//циклы
    //21. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
    //представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
    //значения функции:
    //F(x) = x − sin(x)
    public void task21(int a, int b, int h){
        int arg=a;
        for (int i=0; i<(b-a)/h+1; i++){
            System.out.print(arg+" ---> ");
            System.out.println(arg-Math.sin(arg));
            arg+=h;
        }
    }

}
