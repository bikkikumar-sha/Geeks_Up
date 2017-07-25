package layout;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.geek1.R;
import com.example.android.geek1.SimpleFragmentPagerAdapter;
import com.example.android.geek1.SimpleFragmentPagerAdapterHome;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle("Home");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_home, container, false);
        // Find the view pager that will allow the user to swipe between fragments

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapterHome adapter = new SimpleFragmentPagerAdapterHome(getChildFragmentManager());

        // Set the adapter onto the view pager
        if (viewPager != null) {
            viewPager.setAdapter(adapter);
        }
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) view.findViewById(R.id.sliding_tabs);

        if (tabLayout != null) {
            tabLayout.setupWithViewPager(viewPager);
        }
        // Inflate the layout for this fragment
        return view;

    }

}
