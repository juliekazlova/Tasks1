public class Class7 {
    //7. Вычислить значения функции на отрезке [а,b] c шагом h
   public void task7(float a, float b, float h){
        while(a<=b)
        {
            if(a>2) System.out.print(a+"  ");
            else System.out.print(-a+"  ");
            a+=h;
        }
    }



}
