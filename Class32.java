public class Class32 {
    //32. Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого
    //символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть буквами,
    //цифрами и знаком подчеркивания.

    public boolean task32(String str){
        int i=0;
        int charCode=(int)str.charAt(i);
        if((charCode>=65&&charCode<=122)||charCode==95) i=1;
        else return false;
        while(i<str.length()){
            charCode=(int)str.charAt(i);
            if((charCode>=65&&charCode<=122)||charCode==95||(charCode>=48&&charCode<=57)) i++;
            else return false;
        }
        return true;
    }
}
