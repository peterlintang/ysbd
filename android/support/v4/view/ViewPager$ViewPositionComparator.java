package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

class ViewPager$ViewPositionComparator
  implements Comparator<View>
{
  public int compare(View paramView1, View paramView2)
  {
    paramView1 = (ViewPager.LayoutParams)paramView1.getLayoutParams();
    paramView2 = (ViewPager.LayoutParams)paramView2.getLayoutParams();
    if (paramView1.isDecor != paramView2.isDecor)
    {
      if (paramView1.isDecor) {
        return 1;
      }
      return -1;
    }
    return paramView1.position - paramView2.position;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ViewPager$ViewPositionComparator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */