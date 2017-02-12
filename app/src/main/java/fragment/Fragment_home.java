package fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import items.bwei.com.newtitlexiadong.MyAdapter;
import items.bwei.com.newtitlexiadong.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_home extends Fragment {
    private String[] title = {"推荐","热点","北京","阳光宽频","社会","头条号","问答","娱乐","科技",
            "汽车","体育","财经","军事","国际","段子","趣图","美女","健康","正能量","特卖","图片"};
    private List<Fragment> list;

    private TabLayout tabLayout;
    private ViewPager viewPager;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = View.inflate(getActivity(),R.layout.fragment_home,null);
        return view;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tabLayout = (TabLayout) view.findViewById(R.id.home_tablayout_title);
        viewPager = (ViewPager) view.findViewById(R.id.home_viewpager_title);
        initData();
        MyAdapter adapter = new MyAdapter(getActivity().getSupportFragmentManager(), list, getActivity() ,title);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    private void initData() {
        list = new ArrayList<>();
        for (int i = 0; i < title.length; i++){
        HomeFragment fragment = new HomeFragment();
            list.add(fragment);
        }

    }
}
