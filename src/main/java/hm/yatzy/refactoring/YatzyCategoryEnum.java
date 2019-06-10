package hm.yatzy.refactoring;

public enum YatzyCategoryEnum {

    SUM("Sum", null),
    CHANCE("Chance", null),
    ONES("Ones", 1),
    TWOS("Tows", 2),
    THREES("Threes", 3),
    FOURS("Fours", 4),
    FIVES("Fives", 5),
    SIXES("Sixes", 6),
    PAIR("Pair", null),
    TWO_PAIRS("Two pairs", null),
    THREE_OF_A_KIND("Three of a kind", 3),
    FOUR_OF_A_KIND("Four of a kind", 4),
    SMALL_STRAIGHT("Small Straight", null),
    LARGE_STRAIGHT("Large Straight", null),
    FULL_HOUSE("Full house", null);

    private String name;
    private Integer value;

    YatzyCategoryEnum(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }
}
