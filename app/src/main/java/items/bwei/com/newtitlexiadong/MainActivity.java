package items.bwei.com.newtitlexiadong;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import fragment.Fragment_attention;
import fragment.Fragment_home;
import fragment.Fragment_my;
import fragment.Fragment_video;
import fragment.HomeFragment;


public class MainActivity extends AppCompatActivity {

    FrameLayout fl_main_fragment;
    RadioGroup rg_main_radiogroup_buttom;
    RadioButton home;
    RadioButton video;
    RadioButton attention;
    RadioButton my;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fl_main_fragment = (FrameLayout)findViewById(R.id.fl_main_fragment);
        rg_main_radiogroup_buttom = (RadioGroup)findViewById(R.id.rg_main_radiogroup_buttom);
        home = (RadioButton)findViewById(R.id.home);
        video = (RadioButton)findViewById(R.id.video);
        attention = (RadioButton)findViewById(R.id.attention);
        my = (RadioButton)findViewById(R.id.my);
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_fragment,new HomeFragment()).commit();

        rg_main_radiogroup_buttom.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.home:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_fragment,new Fragment_home()).commit();

                        break;

                    case R.id.video:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_fragment,new Fragment_video()).commit();

                        break;

                    case R.id.attention:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_fragment,new Fragment_attention()).commit();

                        break;

                    case R.id.my:

                        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_fragment,new Fragment_my()).commit();

                        break;

                    default:

                        break;
                }
            }
        });
    }
}