package com.example.freedom.myapplication.Report.Fragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.example.freedom.myapplication.R;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class PieSeverity extends Fragment implements OnChartGestureListener {

       public static PieSeverity newInstance() {
        PieSeverity fragment = new PieSeverity();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private PieChart mChart;
    private Typeface tf;


    View myView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        tf = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Regular.ttf");
        myView = inflater.inflate(R.layout.fragment_pie_severity, container, false);

        // create a new chart object
        mChart = myView.findViewById(R.id.piesever);
        mChart.getDescription().setEnabled(false);


        mChart.setCenterTextTypeface(tf);
        mChart.setEntryLabelTextSize(13f);
        mChart.setEntryLabelColor(Color.DKGRAY);
        mChart.setCenterText(generateCenterText());
        mChart.setCenterTextSize(13f);
        mChart.setCenterTextTypeface(tf);
        mChart.setRotationAngle(180);
        mChart.setRotationEnabled(true);

        //Hole
//        mChart.setDrawHoleEnabled(true);
//        mChart.setHoleColor(Color.WHITE);

        //  mChart.spin(500,0,-360f, Easing.EasingOption.EaseInOutQuad);
        // mChart.animateXY(2000,2000);
        //mChart.animateX(2000, Easing.EasingOption.EaseInExpo);
        mChart.animateY(2000, Easing.EasingOption.EaseInExpo);


        // radius of the center hole in percent of maximum radius
        mChart.setHoleRadius(45f);
        mChart.setTransparentCircleRadius(50f);


        Legend l = mChart.getLegend();
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        l.setTextSize(13f);
        l.setTextColor(Color.DKGRAY);
        l.setDrawInside(false);


        Integer low = Integer.parseInt(getArguments().getString("low"));
        Integer Medium = Integer.parseInt(getArguments().getString("Medium"));
        Integer High = Integer.parseInt(getArguments().getString("High"));
        Integer Critical = Integer.parseInt(getArguments().getString("Critical"));


        LegendEntry l1 = new LegendEntry("low" + "  " + low + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(192, 255, 140));
        LegendEntry l2 = new LegendEntry("Medium" + "  " + Medium + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 247, 140));
        LegendEntry l3 = new LegendEntry("High" + "  " + High + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 208, 140));
        LegendEntry l4 = new LegendEntry("Critical" + "  " + Critical + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(140, 234, 255));
//        LegendEntry l6=new LegendEntry("Check", Legend.LegendForm.SQUARE,10f,1f,null,Color.CYAN);
        l.setCustom(new LegendEntry[]{l1, l2, l3, l4});


        mChart.setData(generatePieData());
        return myView;

    }

    @Override
    public void onChartGestureStart(MotionEvent me, ChartTouchListener.ChartGesture lastPerformedGesture) {

    }

    @Override
    public void onChartGestureEnd(MotionEvent me, ChartTouchListener.ChartGesture lastPerformedGesture) {

    }

    @Override
    public void onChartLongPressed(MotionEvent me) {

    }

    @Override
    public void onChartDoubleTapped(MotionEvent me) {

    }

    @Override
    public void onChartSingleTapped(MotionEvent me) {

    }

    @Override
    public void onChartFling(MotionEvent me1, MotionEvent me2, float velocityX, float velocityY) {

    }

    @Override
    public void onChartScale(MotionEvent me, float scaleX, float scaleY) {

    }

    @Override
    public void onChartTranslate(MotionEvent me, float dX, float dY) {

    }

    private PieData generatePieData() {
        int count = 4;

        ArrayList<PieEntry> entries1 = new ArrayList<PieEntry>();
        float low = Float.parseFloat(getArguments().getString("low"));
        float Medium = Float.parseFloat(getArguments().getString("Medium"));
        float High = Float.parseFloat(getArguments().getString("High"));
        float Critical = Float.parseFloat(getArguments().getString("Critical"));
        float LowPer = Float.parseFloat(getArguments().getString("LowPer"));
        float MediumPer = Float.parseFloat(getArguments().getString("MediumPer"));
        float HighPer = Float.parseFloat(getArguments().getString("HighPer"));
        float CriticalPer = Float.parseFloat(getArguments().getString("CriticalPer"));
        float TotalSV = Float.parseFloat(getArguments().getString("TotalSV"));
        float TotalSVPer = Float.parseFloat(getArguments().getString("TotalSVPer"));
        String NameRE = getArguments().getString("namere");


//        for(int i = 0; i < count; i++) {
//            entries1.add(new PieEntry((float) ((Math.random() * 60) + 40), "Quartersss " + (i+1)));
//        }
        if (low > 0) {
            entries1.add(new PieEntry(LowPer, "low Percentage"));
        }
        if (Medium > 0) {
            entries1.add(new PieEntry(MediumPer, "Medium Percentage"));
        }
        if (High > 0) {
            entries1.add(new PieEntry(HighPer, "High Percentage"));
        }
        if (Critical > 0) {
            entries1.add(new PieEntry(CriticalPer, "Critical Percentage"));
        }


        PieDataSet ds1 = new PieDataSet(entries1, "  " + NameRE + "   " + TotalSV + " ตัว ");
        ds1.setDrawValues(true);
        ds1.setValueFormatter(new PercentFormatter());
        ds1.setColors(ColorTemplate.VORDIPLOM_COLORS);
        ds1.setSliceSpace(3f);
        ds1.setValueTextColor(Color.DKGRAY);
        ds1.setValueTextSize(13f);
        ds1.setFormSize(13f);


        // line overlap pie chart
//        ds1.setValueLinePart1OffsetPercentage(60f);
//        ds1.setValueLinePart1Length(.5f);
//        ds1.setValueLinePart2Length(0.4f);
//        ds1.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);

        PieData d = new PieData(ds1);
        d.setValueTypeface(tf);


        return d;
    }

    private SpannableString generateCenterText() {

        //System.getProperty("line.separator")      new line

        String NameRE = getArguments().getString("namere");
        float TotalSVPer = Float.parseFloat(getArguments().getString("TotalSVPer"));

        SpannableString s = new SpannableString(NameRE + "   " + System.getProperty("line.separator") + TotalSVPer + "%");
        s.setSpan(new RelativeSizeSpan(1f), 0, 8, 0);
        s.setSpan(new ForegroundColorSpan(Color.GRAY), 8, s.length(), 0);
        return s;
    }


}
