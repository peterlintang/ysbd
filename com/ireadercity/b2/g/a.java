package com.ireadercity.b2.g;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.TextView;
import com.iflytek.speech.InitListener;
import com.iflytek.speech.SpeechSynthesizer;
import com.iflytek.speech.SpeechUtility;
import com.iflytek.speech.SynthesizerListener;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class a
{
  final int a = 100;
  final int b = 2000;
  h c;
  boolean d = false;
  boolean e = false;
  public boolean f = false;
  private String g = "XunfeiTtsHelp";
  private Context h;
  private Activity i;
  private BlockingQueue<i> j;
  private i k;
  private int l = -1;
  private SpeechSynthesizer m;
  private Handler n;
  private Dialog o;
  private int p = 0;
  private SynthesizerListener q = new b(this);
  private InitListener r = new c(this);
  
  public a(Context paramContext, Activity paramActivity, h paramh)
  {
    String str = this.g;
    this.h = paramContext;
    this.i = paramActivity;
    this.c = paramh;
    this.j = new ArrayBlockingQueue(100);
    this.n = new g(this);
    this.m = new SpeechSynthesizer(paramContext, this.r);
  }
  
  private boolean a(String paramString, int paramInt)
  {
    paramString = new i(this, paramString, paramInt);
    return this.j.offer(paramString);
  }
  
  private void i()
  {
    String str = this.g;
    if (!this.f) {
      return;
    }
    if (this.j.isEmpty())
    {
      this.c.a();
      return;
    }
    while (!this.j.isEmpty())
    {
      this.k = ((i)this.j.poll());
      if ((this.k != null) && (this.l == this.k.b()))
      {
        if (this.d == true) {
          c();
        }
        int i1 = this.m.startSpeaking(this.k.a(), this.q);
        if (i1 != 0)
        {
          new StringBuilder("start speak error : ").append(i1).toString();
          return;
        }
        this.d = true;
        return;
      }
    }
    this.d = true;
  }
  
  public final void a()
  {
    if ((this.m != null) && (this.f == true))
    {
      if ((this.k == null) || (this.l != this.k.b())) {
        break label92;
      }
      if (!this.e) {
        break label77;
      }
      c();
      this.m.startSpeaking(this.k.a(), this.q);
      this.d = true;
    }
    for (;;)
    {
      this.e = false;
      return;
      label77:
      this.m.resumeSpeaking(this.q);
      break;
      label92:
      i();
    }
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    String str = this.g;
    boolean bool1;
    if (this.l != paramInt2)
    {
      this.l = paramInt2;
      if (paramString.length() >= 2000) {
        break label50;
      }
      bool1 = a(paramString, paramInt1);
    }
    for (;;)
    {
      if (bool1) {
        i();
      }
      return;
      label50:
      int i1 = paramString.length() / 2000 + 1;
      paramInt2 = 0;
      if (paramInt2 < i1)
      {
        if (paramInt2 == i1 - 1)
        {
          bool1 = bool2;
          if (!a(paramString.substring(paramInt2 * 2000, paramString.length() - 1), paramInt1)) {}
        }
        else
        {
          while (a(paramString.substring(paramInt2 * 2000, paramInt2 * 2000 + 2000), paramInt1))
          {
            paramInt2 += 1;
            break;
          }
          bool1 = bool2;
        }
      }
      else {
        bool1 = true;
      }
    }
  }
  
  public final void b()
  {
    if ((this.m != null) && (this.f == true))
    {
      this.m.pauseSpeaking(this.q);
      this.d = false;
    }
  }
  
  public final void c()
  {
    if ((this.m != null) && (this.f == true))
    {
      this.m.stopSpeaking(this.q);
      this.d = false;
      this.e = true;
    }
  }
  
  public final void d()
  {
    String str = this.g;
    if ((this.m != null) && (this.f == true))
    {
      this.m.stopSpeaking(this.q);
      this.m.destory();
      this.m = null;
      this.d = false;
      this.f = false;
    }
  }
  
  public final boolean e()
  {
    boolean bool2 = false;
    List localList = this.h.getPackageManager().getInstalledPackages(0);
    int i1 = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i1 < localList.size())
      {
        if (((PackageInfo)localList.get(i1)).packageName.equals("com.iflytek.speechcloud")) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  public final void f()
  {
    new AlertDialog.Builder(this.h).setTitle("合成发音人选项").setSingleChoiceItems(com.ireadercity.b2.a.at, this.p, new d(this)).show();
  }
  
  public final void g()
  {
    if (!e())
    {
      Dialog localDialog = new Dialog(this.h, 2131296273);
      Object localObject1 = this.i.getLayoutInflater().inflate(2130903149, null);
      localDialog.setContentView((View)localObject1);
      Object localObject2 = (Button)((View)localObject1).findViewById(2131362349);
      Button localButton = (Button)((View)localObject1).findViewById(2131362348);
      ((TextView)((View)localObject1).findViewById(2131362347)).setTypeface(Typeface.MONOSPACE, 2);
      ((View)localObject1).findViewById(2131361852);
      ((Button)localObject2).setOnClickListener(new e(this, localDialog));
      localButton.setOnClickListener(new f(this, localDialog));
      localDialog.show();
      localObject1 = this.i.getWindowManager().getDefaultDisplay();
      localObject2 = localDialog.getWindow().getAttributes();
      ((WindowManager.LayoutParams)localObject2).width = ((Display)localObject1).getWidth();
      localDialog.getWindow().setAttributes((WindowManager.LayoutParams)localObject2);
      return;
    }
    SpeechUtility.getUtility(this.h).setAppid(this.i.getString(2131230797));
  }
  
  public final boolean h()
  {
    return this.d;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\g\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */