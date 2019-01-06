package com.udacity.krishna.newsapp.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.udacity.krishna.newsapp.model.ArticleType;
import com.udacity.krishna.newsapp.ui.ArticleCategoryFragment;

import static com.udacity.krishna.newsapp.model.ArticleType.Type.types;

public class ArticleCategoryPagerAdapter extends FragmentPagerAdapter {

    //Store fragment tags to get its instances later from FragmentManager
    public String[] fragmentTags = new String[getCount()];

    public ArticleCategoryPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // Referred this excellent answer -> https://stackoverflow.com/a/29269509
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        Fragment fragment = (Fragment) super.instantiateItem(container, position);
        fragmentTags[position] = fragment.getTag();
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return ArticleType.Type.getName(types[position]);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a Fragment of a article type
        return ArticleCategoryFragment.newInstance(types[position]);
    }

    @Override
    public int getCount() {
        return types.length;
    }
}
