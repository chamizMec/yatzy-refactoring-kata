package hm.yatzy.refactoring.calcul.rules;

import hm.yatzy.refactoring.IYatzyRule;
import hm.yatzy.refactoring.calcul.utils.YatzyUtils;

import java.util.Map;

public class TwoPair implements IYatzyRule {
    public Integer operationRule(Integer[] dices, Integer diceValue) {
        Integer firstDuplicatedDice = 0;
        Integer secondDuplicatedDice = 0;
        // Find the duplicates elements on the list
        Map<Integer, Integer> duplicatElements = YatzyUtils.getDuplicateElements(dices);
        if (duplicatElements.size() >= 2) {
            for (Integer dice : duplicatElements.keySet()) {
                if (duplicatElements.get(dice) >= 2 && firstDuplicatedDice == 0) {
                    firstDuplicatedDice = dice;
                } else if (duplicatElements.get(dice) >= 2) {
                    secondDuplicatedDice = dice;
                    break;
                }
            }
            if (firstDuplicatedDice > 0 && secondDuplicatedDice > 0) {
                return firstDuplicatedDice * 2 + secondDuplicatedDice * 2;
            }

        }
        return 0;
    }
}
