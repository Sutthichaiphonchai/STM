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

public class PieTypedefect extends Fragment {

    public static PieTypedefect newInstance() {
        PieTypedefect fragment = new PieTypedefect();
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private PieChart mChart;
    private Typeface tf;


    View viewpieSD;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        viewpieSD = inflater.inflate(R.layout.fragment_pie_typedefect, container, false);
        tf = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Regular.ttf");
        // create a new chart object
        mChart = viewpieSD.findViewById(R.id.pieType);
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


        Integer Documentation = Integer.parseInt(getArguments().getString("Documentation"));
        Integer Syntax = Integer.parseInt(getArguments().getString("Syntax"));
        Integer Build_Package = Integer.parseInt(getArguments().getString("Build_Package"));
        Integer Assignment = Integer.parseInt(getArguments().getString("Assignment"));
        Integer Interface = Integer.parseInt(getArguments().getString("Interface"));
        Integer Checking = Integer.parseInt(getArguments().getString("Checking"));
        Integer Data = Integer.parseInt(getArguments().getString("Data"));
        Integer Function = Integer.parseInt(getArguments().getString("Function"));
        Integer System = Integer.parseInt(getArguments().getString("System"));
        Integer Environment = Integer.parseInt(getArguments().getString("Environment"));
        Integer AllType = Integer.parseInt(getArguments().getString("AllType"));



        LegendEntry l1 = new LegendEntry("Documentation" + "  " + Documentation + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(192, 255, 140));
        LegendEntry l2 = new LegendEntry("Syntax" + "  " + Syntax + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 247, 140));
        LegendEntry l3 = new LegendEntry("Interface" + "  " + Build_Package + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 208, 140));
        LegendEntry l4 = new LegendEntry("Assignment" + "  " + Assignment + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(140, 234, 255));
        LegendEntry l5 = new LegendEntry("Interface" + "  " + Interface + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 140, 157));
        LegendEntry l6 = new LegendEntry("Checking" + "  " + Checking + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(193, 37, 82));
        LegendEntry l7 = new LegendEntry("Data" + "  " + Data + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 102, 0));
        LegendEntry l8 = new LegendEntry("Function" + "  " + Function + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(255, 140, 157));
        LegendEntry l9 = new LegendEntry("System" + "  " + System + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(245, 199, 0));
        LegendEntry l12 = new LegendEntry("Environment" + "  " + Environment + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(106, 150, 31));
        LegendEntry l13 = new LegendEntry("AllType" + "  " + AllType + "  " + "ตัว", Legend.LegendForm.DEFAULT, 12f, 2f, null, Color.rgb(179, 100, 53));

//
// LegendEntry l6=new LegendEntry("Check", Legend.LegendForm.SQUARE,10f,1f,null,Color.CYAN);

        l.setCustom(new LegendEntry[]{l1, l2, l3, l4, l5, l6, l7, l8, l9, l12, l13});


        mChart.setData(generatePieData());

        return viewpieSD;
    }

    private PieData generatePieData() {
        int count = 4;

        ArrayList<PieEntry> entries1 = new ArrayList<PieEntry>();
        float DocumentationPer = Float.parseFloat(getArguments().getString("DocumentationPer"));
        float SyntaxPer = Float.parseFloat(getArguments().getString("SyntaxPer"));
        float Build_PackagePer = Float.parseFloat(getArguments().getString("Build_PackagePer"));
        float AssignmentPer =Float.parseFloat(getArguments().getString("AssignmentPer"));
        float InterfacePer = Float.parseFloat(getArguments().getString("InterfacePer"));
        float CheckingPer = Float.parseFloat(getArguments().getString("CheckingPer"));
        float DataPer = Float.parseFloat(getArguments().getString("DataPer"));
        float FunctionPer = Float.parseFloat(getArguments().getString("FunctionPer"));
        float SystemPer = Float.parseFloat(getArguments().getString("SystemPer"));
        float EnvironmentPer = Float.parseFloat(getArguments().getString("EnvironmentPer"));
        float AllTypePer = Float.parseFloat(getArguments().getString("AllTypePer"));

        String NameRE = getArguments().getString("namere");


        if (DocumentationPer > 0) {
            entries1.add(new PieEntry(DocumentationPer, "Documentation Percentage"));
        }
        if (SyntaxPer > 0) {
            entries1.add(new PieEntry(SyntaxPer, "Syntax Percentage"));
        }
        if (Build_PackagePer > 0) {
            entries1.add(new PieEntry(Build_PackagePer, "Build_Package Percentage"));
        }
        if (AssignmentPer > 0) {
            entries1.add(new PieEntry(AssignmentPer, "Assignment Percentage"));
        }
        if (InterfacePer > 0) {
            entries1.add(new PieEntry(InterfacePer, "Interface Percentage"));
        }
        if (CheckingPer > 0) {
            entries1.add(new PieEntry(CheckingPer, "Checking Percentage"));
        }
        if (DataPer > 0) {
            entries1.add(new PieEntry(DataPer, "Data Percentage"));
        }
        if (FunctionPer > 0) {
            entries1.add(new PieEntry(FunctionPer, "Function Percentage"));
        }
        if (SystemPer > 0) {
            entries1.add(new PieEntry(SystemPer, "System Percentage"));
        }
        if (EnvironmentPer > 0) {
            entries1.add(new PieEntry(EnvironmentPer, "Environment Percentage"));
        }


        PieDataSet ds1 = new PieDataSet(entries1, "  " + NameRE + "   " + AllTypePer + " ตัว ");
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
        float AllTypePer = Float.parseFloat(getArguments().getString("AllTypePer"));
        SpannableString s = new SpannableString(NameRE + "   " + System.getProperty("line.separator") + AllTypePer + "%");
        s.setSpan(new RelativeSizeSpan(1f), 0, 15, 0);
        s.setSpan(new ForegroundColorSpan(Color.GRAY), 15, s.length(), 0);
        return s;
    }


}
