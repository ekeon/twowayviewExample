package com.ekeon.test.kr.twowaysample.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.ekeon.test.kr.R;

/**
 * Created by Ekeon on 2016. 2. 22..
 */
public class HolderTwo extends RecyclerView.ViewHolder {

  public static HolderTwo newInstance(Context context) {
    View itemView = LayoutInflater.from(context).inflate(R.layout.holder_two, null);
    return new HolderTwo(itemView);
  }

  public HolderTwo(View itemView) {
    super(itemView);
  }
}
