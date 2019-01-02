package it.lorence.barchart;

public class BarChartModel {
    private int barValue;
    private int barColor;
    private Object barTag;
    private String barText;

    public BarChartModel() {
    }

    int getBarValue() {
        return barValue;
    }

    public void setBarValue(int barValue) {
        this.barValue = barValue;
    }

    int getBarColor() {
        return barColor;
    }

    public void setBarColor(int barColor) {
        this.barColor = barColor;
    }

    public Object getBarTag() {
        return barTag;
    }

    public void setBarTag(Object barTag) {
        this.barTag = barTag;
    }

    String getBarText() {
        return barText;
    }

    public void setBarText(String barText) {
        this.barText = barText;
    }
}
