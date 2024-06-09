package Seminar2;
//поиск в строке по первому индексу
public class SearchInSrting {
    public static void main(String[] args) {
        String str = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
        String word = "программистом";
        int indexFromFirstWord = getIndexFromFirtsWord(str , word);
        int indexFromLastWord = getIndexfromLastWord(str , word);
        System.out.println("Индекс первого символа первого слова \"" + word + "\" равен - " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + word + "\" равен - " + indexFromLastWord);
    }
    public static int getIndexFromFirtsWord(String str ,String word){
        return str.indexOf(word);
    }
    public static int getIndexfromLastWord( String str , String word){
        return str.lastIndexOf(word);
    }
}
