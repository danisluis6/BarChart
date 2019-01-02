package it.lorence.example;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

import it.lorence.barchart.BarChart;
import it.lorence.barchart.BarChartModel;

public class MainActivity extends AppCompatActivity {
    private BarChart barChartVertical;
    private EditText etAddViewAt;
    private EditText etRemoveViewAt;
    private EditText etUpdateViewAt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barChartVertical = (BarChart) findViewById(R.id.bar_chart_vertical);
        etAddViewAt = (EditText) findViewById(R.id.et_add_view_at);
        etRemoveViewAt = (EditText) findViewById(R.id.et_remove_bar_at);
        etUpdateViewAt = (EditText) findViewById(R.id.et_update_bar_at);
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
            barChartModel.setBarColor(dataColor[i]);
            barChartModel.setBarTag(null);
            barChartModel.setBarText(data[i]);
        }


        findViewById(R.id.tv_hello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Clicked::");
                BarChartModel barChartModel = new BarChartModel();
                barChartModel.setBarValue(new Random().nextInt(100));
                Random rnd = new Random();
                barChartModel.setBarColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                barChartModel.setBarTag(null);
                barChartVertical.addBar(barChartModel);
            }
        });

        findViewById(R.id.tv_hello_at).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Clicked::");
                BarChartModel barChartModel = new BarChartModel();
                barChartModel.setBarValue(new Random().nextInt(100));
                Random rnd = new Random();
                barChartModel.setBarColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                barChartModel.setBarTag(null);
                barChartVertical.addBar(Integer.parseInt(etAddViewAt.getText().toString()),barChartModel);
            }
        });
        findViewById(R.id.tv_clear).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        barChartVertical.clearAll();
                    }
                });

        findViewById(R.id.tv_remove_bar_at).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                barChartVertical.removeBar(Integer.parseInt(etRemoveViewAt.getText().toString()));
            }});

        findViewById(R.id.tv_update_bar_at).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BarChartModel barChartModel = new BarChartModel();
                barChartModel.setBarValue(new Random().nextInt(100));
                Random rnd = new Random();
                barChartModel.setBarColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                barChartModel.setBarTag(null);
                barChartVertical.updateBar(Integer.parseInt(etUpdateViewAt.getText().toString()),barChartModel);
            }});

        barChartVertical.setOnBarClickListener(new BarChart.OnBarClickListener() {
            @Override
            public void onBarClick(BarChartModel barChartModel) {
                barChartVertical.removeBar(barChartModel);
            }
        });

    }
}
