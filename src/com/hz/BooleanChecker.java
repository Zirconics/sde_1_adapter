package com.hz;

import java.util.Arrays;
import java.util.List;

public class BooleanChecker {

    private List<String> truthValues;

    public boolean checkIfTrue (String input) {
        String[] words = new String[] {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        this.truthValues = Arrays.asList(words);

        return truthValues.contains(input);
    }
}
