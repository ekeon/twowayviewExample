package com.ekeon.test.kr.twowaysample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.ekeon.test.kr.twowaysample.viewholder.HolderOne;
import com.ekeon.test.kr.twowaysample.viewholder.HolderThree;
import com.ekeon.test.kr.twowaysample.viewholder.HolderTwo;

import org.lucasr.twowayview.widget.TwoWayView;
/**
 * Created by Ekeon on 2016. 2. 22..
 */
public class TwoWaySampleAdapter extends TwoWayView.Adapter {

  private final int TYPE_HOLDER_ONE = 0;
  private final int TYPE_HOLDER_TWO = 1;
  private final int TYPE_HOLDER_THREE = 2;

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    RecyclerView.ViewHolder viewHolder = null;
    Context context = parent.getContext();

    switch (viewType) {
      case TYPE_HOLDER_ONE:
        viewHolder = HolderOne.newInstance(context);
        break;
      case TYPE_HOLDER_TWO:
        viewHolder = HolderTwo.newInstance(context);
        break;
      case TYPE_HOLDER_THREE:
        viewHolder = HolderThree.newInstance(context);
        break;
    }
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    if (holder instanceof HolderOne) {
      ((HolderOne) holder).bind(position);
    }
  }

  @Override
  public int getItemCount() {
    return 13;
  }

  @Override
  public int getItemViewType(int position) {
    if (position >= 0 && position <= 4) {
     return TYPE_HOLDER_ONE;
    }

    if (position >= 5 && position <= 9) {
      return TYPE_HOLDER_TWO;
    }

    if (position >= 10 && position <= 14) {
      return TYPE_HOLDER_THREE;
    }
    return super.getItemViewType(position);
  }
}
