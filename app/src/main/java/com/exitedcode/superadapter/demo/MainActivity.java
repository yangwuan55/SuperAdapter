package com.exitedcode.superadapter.demo;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.TableLayout;

import com.exitedcode.superadapter.base.DataAdapter;
import com.exitedcode.superadapter.base.IViewHolder;
import com.exitedcode.superadapter.base.SuperAdapterFactory;
import com.exitedcode.superadapter.multitype.SimpleDatabindingType;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FragmentStatePagerAdapter mPagerAdapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new NormalFragment();
                case 1:
                    return new DatabindingFragment();
                case 2:
                    return new MultiTypeDatabindingFragment();
            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title=" ";
            switch (position){
                case 0:
                    title="normal";
                    break;
                case 1:
                    title="databinding";
                    break;
                case 2:
                    title="multiType";
                    break;
            }

            return title;
        }

        @Override
        public int getCount() {
            return 3;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewpager = ((ViewPager) findViewById(R.id.viewpager));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewpager.setAdapter(mPagerAdapter);
        tabLayout.setupWithViewPager(viewpager);
    }
}
