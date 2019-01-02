package it.lorence.example;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

import it.lorence.barchart.BarChart;
import it.lorence.barchart.BarChartModel;

public class MainActivity extends AppCompatActivity {
    private BarChart barChartVertical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barChartVertical = (BarChart) findViewById(R.id.bar_chart_vertical);
        for (int i = 0; i < 3; i++) {
            BarChartModel barChartModel = new BarChartModel();
            barChartModel.setBarValue(new Random().nextInt(100));
            Random rnd = new Random();
            barChartModel.setBarColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            barChartModel.setBarTag(null);
        }
        String data[] = new String[] {
                "Java",
                "Python",
                "JavaScript",
                "C"
        };

        int dataColor[] = new int[] {
                Color.parseColor("#00BCD4"),
                Color.parseColor("#3F51B5"),
                Color.parseColor("#2196F3"),
                Color.parseColor("#FF9800")
        };

        for (int i = 0; i < 4; i++) {
            BarChartModel barChartModel = new BarChartModel();
            barChartModel.setBarValue(new Random().nextInt(100));
            Random rnd = new Random();
            barChartModel.setBarColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            barChartModel.setBarTag(null);
            barChartModel.setBarText("Hello World");
            barChartVertical.addBar(barChartModel);
        }

    }
}
