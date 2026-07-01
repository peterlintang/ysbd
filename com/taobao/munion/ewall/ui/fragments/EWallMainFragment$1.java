package com.taobao.munion.ewall.ui.fragments;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class EWallMainFragment$1
  implements View.OnClickListener
{
  EWallMainFragment$1(EWallMainFragment paramEWallMainFragment) {}
  
  public void onClick(View paramView)
  {
    if (this.this$0.searchState)
    {
      paramView = new Intent("android.speech.action.RECOGNIZE_SPEECH");
      paramView.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
      paramView.putExtra("android.speech.extra.PROMPT", "请开始说话");
      this.this$0.startActivityForResult(paramView, 2199);
      return;
    }
    this.this$0.searchEdit.setText("");
    EWallMainFragment.access$000(this.this$0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallMainFragment$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */