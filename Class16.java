public class Class16 {//ветвления
    // На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси
    //или в каком координатном угле).

    public void task16(int x, int y){
        if(x>0&&y>0) {
            System.out.println("1st");
            return;
        }
        if(x<0&&y>0) {
            System.out.println("2nd");
            return;
        }
        if(x<0&&y<0) {
            System.out.println("3rd");
            return;
        }
        if(x>0&&y<0) {
            System.out.println("4th");
            return;
        }
        if(x==0&&y!=0) {
            System.out.println("OY");
            return;
        }
        if(x!=0&&y==0) {
            System.out.println("OX");
            return;
        }
        if(x==0&&y==0) {
            System.out.println("O");
        }
    }
}
