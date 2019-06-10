package hm.yatzy.refactoring.calcul.rules;

import hm.yatzy.refactoring.IYatzyRule;

public class Sum implements IYatzyRule {

    public Integer operationRule(Integer[] dices, Integer diceValue) {
        int sum = 0;
        for (Integer dice : dices) {
            sum += dice;
        }
        return sum;
    }

}
