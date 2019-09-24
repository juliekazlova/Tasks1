public class Class37 {
    // Составить линейную программу, печатающую значение true, если указанное высказывание является
    //истинным, и false — в противном случае



    //Целое число N является четным двузначным числом.
   public void prog1(int n){
        if(n>=1000&&n<=9999&&(n%2==0)) System.out.println("true");
        else System.out.println("false");
    }

//Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
   public void prog2(int n){
        if((n/1000+n/100)==(n%10+(n%100)/10)) System.out.println("true");
        else System.out.println("false");
    }

    //• Сумма цифр данного трехзначного числа N является четным числом.
    public void prog3(int n){
        int sum=0;
        for(int i=0; i<3; i++) {
            sum += n % 10;
            n = n / 10;
        }
        if(sum%2==0) System.out.println("true");
        else System.out.println("false");
    }


    //• Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п
//(т<п).
    void prog4(int x, int y, int n, int m){
        if(m>n){
            System.out.println("wrong data! m>n");
        }
        if(x>m&&x<n) System.out.println("true");
        else System.out.println("false");
    }


    //• Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
    void prog5(int n){
        int sum=0;
        for(int i=0; i<3; i++) {
            sum += n % 10;
            n = n / 10;
        }
        if(n*n==sum*sum*sum) System.out.println("true");
        else System.out.println("false");
    }

    //• Треугольник со сторонами а,b,с является равнобедренным.
    void prog6(int a, int b, int c){
        if(a==b|a==c|c==b) System.out.println("true");
        else System.out.println("false");
    }


    //• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
    void prog7(int n){
        int a, b, c;
        a=n%10; n=n/10;
        b=n%10;
        c=n/10;
        if(a+b==c|a+c==b|b+c==a) System.out.println("true");
        else System.out.println("false");
    }


    //• Заданное число N является степенью числа а (показатель степени может находиться в диапазоне
//от 0 до 4).
    void prog8 (int n, int a){
        if(n==1|n==a|n==a*a|n==Math.pow(a, 3)|n==Math.pow(a, 4)) System.out.println("true");
        else System.out.println("false");
    }

    //• График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).
    void prog9 (int a, int b, int c, int m, int n){
        if(a*m*m+b*m+c==n) System.out.println("true");
        else System.out.println("false");
    }

}
