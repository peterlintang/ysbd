package com.umeng.socialize.view.wigets;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ListView;

public class SearchBox
  extends EditText
{
  private SearchBox.a listener;
  private ListView lv;
  private TextWatcher watcher = new d(this);
  
  public SearchBox(Context paramContext)
  {
    super(paramContext);
    addTextChangedListener(this.watcher);
  }
  
  public SearchBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    addTextChangedListener(this.watcher);
  }
  
  private boolean isAllPinyin(String paramString)
  {
    paramString = paramString.toCharArray();
    int i = paramString.length - 1;
    for (;;)
    {
      if (i < 0) {
        return true;
      }
      if ((paramString[i] > '') || (paramString[i] < 0)) {
        return false;
      }
      i -= 1;
    }
  }
  
  private void searchText(String paramString)
  {
    ((a)this.lv.getAdapter()).a(paramString, isAllPinyin(paramString));
    SearchBox.a locala;
    if (this.listener != null)
    {
      locala = this.listener;
      if (!TextUtils.isEmpty(paramString)) {
        break label48;
      }
    }
    label48:
    for (boolean bool = false;; bool = true)
    {
      locala.a(bool);
      return;
    }
  }
  
  public void setListView(ListView paramListView)
  {
    this.lv = paramListView;
  }
  
  public void setSearchResultListener(SearchBox.a parama)
  {
    this.listener = parama;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\SearchBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */