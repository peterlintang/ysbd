package android.support.v4.widget;

import android.database.DataSetObserver;

class CursorAdapter$MyDataSetObserver
  extends DataSetObserver
{
  private CursorAdapter$MyDataSetObserver(CursorAdapter paramCursorAdapter) {}
  
  public void onChanged()
  {
    this.this$0.mDataValid = true;
    this.this$0.notifyDataSetChanged();
  }
  
  public void onInvalidated()
  {
    this.this$0.mDataValid = false;
    this.this$0.notifyDataSetInvalidated();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\CursorAdapter$MyDataSetObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */