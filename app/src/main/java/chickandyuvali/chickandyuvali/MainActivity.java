package chickandyuvali.chickandyuvali;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;




public class MainActivity extends ActionBarActivity {

    ImageView im;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec1 = tabHost.newTabSpec("Tab 1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("About", getResources().getDrawable(R.drawable.abc_btn_radio_material));

        TabHost.TabSpec spec2 = tabHost.newTabSpec("Tab 2");
        spec2.setIndicator("Our Animals", getResources().getDrawable(R.drawable.notification_template_icon_bg));
        spec2.setContent(R.id.tab2);

        TabHost.TabSpec spec3 = tabHost.newTabSpec("Tab 3");
        spec3.setIndicator("Contact Us", getResources().getDrawable(R.drawable.abc_ic_menu_selectall_mtrl_alpha));
        spec3.setContent(R.id.tab3);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void biggerView(View v) {
        im = (ImageView) findViewById(R.id.selected);

        switch (v.getId()) {
            case R.id.image1:
                im.setImageResource(R.drawable.pic1);
                break;
            case R.id.image2:
                im.setImageResource(R.drawable.pic2);
                break;
            case R.id.image3:
                im.setImageResource(R.drawable.pic3);
                break;
            case R.id.image4:
                im.setImageResource(R.drawable.pic4);
                break;
            case R.id.image5:
                im.setImageResource(R.drawable.pic5);
                break;
            case R.id.image6:
                im.setImageResource(R.drawable.pic6);
                break;
            case R.id.image7:
                im.setImageResource(R.drawable.pic7);
                break;
        }
    }
}
