package homework051124;

import java.util.Arrays;

public class AlphabetDeu extends AlphabetEng {

    public final String[] arrAlphabet = {"s","d","f","ü","ß","ö"};

    public AlphabetDeu(String name, int ownNumber) {
        super(name, ownNumber);
    }

    @Override
    public void printAlphabet() {
        System.out.println("The name alphabet is  " + super.getName() + " " + Arrays.toString(arrAlphabet));
    }


}
