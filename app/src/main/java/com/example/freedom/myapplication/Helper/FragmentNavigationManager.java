package com.example.freedom.myapplication.Helper;

import android.arch.core.BuildConfig;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.freedom.myapplication.Defect.Defect_log;
import com.example.freedom.myapplication.R;
import com.example.freedom.myapplication.Report.PriorityActivity;
import com.example.freedom.myapplication.Report.Severity;
import com.example.freedom.myapplication.Report.StatusDefect;
import com.example.freedom.myapplication.Report.Typedefect;

public class FragmentNavigationManager implements NavigationManager {

    private static FragmentNavigationManager mInstance;

    private FragmentManager mFragmentManager;


    public static FragmentNavigationManager getmInstance(Defect_log defect_log) {
        if (mInstance == null)
            mInstance = new FragmentNavigationManager();
        mInstance.configure(defect_log);

        return mInstance;

    }

    private void configure(Defect_log defect_log) {

        defect_log = defect_log;
        mFragmentManager = defect_log.getSupportFragmentManager();
    }


    @Override
    public void showFragment(String title) {

        showFragment(FragmentContent.newInstance(title), false);
    }

    private void showFragment(Fragment fragmentContent, boolean b) {
        FragmentManager fm = mFragmentManager;
        FragmentTransaction ft = fm.beginTransaction().replace(R.id.container, fragmentContent);
        ft.addToBackStack(null);
        if (b || !BuildConfig.DEBUG)
            ft.commitAllowingStateLoss();
        else
            ft.commit();
        fm.executePendingTransactions();
    }


    public static NavigationManager getmInstance(Severity severity) {
        if (mInstance == null)
            mInstance = new FragmentNavigationManager();
        mInstance.configure(severity);

        return mInstance;
    }

    private void configure(Severity severity) {
        severity = severity;
        mFragmentManager = severity.getSupportFragmentManager();
    }


    public static NavigationManager getmInstance(PriorityActivity priorityActivity) {
        if (mInstance == null)
            mInstance = new FragmentNavigationManager();
        mInstance.configure(priorityActivity);

        return mInstance;
    }

    private void configure(PriorityActivity priorityActivity) {
        priorityActivity = priorityActivity;
        mFragmentManager = priorityActivity.getSupportFragmentManager();
    }


    public static NavigationManager getmInstance(Typedefect typedefect) {
        if (mInstance == null)
            mInstance = new FragmentNavigationManager();
        mInstance.configure(typedefect);

        return mInstance;

    }

    private void configure(Typedefect typedefect) {
        typedefect = typedefect;
        mFragmentManager = typedefect.getSupportFragmentManager();
    }

    public static NavigationManager getmInstance(StatusDefect statusDefect) {
        if (mInstance == null)
            mInstance = new FragmentNavigationManager();
        mInstance.configure(statusDefect);

        return mInstance;
    }

    private void configure(StatusDefect statusDefect) {
        statusDefect = statusDefect;
        mFragmentManager = statusDefect.getSupportFragmentManager();
    }
//}
//

}
