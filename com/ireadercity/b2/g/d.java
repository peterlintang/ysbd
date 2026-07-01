package com.ireadercity.b2.g;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.iflytek.speech.SpeechSynthesizer;

final class d
  implements DialogInterface.OnClickListener
{
  d(a parama) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.c();
    a.a(this.a, paramInt);
    a.d(this.a);
    paramDialogInterface.dismiss();
    if (a.g(this.a) != null)
    {
      if (a.i(this.a).startSpeaking(a.g(this.a).a(), a.h(this.a)) != 0) {
        Toast.makeText(a.e(this.a), "无本地发音人资源，请到讯飞语音+中下载发音人！", 1).show();
      }
    }
    else {
      return;
    }
    this.a.d = true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\g\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */