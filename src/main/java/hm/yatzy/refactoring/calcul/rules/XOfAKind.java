package hm.yatzy.refactoring.calcul.rules;

import hm.yatzy.refactoring.IYatzyRule;
import hm.yatzy.refactoring.calcul.utils.YatzyUtils;

public class XOfAKind implements IYatzyRule {

    public Integer operationRule(Integer[] dices, Integer diceValue) {
        return YatzyUtils.getXOfAKind(dices, diceValue, false);
    }
}
