package android.support.v4.widget;

import android.content.Context;
import android.view.View;
import android.widget.SearchView;

class SearchViewCompatIcs
{
  public static View newSearchView(Context paramContext)
  {
    return new SearchViewCompatIcs.MySearchView(paramContext);
  }
  
  public static void setImeOptions(View paramView, int paramInt)
  {
    ((SearchView)paramView).setImeOptions(paramInt);
  }
  
  public static void setInputType(View paramView, int paramInt)
  {
    ((SearchView)paramView).setInputType(paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\SearchViewCompatIcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */