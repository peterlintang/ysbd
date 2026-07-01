package com.ireadercity.b2.store;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

final class m
  implements TextView.OnEditorActionListener
{
  m(CloudStoreActivity paramCloudStoreActivity) {}
  
  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent != null) && (66 == paramKeyEvent.getKeyCode()))
    {
      paramTextView = CloudStoreActivity.c(this.a).getText();
      this.a.a(paramTextView);
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */