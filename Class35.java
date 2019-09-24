public class Class35 {//ветвления
    //35. Вычислить число и месяц в невисокосном году по номеру дня
    public void task35(int numb){
        int[] mas={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] month={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i=0; i<12; i++){
            if(numb>mas[i]) {
                numb-=mas[i];
            }
            else {
                System.out.println(month[i]+" " +numb);
                return;
            }
        }
    }
}
