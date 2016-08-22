package comhuynhtastic.github.forgetful;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Richard Huynh on 8/21/2016.
 */
public class TipFragmentPagerAdapter extends FragmentPagerAdapter {

    Context mContext;

    public TipFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new OverviewFragment();
            default: return new OverviewFragment();
        }
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Overview";
            default: return "Overview";
        }
    }
}
