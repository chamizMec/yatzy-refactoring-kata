package hm.yatzy.refactoring.calcul.rules;

import hm.yatzy.refactoring.IYatzyRule;

public class Chance implements IYatzyRule {

    public Integer operationRule(Integer[] dices, Integer diceValue) {
        Integer indexZero = dices[0];
        for (int i = 1; i < 5; i++) {
            if (!dices[i].equals(indexZero)) {
                return 0;
            }
        }
        return 50;
    }
}
