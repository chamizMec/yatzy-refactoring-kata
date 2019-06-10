package hm.yatzy.refactoring.calcul.rules;

import hm.yatzy.refactoring.IYatzyRule;
import hm.yatzy.refactoring.calcul.utils.YatzyUtils;

public class FullHouse implements IYatzyRule {

    private XOfAKind xOfAKind;

    public Integer operationRule(Integer[] dices, Integer diceValue) {
//        int[] tallies;
//        boolean _2 = false;
//        int i;
//        int _2_at = 0;
//        boolean _3 = false;
//        int _3_at = 0;
//
//        tallies = YatzyUtils.getDiceArray(dices);
//
//        for (i = 0; i != 6; i += 1)
//            if (tallies[i] == 2) {
//                _2 = true;
//                _2_at = i+1;
//            }
//
//        for (i = 0; i != 6; i += 1)
//            if (tallies[i] == 3) {
//                _3 = true;
//                _3_at = i+1;
//            }
//
//        if (_2 && _3)
//            return _2_at * 2 + _3_at * 3;
//        else
//            return 0;
        xOfAKind = new XOfAKind();
        Integer twoOfAKind = YatzyUtils.getXOfAKind(dices, 2, true);
        Integer threeOfAKind = YatzyUtils.getXOfAKind(dices, 3, true);
        if (twoOfAKind != 0 && threeOfAKind != 0) {
            return twoOfAKind + threeOfAKind;
        }
        return 0;
    }
}

