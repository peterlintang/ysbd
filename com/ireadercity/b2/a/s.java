package com.ireadercity.b2.a;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import com.ireadercity.b2.bean.b;
import java.util.HashMap;

final class s
  implements CompoundButton.OnCheckedChangeListener
{
  s(r paramr) {}
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    try
    {
      b localb = (b)paramCompoundButton.getTag();
      ImageView localImageView = (ImageView)paramCompoundButton.getTag(2131361910);
      r.g();
      new StringBuilder().append(paramCompoundButton).append("----").append(paramBoolean).append("----").append(localb.k()).append(" cover=").append(localImageView).toString();
      if (paramBoolean)
      {
        r.a(this.a).put(localb, Boolean.valueOf(paramBoolean));
        paramCompoundButton.setChecked(true);
        paramCompoundButton.setVisibility(0);
        paramCompoundButton.bringToFront();
        paramCompoundButton.requestLayout();
        if (localImageView != null)
        {
          localImageView.setAlpha(85);
          localImageView.requestLayout();
        }
      }
      else
      {
        r.a(this.a).remove(localb);
        paramCompoundButton.setChecked(false);
        paramCompoundButton.setVisibility(8);
        if (localImageView != null)
        {
          localImageView.setAlpha(255);
          return;
        }
      }
    }
    catch (ClassCastException paramCompoundButton)
    {
      paramCompoundButton.printStackTrace();
      return;
    }
    catch (Exception paramCompoundButton)
    {
      paramCompoundButton.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */