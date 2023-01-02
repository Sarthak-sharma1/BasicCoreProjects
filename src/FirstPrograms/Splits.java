package FirstPrograms;

public class Splits {
    public static void main(String[] args) {
        String str ="CatBatSatFatOr";
        String[] words = str.split("t");
        for(String w : words){
            System.out.println(w);
        }
    }
}
