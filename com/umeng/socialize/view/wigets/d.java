package com.umeng.socialize.view.wigets;

import android.text.Editable;
import android.text.TextWatcher;

class d
  implements TextWatcher
{
  d(SearchBox paramSearchBox) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (paramEditable != null) {
      SearchBox.access$0(this.a, paramEditable.toString());
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */