package bg.tu_varna.sit.a2.f23621649.homework1;

public class Task2 {
    public static void main(String[] args) {
        char[] text = new char[]{'S', 'o', 'm', 'e', ' ', 't', 'e', 'x', 't'};

        printEveryCharOnNewLine(text);
    }

    public static void printEveryCharOnNewLine(char[] text){
        int index = 0;
        while (index < text.length){
            System.out.println(text[index]);
            index++;
        }
    }
}
