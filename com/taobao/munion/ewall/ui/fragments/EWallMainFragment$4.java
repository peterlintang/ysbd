package com.taobao.munion.ewall.ui.fragments;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

class EWallMainFragment$4
  implements TextView.OnEditorActionListener
{
  EWallMainFragment$4(EWallMainFragment paramEWallMainFragment) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if ((paramInt == 3) || (paramInt == 2) || (paramInt == 0))
    {
      paramTextView = this.this$0.searchEdit.getText().toString().trim();
      if (TextUtils.isEmpty(paramTextView)) {
        break label55;
      }
      this.this$0.showSearchResult(paramTextView);
    }
    for (;;)
    {
      bool = true;
      return bool;
      label55:
      Toast.makeText(this.this$0.mContext, "请正确输入搜索内容哦，亲～", 0).show();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallMainFragment$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */