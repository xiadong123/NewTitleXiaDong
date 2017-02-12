package items.bwei.com.newtitlexiadong;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 作者：夏冬
 * 时间：2017/2/12.
 */
public class MyAdapter extends FragmentPagerAdapter {

    List<Fragment> list;
    Context context;
    String [] title;

    public MyAdapter(FragmentManager fm, List<Fragment> list, Context context, String[] title){

        super(fm);
        this.context = context;
        this.title = title;
        this.list=list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}