public class Main {


    public static int lengt(String[] words, String chars) {
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            char[] ch = chars.toCharArray();
            int count = 0;
            for (char w : word) {
                int c = 0;
                for (c = 0; c < ch.length; c++) {
                    if (w == ch[c]) {
                        ch[c] = 0;
                        count++;
                        break;
                    }
                }
            }
                if (count == word.length) { //good word
                    sum += count;
                }
            }
        return sum;
        }


    public static void main(String[] args) {
        String[] words = {"cat", "bt", "tree", "hat" };
        String chars = "atach";
        System.out.println(lengt(words, chars));
    }
}

