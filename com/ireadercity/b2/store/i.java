package com.ireadercity.b2.store;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.ireadercity.b2.ui.widget.SegmentedRadioGroup;

final class i
  implements DialogInterface.OnClickListener
{
  i(CloudStoreActivity paramCloudStoreActivity, View paramView) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    EditText localEditText1 = (EditText)this.a.findViewById(2131361896);
    EditText localEditText2 = (EditText)this.a.findViewById(2131361899);
    new r(this.b).execute(new String[] { localEditText1.getText(), localEditText2.getText() });
    CloudStoreActivity.l(this.b);
    paramDialogInterface.dismiss();
    paramDialogInterface = (SegmentedRadioGroup)CloudStoreActivity.m(this.b).findViewById(2131362330);
    paramDialogInterface.check(paramDialogInterface.getChildAt(0).getId());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */