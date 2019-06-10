package hm.yatzy.refactoring.calcul.utils;

import java.util.HashMap;
import java.util.Map;

public class YatzyUtils {

    public static int[] getDiceArray(Integer[] dices) {
        int[] transformedDices = new int[6];
        for (Integer dice : dices) {
            transformedDices[dice.intValue() - 1]++;
        }
        return transformedDices;
    }

    public static Map<Integer, Integer> getDuplicateElements(Integer[] dices) {
        final Map<Integer, Integer> duplicatesDices = new HashMap<Integer, Integer>();
        Integer xTime = null;
        for (Integer dice : dices) {
            if (!duplicatesDices.containsKey(dice)) {
                xTime = 1;
                duplicatesDices.put(dice, xTime++);
            } else {
                xTime = duplicatesDices.get(dice);
                duplicatesDices.remove(dice);
                duplicatesDices.put(dice, ++xTime);
            }
        }
        return duplicatesDices;
    }

    public static int getXOfAKind(Integer[] dices, Integer xTime, Boolean exactMatch) {
        // Find the duplicates elements on the array
        Map<Integer, Integer> duplicatElements = getDuplicateElements(dices);
        if (duplicatElements.size() > 0) {
            for (Integer dice : duplicatElements.keySet()) {
                if ((duplicatElements.get(dice) >= xTime && !exactMatch) || (duplicatElements.get(dice) == xTime && exactMatch)) {
                    return dice * xTime;
                }
            }
        }
        return 0;
    }
}
