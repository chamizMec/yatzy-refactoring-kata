package hm.yatzy.refactoring.calcul.rules;

import hm.yatzy.refactoring.IYatzyRule;
import hm.yatzy.refactoring.calcul.utils.YatzyUtils;

public class LargeStraight implements IYatzyRule {

    public Integer operationRule(Integer[] dices, Integer diceValue) {
        int[] tallies = YatzyUtils.getDiceArray(dices);

        for (int i = 1; i <= 5; i++) {
            if (tallies[i] != 1) {
                return 0;
            }
        }
        return 20;

    }
}
