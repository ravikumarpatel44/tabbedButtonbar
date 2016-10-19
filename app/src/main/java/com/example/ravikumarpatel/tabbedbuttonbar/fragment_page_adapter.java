package com.example.ravikumarpatel.tabbedbuttonbar;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ravi kumar patel on 10/19/2016.
 */

public class fragment_page_adapter extends FragmentPagerAdapter {

    private String[] tabtitle=new String[]{"Tab_no1","Tab_no2","Tab_no3","Tab_no4"};
    Context context;
    private int pagecount=4;
    public fragment_page_adapter(FragmentManager fm , Context context) {
        super(fm);
        this.context=context;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        Fragment fragmentDemo =new Fragment();
        return fragmentDemo;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return pagecount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitle[position];
    }
}
