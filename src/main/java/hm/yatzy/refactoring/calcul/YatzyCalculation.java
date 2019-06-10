package hm.yatzy.refactoring.calcul;

import hm.yatzy.refactoring.IYatzyCalculation;
import hm.yatzy.refactoring.YatzyCategoryEnum;
import hm.yatzy.refactoring.calcul.rules.*;

/**
 * YatzyCalculation is the dispatcher of rules, it's retrieve the score for the five dices with the given rule.
 */
public class YatzyCalculation implements IYatzyCalculation {

    private Sum sumDices;
    private Chance chance;
    private SameDices sameDices;
    private ScorePair scorePairDices;
    private TwoPair twoPairDices;
    private XOfAKind xOfAKind;
    private SmallStraight smallStraight;
    private LargeStraight largeStraight;
    private FullHouse fullHouse;


    public YatzyCalculation() {
        sumDices = new Sum();
        chance = new Chance();
        sameDices = new SameDices();
        scorePairDices = new ScorePair();
        twoPairDices = new TwoPair();
        xOfAKind = new XOfAKind();
        smallStraight = new SmallStraight();
        largeStraight = new LargeStraight();
        fullHouse = new FullHouse();
    }

    public Integer calculate(Integer[] dices, YatzyCategoryEnum category) {
        switch (category) {
            case SUM:
                // Chance renamed to sum
                return sumDices.operationRule(dices, null);
            case CHANCE:
                // Yatzy renamed to chance
                return chance.operationRule(dices, null);
            case ONES:
            case TWOS:
            case THREES:
            case FOURS:
            case FIVES:
            case SIXES:
                return sameDices.operationRule(dices, category.getValue());
            case PAIR:
                return scorePairDices.operationRule(dices, null);
            case TWO_PAIRS:
                return twoPairDices.operationRule(dices, null);
            case THREE_OF_A_KIND:
            case FOUR_OF_A_KIND:
                return xOfAKind.operationRule(dices, category.getValue());
            case SMALL_STRAIGHT:
                return smallStraight.operationRule(dices, null);
            case LARGE_STRAIGHT:
                return largeStraight.operationRule(dices, null);
            case FULL_HOUSE:
                return fullHouse.operationRule(dices, null);
            default:
                return null;
        }

    }

}
