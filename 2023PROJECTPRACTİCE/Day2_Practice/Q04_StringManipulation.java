package Day2_Practice;

public class Q04_StringManipulation {

    public static void main(String[] args) {

        birkereYazdir("abbbaaaaaccccddddeeeeee");
    }

    private static void birkereYazdir(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
          if (!output.contains(str.substring(i,i+1))){ // tekrarsiz karakterleri dondurcegiz icin sonucumuzn str den aldiginiz herhangi bir karakteri icermelidir
              output+=str.substring(i,i+1); // ozaman sonbuca eklesin
          }
        }
        System.out.println(output);
    }
}
