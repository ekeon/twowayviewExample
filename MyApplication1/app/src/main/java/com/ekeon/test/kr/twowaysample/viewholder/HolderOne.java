package com.ekeon.test.kr.twowaysample.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.ekeon.test.kr.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Ekeon on 2016. 2. 22..
 */
public class HolderOne extends RecyclerView.ViewHolder {

  @Bind(R.id.btn_holder_one) Button btnHolderOne;

  public static HolderOne newInstance(Context context) {
    View itemView = LayoutInflater.from(context).inflate(R.layout.holder_one, null);
    return new HolderOne(itemView);
  }

  public HolderOne(View itemView) {
    super(itemView);
    ButterKnife.bind(this, itemView);
  }

  public void bind(int position) {
    btnHolderOne.setText("" + position);
  }

}
