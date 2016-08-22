package comhuynhtastic.github.forgetful;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        // get frag man
        TipFragmentPagerAdapter adapter = new TipFragmentPagerAdapter(
                getSupportFragmentManager(), this);

        // set manager to viewpager
        viewPager.setAdapter(adapter);

        // get tab layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        // set to viewpager
        tabLayout.setupWithViewPager(viewPager);

    }
}
