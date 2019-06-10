package hm.yatzy.refactoring.calcul.rules;

import hm.yatzy.refactoring.IYatzyRule;
import hm.yatzy.refactoring.calcul.utils.YatzyUtils;

public class ScorePair implements IYatzyRule {
    public Integer operationRule(Integer[] dices, Integer diceValue) {
        return YatzyUtils.getXOfAKind(dices, 2, false);
    }
}
