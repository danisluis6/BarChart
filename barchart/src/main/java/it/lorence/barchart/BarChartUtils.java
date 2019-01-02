package it.lorence.barchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;

import java.util.Random;

class BarChartUtils {
    static final int BAR_CHART_HORIZONTAL = 0;
    static final int BAR_CHART_VERTICAL = 1;
    static int BAR_CHART_COLOR_DEFAULT= Color.parseColor("#303030");
    static int BAR_CHART_TEXT_COLOR_DEFAULT= Color.parseColor("#808080");
    static int BAR_CHART_SPACE = 5;

    static float convertDpToPixel(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp * ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }

    static float convertPixelsToDp(float px, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        return px / ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);

    }

    static int getRandomColor() {
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}
