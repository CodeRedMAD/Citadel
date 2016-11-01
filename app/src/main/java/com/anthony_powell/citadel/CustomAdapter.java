package com.anthony_powell.citadel;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SGT_POWELL on 10/30/2016.
 */

public class CustomAdapter extends BaseAdapter {

 List<Integer> Img;
 List<String> Titles, Date;
 Context context;

 public static LayoutInflater inflater = null;

 public CustomAdapter(UserActivity userActivity, List<String> titles, List<String> date, List<Integer> img) {
  Titles = titles;
  Date = date;
  Img = img;
  context = userActivity;
  inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


 }

 @Override
 public int getCount() {
  return Titles.size();
 }

 @Override
 public Object getItem(int i) {
  return i;
 }

 @Override
 public long getItemId(int i) {
  return i;
 }


 public class Holder {
  TextView title, data;
  ImageView itemImg;
 }

 @Override
 public View getView(final int position, View convertView, ViewGroup parent) {
  Holder holder = new Holder();
  View view;
  view = inflater.inflate(R.layout.orders_nav_view, null);
  holder.title = (TextView) view.findViewById(R.id.itemTitle);
  holder.itemImg = (ImageView) view.findViewById(R.id.itemImage);
  holder.data = (TextView) view.findViewById(R.id.itemDate);
  holder.title.setText(Titles.get(position));
  holder.itemImg.setImageResource(Img.get(position));
  holder.data.setText(Date.get(position));
  view.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View view) {
    Snackbar.make(view, Titles.get(position), Snackbar.LENGTH_LONG);
   }
  });
  return view;
 }
}

