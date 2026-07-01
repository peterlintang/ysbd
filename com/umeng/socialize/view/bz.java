package com.umeng.socialize.view;

import android.text.Editable;
import android.text.TextWatcher;

class bz
  implements TextWatcher
{
  bz(ShareActivity paramShareActivity) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    ShareActivity.a(this.a, ShareActivity.l(this.a));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */