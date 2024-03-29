package hzkj.cc.smallloading;

import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import hzkj.cc.library.LoadingDialog;
import hzkj.cc.library.SmallLoading;

public class MainActivity extends AppCompatActivity {

  RelativeLayout relativeLayout;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    relativeLayout = findViewById(R.id.layout);
//    final SmallLoading smallLoading = new SmallLoading(MainActivity.this);
//    smallLoading.init(relativeLayout);
    final LoadingDialog loadingDialog = new LoadingDialog(this);
    findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
//                smallLoading.show();
        loadingDialog.show();
        new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
            loadingDialog.dismiss();
          }
        }, 3000);
      }
    });
    findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        loadingDialog.dismiss();
      }
    });
  }
}
