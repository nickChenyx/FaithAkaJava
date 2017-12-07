package com.nickchen.N10;

/**
 * 始终要覆盖 toString
 * <p>
 * 需要显示的指明 toString 返回的格式。
 * <p>
 * 此案例中格式过于明显，不与纠结。
 *
 * @author nickChen
 * @date create on 2017-12-07 13:48.
 */
public class OverrideToString {
    private int year;
    private int month;
    private int day;

    public OverrideToString(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "OverrideToString{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new OverrideToString(2017, 12, 7));
    }
}
