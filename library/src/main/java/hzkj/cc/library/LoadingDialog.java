package hzkj.cc.library;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class LoadingDialog extends Dialog {

  SmallLoading smallLoading;
  RelativeLayout relativeLayout;

  public LoadingDialog(@NonNull Context context) {
    super(context);
    init();
  }

  public LoadingDialog(@NonNull Context context, int themeResId) {
    super(context, themeResId);
  }

  private void init() {
    View view = LayoutInflater.from(getContext()).inflate(R.layout.dialog, null, false);
    relativeLayout = view.findViewById(R.id.layout);
    setCancelable(false);
    smallLoading = new SmallLoading(getContext());
    smallLoading.init(relativeLayout);
    smallLoading.show();
    setContentView(view);
  }
}
