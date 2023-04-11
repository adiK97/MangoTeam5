//    to remove the codesmell using Introduce parameter object method:

public class ChartParameters {
    private int[] pointIds;
    private int fromYear;
    private int fromMonth;
    private int fromDay;
    private int fromHour;
    private int fromMinute;
    private int fromSecond;
    private boolean fromNone;
    private int toYear;
    private int toMonth;
    private int toDay;
    private int toHour;
    private int toMinute;
    private int toSecond;
    private boolean toNone;

    public ChartParameters(int[] pointIds, int fromYear, int fromMonth, int fromDay, int fromHour, int fromMinute,
                           int fromSecond, boolean fromNone, int toYear, int toMonth, int toDay, int toHour, int toMinute,
                           int toSecond, boolean toNone) {
        this.pointIds = pointIds;
        this.fromYear = fromYear;
        this.fromMonth = fromMonth;
        this.fromDay = fromDay;
        this.fromHour = fromHour;
        this.fromMinute = fromMinute;
        this.fromSecond = fromSecond;
        this.fromNone = fromNone;
        this.toYear = toYear;
        this.toMonth = toMonth;
        this.toDay = toDay;
        this.toHour = toHour;
        this.toMinute = toMinute;
        this.toSecond = toSecond;
        this.toNone = toNone;
    }

    public int[] getPointIds() {
        return pointIds;
    }

    public int getFromYear() {
        return fromYear;
    }

    public int getFromMonth() {
        return fromMonth;
    }

    public int getFromDay() {
        return fromDay;
    }

    public int getFromHour() {
        return fromHour;
    }

    public int getFromMinute() {
        return fromMinute;
    }

    public int getFromSecond() {
        return fromSecond;
    }

    public boolean isFromNone() {
        return fromNone;
    }

    public int getToYear() {
        return toYear;
    }

    public int getToMonth() {
        return toMonth;
    }

    public int getToDay() {
        return toDay;
    }

    public int getToHour() {
        return toHour;
    }

    public int getToMinute() {
        return toMinute;
    }

    public int getToSecond() {
        return toSecond;
    }

    public boolean isToNone() {
        return toNone;
    }
}
