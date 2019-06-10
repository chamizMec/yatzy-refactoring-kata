package hm.yatzy.refactoring.calcul.rules;

import hm.yatzy.refactoring.IYatzyRule;

public class SameDices implements IYatzyRule {

    public Integer operationRule(Integer[] dices, Integer diceValue) {
        int sum = 0;
        for (Integer dice : dices) {
            if (dice.equals(diceValue)) {
                sum += dice;
            }
        }
        return sum;
    }
}
