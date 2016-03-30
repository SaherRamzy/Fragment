package com.example.saher.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by saher on 3/29/2016.
 */
public class FragmentAdapter extends FragmentStatePagerAdapter {

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0:
                return Fragment.newInstance();
            case 1:
                return Fragment_2.newInstance();
            default:
                return Fragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

//    @Override
//    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
////        if (position >= getCount()) {
//        FragmentManager manager = ((android.support.v4.app.Fragment) object).getFragmentManager();
//        FragmentTransaction trans = manager.beginTransaction();
//        trans.detach((android.support.v4.app.Fragment) object);
//        trans.commit();
////        }
//    }


}

