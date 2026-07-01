package android.support.v4.view;

import android.widget.TextView;

class PagerTitleStripIcs
{
  public static void setSingleLineAllCaps(TextView paramTextView)
  {
    paramTextView.setTransformationMethod(new PagerTitleStripIcs.SingleLineAllCapsTransform(paramTextView.getContext()));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\PagerTitleStripIcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */