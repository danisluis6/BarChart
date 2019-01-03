package it.lorence.example;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

import it.lorence.barchart.BarChart;
import it.lorence.barchart.BarChartModel;

public class MainActivity extends AppCompatActivity {

    private BarChart colAnswerA, colAnswerB, colAnswerC, colAnswerD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colAnswerA = (BarChart) findViewById(R.id.answera);
        colAnswerB = (BarChart) findViewById(R.id.answerb);
        colAnswerC = (BarChart) findViewById(R.id.answerc);
        colAnswerD = (BarChart) findViewById(R.id.answerd);

        for (int i = 0; i < 1; i++) {
            BarChartModel barChartModel = new BarChartModel();
            barChartModel.setBarValue(new Random().nextInt(100));
            Random rnd = new Random();
            barChartModel.setBarColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            barChartModel.setBarTag(null);
            barChartModel.setBarText("Hello World");
            colAnswerA.addBar(barChartModel);
        }

        for (int i = 0; i < 1; i++) {
            BarChartModel barChartModel = new BarChartModel();
            barChartModel.setBarValue(new Random().nextInt(100));
            Random rnd = new Random();
            barChartModel.setBarColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            barChartModel.setBarTag(null);
            barChartModel.setBarText("Hello World");
            colAnswerB.addBar(barChartModel);
        }

        for (int i = 0; i < 1; i++) {
            BarChartModel barChartModel = new BarChartModel();
            barChartModel.setBarValue(new Random().nextInt(100));
            Random rnd = new Random();
            barChartModel.setBarColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            barChartModel.setBarTag(null);
            barChartModel.setBarText("Hello World");
            colAnswerC.addBar(barChartModel);
        }

        for (int i = 0; i < 1; i++) {
            BarChartModel barChartModel = new BarChartModel();
            barChartModel.setBarValue(new Random().nextInt(100));
            Random rnd = new Random();
            barChartModel.setBarColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            barChartModel.setBarTag(null);
            barChartModel.setBarText("Hello World");
            colAnswerD.addBar(barChartModel);
        }

    }
}
