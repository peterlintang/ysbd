package yuku.ambilwarna;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;

final class f
  implements DialogInterface.OnClickListener
{
  f(a parama) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.a.b != null)
    {
      paramDialogInterface = this.a.b;
      a locala = this.a;
      paramDialogInterface.a(Color.HSVToColor(this.a.j));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\yuku\ambilwarna\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */