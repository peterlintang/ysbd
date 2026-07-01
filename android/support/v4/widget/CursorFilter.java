package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class CursorFilter
  extends Filter
{
  CursorFilter.CursorFilterClient mClient;
  
  CursorFilter(CursorFilter.CursorFilterClient paramCursorFilterClient)
  {
    this.mClient = paramCursorFilterClient;
  }
  
  public CharSequence convertResultToString(Object paramObject)
  {
    return this.mClient.convertToString((Cursor)paramObject);
  }
  
  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    paramCharSequence = this.mClient.runQueryOnBackgroundThread(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (paramCharSequence != null)
    {
      localFilterResults.count = paramCharSequence.getCount();
      localFilterResults.values = paramCharSequence;
      return localFilterResults;
    }
    localFilterResults.count = 0;
    localFilterResults.values = null;
    return localFilterResults;
  }
  
  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = this.mClient.getCursor();
    if ((paramFilterResults.values != null) && (paramFilterResults.values != paramCharSequence)) {
      this.mClient.changeCursor((Cursor)paramFilterResults.values);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\CursorFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */