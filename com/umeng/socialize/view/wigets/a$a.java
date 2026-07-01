package com.umeng.socialize.view.wigets;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.umeng.socialize.bean.UMFriend;
import java.util.ArrayList;
import java.util.List;

final class a$a
  extends Filter
{
  private boolean b = true;
  
  public a$a(a parama) {}
  
  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0))
    {
      paramCharSequence = new ArrayList(a.a(this.a));
      paramCharSequence.addAll(a.b(this.a));
      localFilterResults.values = paramCharSequence;
      localFilterResults.count = paramCharSequence.size();
      return localFilterResults;
    }
    ArrayList localArrayList = new ArrayList();
    paramCharSequence = paramCharSequence.toString().toLowerCase();
    int j = a.b(this.a).size();
    int i = 0;
    for (;;)
    {
      if (i >= j)
      {
        paramCharSequence = localArrayList;
        break;
      }
      UMFriend localUMFriend = (UMFriend)a.b(this.a).get(i);
      if (this.a.a(localUMFriend, paramCharSequence)) {
        localArrayList.add(localUMFriend);
      }
      i += 1;
    }
  }
  
  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    a.a(this.a, (ArrayList)paramFilterResults.values);
    if (paramFilterResults.count > 0)
    {
      this.a.notifyDataSetChanged();
      return;
    }
    this.a.notifyDataSetInvalidated();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */