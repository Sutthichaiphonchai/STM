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
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;



public class PieStatusdefect extends Fragment {

    public static PieStatusdefect newInstance() {
        PieStatusdefect fragment = new PieStatusdefect();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private PieChart mChart;
    private Typeface tf;


    View viewpieSR;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        viewpieSR = inflater.inflate(R.layout.fragment_pie_statusdefect, container, false);

        tf = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Regular.ttf");
        // create a new chart object
        mChart = viewpieSR.findViewById(R.id.piestatus);
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
        l.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        l.setOrientation(Legend.LegendOrientation.VERTICAL);
        l.setTextSize(13f);
        l.setTextColor(Color.DKGRAY);
        l.setDrawInside(false);


        Integer New = Integer.parseInt(getArguments().getString("New"));
        Integer Assigned = Integer.parseInt(getArguments().getString("Assigned"));
        Integer Open = Integer.parseInt(getArguments().getString("Open"));
        Integer Duplicate = Integer.parseInt(getArguments().getString("Duplicate"));
        Integer Rejected = Integer.parseInt(getArguments().getString("Rejected"));
        Integer Deferred = Integer.parseInt(getArguments().getString("Deferred"));
        Integer Not_A_Bug = Integer.parseInt(getArguments().getString("Not_A_Bug"));
        Integer Fixed = Integer.parseInt(getArguments().getString("Fixed"));
        Integer Pending_Retest = Integer.parseInt(getArguments().getString("Pending_Retest"));
        Integer Retest = Integer.parseInt(getArguments().getString("Retest"));
        Integer Re_Opened = Integer.parseInt(getArguments().getString("Re_Opened"));
        Integer Verified = Integer.parseInt(getArguments().getString("Verified"));
        Integer Closed = Integer.parseInt(getArguments().getString("Closed"));
        Integer AllStatus = Integer.parseInt(getArguments().getString("AllStatus"));



        LegendEntry l1 = new LegendEntry("New" + "  " + New + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(192, 255, 140));
        LegendEntry l2 = new LegendEntry("Assigned" + "  " + Assigned + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 247, 140));
        LegendEntry l3 = new LegendEntry("Open" + "  " + Open + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 208, 140));
        LegendEntry l4 = new LegendEntry("Duplicate" + "  " + Duplicate + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(140, 234, 255));
        LegendEntry l5 = new LegendEntry("Rejected" + "  " + Rejected + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 140, 157));
        LegendEntry l6 = new LegendEntry("Deferred" + "  " + Deferred + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(193, 37, 82));
        LegendEntry l7 = new LegendEntry("Not_A_Bug" + "  " + Not_A_Bug + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 102, 0));
        LegendEntry l8 = new LegendEntry("Fixed" + "  " + Fixed + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 140, 157));
        LegendEntry l9 = new LegendEntry("Pending_Retest" + "  " + Pending_Retest + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(245, 199, 0));
        LegendEntry l12 = new LegendEntry("Retest" + "  " + Retest + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(106, 150, 31));
        LegendEntry l13 = new LegendEntry("Re_Opened" + "  " + Re_Opened + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(179, 100, 53));
        LegendEntry l14 = new LegendEntry("Verified" + "  " + Verified + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(64, 89, 128));
        LegendEntry l15 = new LegendEntry("Closed" + "  " + Closed + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(149, 165, 124));
        LegendEntry l16 = new LegendEntry("AllStatus" + "  " + AllStatus + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(217, 184, 162));

//
// LegendEntry l6=new LegendEntry("Check", Legend.LegendForm.SQUARE,10f,1f,null,Color.CYAN);

        l.setCustom(new LegendEntry[]{l1, l2, l3, l4, l5, l6, l7, l8, l9, l12, l13,l14,l15,l16});


        mChart.setData(generatePieData());
        return viewpieSR;
    }
    private PieData generatePieData() {
        int count = 4;

        ArrayList<PieEntry> entries1 = new ArrayList<PieEntry>();
        float NewPer = Float.parseFloat(getArguments().getString("NewPer"));
        float AssignedPer = Float.parseFloat(getArguments().getString("AssignedPer"));
        float OpenPer = Float.parseFloat(getArguments().getString("OpenPer"));
        float DuplicatePer =Float.parseFloat(getArguments().getString("DuplicatePer"));
        float RejectedPer = Float.parseFloat(getArguments().getString("RejectedPer"));
        float DeferredPer = Float.parseFloat(getArguments().getString("DeferredPer"));
        float Not_A_Bug_Per = Float.parseFloat(getArguments().getString("Not_A_Bug_Per"));
        float FixedPer = Float.parseFloat(getArguments().getString("FixedPer"));
        float Pending_Retest_Per = Float.parseFloat(getArguments().getString("Pending_Retest_Per"));
        float RetestPer = Float.parseFloat(getArguments().getString("RetestPer"));
        float Re_Opened_Per = Float.parseFloat(getArguments().getString("Re_Opened_Per"));
        float VerifiedPer = Float.parseFloat(getArguments().getString("VerifiedPer"));
        float ClosedPer = Float.parseFloat(getArguments().getString("ClosedPer"));
        float AllStatusPer = Float.parseFloat(getArguments().getString("AllStatusPer"));

        String NameRE = getArguments().getString("namere");


        if (NewPer > 0) {
            entries1.add(new PieEntry(NewPer, "New Percentage"));
        }
        if (AssignedPer > 0) {
            entries1.add(new PieEntry(AssignedPer, "Assigned Percentage"));
        }
        if (OpenPer > 0) {
            entries1.add(new PieEntry(OpenPer, "Open Percentage"));
        }
        if (DuplicatePer > 0) {
            entries1.add(new PieEntry(DuplicatePer, "Duplicate Percentage"));
        }
        if (RejectedPer > 0) {
            entries1.add(new PieEntry(RejectedPer, "Rejected Percentage"));
        }
        if (DeferredPer > 0) {
            entries1.add(new PieEntry(DeferredPer, "Deferred Percentage"));
        }
        if (Not_A_Bug_Per > 0) {
            entries1.add(new PieEntry(Not_A_Bug_Per, "Not_A_Bug Percentage"));
        }
        if (FixedPer > 0) {
            entries1.add(new PieEntry(FixedPer, "Fixed Percentage"));
        }
        if (Pending_Retest_Per > 0) {
            entries1.add(new PieEntry(Pending_Retest_Per, "Pending_Retest Percentage"));
        }
        if (RetestPer > 0) {
            entries1.add(new PieEntry(RetestPer, "Retest Percentage"));
        }
        if (Re_Opened_Per > 0) {
            entries1.add(new PieEntry(Re_Opened_Per, "Re_Opened Percentage"));
        }
        if (VerifiedPer > 0) {
            entries1.add(new PieEntry(VerifiedPer, "Verified Percentage"));
        }
        if (ClosedPer > 0) {
            entries1.add(new PieEntry(ClosedPer, "Closed Percentage"));
        }


        PieDataSet ds1 = new PieDataSet(entries1, "  " + NameRE + "   " + AllStatusPer + " ตัว ");
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
        float AllStatusPer = Float.parseFloat(getArguments().getString("AllStatusPer"));
        SpannableString s = new SpannableString(NameRE + "   " + System.getProperty("line.separator") + AllStatusPer + "%");
        s.setSpan(new RelativeSizeSpan(1f), 0, 15, 0);
        s.setSpan(new ForegroundColorSpan(Color.GRAY), 15, s.length(), 0);
        return s;
    }


}