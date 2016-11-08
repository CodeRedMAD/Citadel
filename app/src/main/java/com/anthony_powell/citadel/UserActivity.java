package com.anthony_powell.citadel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class UserActivity extends AppCompatActivity
  implements NavigationView.OnNavigationItemSelectedListener {

 private List<String> itemList = new ArrayList<>();
 private List<Integer> itemIMGLink = new ArrayList<>();
 private List<String> itemOrderDate = new ArrayList<>();
 private ListView listView;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_user);
  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
  setSupportActionBar(toolbar);

  listView = (ListView) findViewById(R.id.orderList);


  itemList.add("4 1/2");
  itemIMGLink.add(R.drawable.guiding_equipment_family);
  itemOrderDate.add(RandomDate());
  itemList.add("5 1/2");
  itemIMGLink.add(R.drawable.plug_placement_aide_with_dart_no_bg);
  itemOrderDate.add(RandomDate());
  itemList.add("7");
  itemIMGLink.add(R.drawable.surface_equipment_family);
  itemOrderDate.add(RandomDate());
  itemList.add("9 5/8");
  itemIMGLink.add(R.drawable.guiding_equipment_family);
  itemOrderDate.add(RandomDate());



  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

  fab.setOnClickListener(new View.OnClickListener() {
   @Override
   public void onClick(View view) {
    startActivity(new Intent(UserActivity.this, mapsFragment.class));
//    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//      .setAction("Action", null).show();

    EditText search = (EditText) findViewById(R.id.searchView);
    search.addTextChangedListener(new TextWatcher() {
     @Override
     public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
      
     }

     @Override
     public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

     }

     @Override
     public void afterTextChanged(Editable editable) {

     }
    });




   }
  });

  DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

  ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
  drawer.setDrawerListener(toggle);
  toggle.syncState();

  NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

  navigationView.setNavigationItemSelectedListener(this);

 }

 @Override
 public void onBackPressed() {
  DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
  if (drawer.isDrawerOpen(GravityCompat.START)) {
   drawer.closeDrawer(GravityCompat.START);
  } else {
   super.onBackPressed();
  }
 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
  // Inflate the menu; this adds items to the action bar if it is present.
  getMenuInflater().inflate(R.menu.user, menu);
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

 @SuppressWarnings("StatementWithEmptyBody")
 @Override
 public boolean onNavigationItemSelected(MenuItem item) {
  // Handle navigation view item clicks here.
  int id = item.getItemId();

  if (id == R.id.nav_orders) {
   listView.setAdapter(new CustomAdapter(this, itemList, itemOrderDate, itemIMGLink));
  } else if (id == R.id.nav_orders) {

  } else if (id == R.id.nav_orders) {

  } else if (id == R.id.nav_orders) {

  } else if (id == R.id.nav_orders) {

  } else if (id == R.id.nav_search) {

  }

  DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
  drawer.closeDrawer(GravityCompat.START);
  return true;
 }


 public String RandomDate(){
  GregorianCalendar gc = new GregorianCalendar();

  int year = randBetween(2015, 2016);

  gc.set(gc.YEAR, year);

  int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

  gc.set(gc.DAY_OF_YEAR, dayOfYear);

  return (gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));

 }
 public static int randBetween(int start, int end) {
  return start + (int)Math.round(Math.random() * (end - start));
 }


 }



