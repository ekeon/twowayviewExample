package com.ekeon.test.kr;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;

import com.ekeon.test.kr.twowaysample.TwoWaySampleFragment;
import com.ekeon.test.kr.twowaysample.adapter.TwoWaySampleAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

  @Bind(R.id.fab) ImageView fab;
  private boolean fabUp = false;

  @OnClick(R.id.btn_hello)
  void onbtnClick() {
    ViewPropertyAnimator viewPropertyAnimator = fab.animate();

    if (!fabUp) {
      fabUp = true;
      viewPropertyAnimator.cancel();
      viewPropertyAnimator
              .setDuration(3000)
              .translationY(-2000)
              .rotationY(300);
      viewPropertyAnimator.start();
    } else {
      fabUp = false;
      viewPropertyAnimator.cancel();
      viewPropertyAnimator
              .setDuration(3000)
              .translationY(0)
              .rotationY(0);
      viewPropertyAnimator.start();
    }
  }

  @OnClick(R.id.btn_show_twv)
  void onShowTwv() {
    Fragment twoWaySampleFragment = TwoWaySampleFragment.newInstance();
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction()
            .add(R.id.fl_fragment_layout, twoWaySampleFragment)
            .show(twoWaySampleFragment);

    fragmentTransaction.commit();
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
      }
    });
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
}
