package com.ekeon.test.kr.twowaysample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ekeon.test.kr.R;
import com.ekeon.test.kr.twowaysample.adapter.TwoWaySampleAdapter;

import org.lucasr.twowayview.TwoWayLayoutManager;
import org.lucasr.twowayview.widget.StaggeredGridLayoutManager;
import org.lucasr.twowayview.widget.TwoWayView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Ekeon on 2016. 2. 22..
 */
public class TwoWaySampleFragment extends Fragment {

  @Bind(R.id.twv_test) TwoWayView testRecyclerView;
  TwoWaySampleAdapter twoWaySampleAdapter;

  public static TwoWaySampleFragment newInstance() {
    return new TwoWaySampleFragment();
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.twowayview, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    ButterKnife.bind(this, view);
    twoWaySampleAdapter = new TwoWaySampleAdapter();

    testRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(TwoWayLayoutManager.Orientation.VERTICAL, 2, 2));
    testRecyclerView.setAdapter(twoWaySampleAdapter);

    Log.d("TAG", "init");
  }

  @Override
  public void onDestroy() {
    ButterKnife.unbind(this);
    super.onDestroy();
  }

}
