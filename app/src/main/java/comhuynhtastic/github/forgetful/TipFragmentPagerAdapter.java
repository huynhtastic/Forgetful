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
            case 1: return new RoutineFragment();
            case 2: return new PlopFragment();
            default: return new OverviewFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return mContext.getString(R.string.overview_title);
            case 1: return mContext.getString(R.string.routine_title);
            case 2: return mContext.getString(R.string.plop_title);
            default: return "";
        }
    }
}
