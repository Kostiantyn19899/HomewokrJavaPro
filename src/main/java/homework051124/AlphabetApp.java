package homework051124;

import java.util.Arrays;

public class AlphabetApp {
    public static void main(String[] args) {

        AlphabetEng alphabetEng = new AlphabetEng("English",1);
        alphabetEng.printAlphabet();

        AlphabetDeu alphabetDeu = new AlphabetDeu("Deutsch",2);
        alphabetDeu.printAlphabet();

        AlphabetRus alphabetRus = new AlphabetRus("Russia", 3);
        alphabetRus.printAlphabet();

        Alphabet all = new Alphabet("All");
        all.printAllInfo(alphabetEng,alphabetDeu,alphabetRus);

    }
}
