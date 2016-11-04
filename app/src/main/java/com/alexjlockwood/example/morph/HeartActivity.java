package com.alexjlockwood.example.morph;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HeartActivity extends AppCompatActivity {

  @BindView(R.id.icon) CheckableImageView iconView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_heart);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.rootview)
  void onClick() {
    iconView.toggle();
  }
}
