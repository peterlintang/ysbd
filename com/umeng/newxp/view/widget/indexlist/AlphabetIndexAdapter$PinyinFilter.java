package com.umeng.newxp.view.widget.indexlist;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.List;

final class AlphabetIndexAdapter$PinyinFilter
  extends Filter
{
  private boolean b = true;
  
  public AlphabetIndexAdapter$PinyinFilter(AlphabetIndexAdapter paramAlphabetIndexAdapter) {}
  
  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if ((paramCharSequence == null) || (paramCharSequence.length() == 0))
    {
      paramCharSequence = new ArrayList(AlphabetIndexAdapter.a(this.a));
      paramCharSequence.addAll(AlphabetIndexAdapter.b(this.a));
    }
    for (;;)
    {
      localFilterResults.values = paramCharSequence;
      localFilterResults.count = paramCharSequence.size();
      return localFilterResults;
      ArrayList localArrayList = new ArrayList();
      paramCharSequence = paramCharSequence.toString().toLowerCase();
      int j = AlphabetIndexAdapter.b(this.a).size();
      int i = 0;
      while (i < j)
      {
        City localCity = (City)AlphabetIndexAdapter.b(this.a).get(i);
        if (this.a.a(localCity, paramCharSequence)) {
          localArrayList.add(localCity);
        }
        i += 1;
      }
      paramCharSequence = localArrayList;
    }
  }
  
  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    AlphabetIndexAdapter.a(this.a, (ArrayList)paramFilterResults.values);
    if (paramFilterResults.count > 0)
    {
      this.a.notifyDataSetChanged();
      return;
    }
    this.a.notifyDataSetInvalidated();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\indexlist\AlphabetIndexAdapter$PinyinFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */