package com.ekeon.test.kr.twowaysample.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.ekeon.test.kr.R;

/**
 * Created by Ekeon on 2016. 2. 22..
 */
public class HolderThree extends RecyclerView.ViewHolder {

  public static HolderThree newInstance(Context context) {
    View itemView = LayoutInflater.from(context).inflate(R.layout.holder_three, null);
    return new HolderThree(itemView);
  }

  public HolderThree(View itemView) {
    super(itemView);
  }
}
