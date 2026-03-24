package Chapter6;

public class RandomCharacter {
    public static char getRandomChararacter(char ch1, char ch2) {
        return(char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    
    public static char getRandomLowercaseLetter() {
        return getRandomChararacter('a', 'z');
    }

    public static char getRandomUppercaseLetter() {
        return getRandomCharacter()
    }
}
