package com.umeng.common.net;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;

public class a
{
  private static final String b = a.class.getName();
  final Messenger a = new Messenger(new a.b(this));
  private Context c;
  private e d;
  private Messenger e;
  private String f;
  private String g;
  private String h;
  private String[] i;
  private ServiceConnection j = new b(this);
  
  public a(Context paramContext, String paramString1, String paramString2, String paramString3, e parame)
  {
    this.c = paramContext.getApplicationContext();
    this.f = paramString1;
    this.g = paramString2;
    this.h = paramString3;
    this.d = parame;
  }
  
  public void a()
  {
    Intent localIntent = new Intent(this.c, DownloadingService.class);
    if (this.i != null) {
      localIntent.putExtra("reporturls", this.i);
    }
    this.c.bindService(localIntent, this.j, 1);
  }
  
  public void a(String[] paramArrayOfString)
  {
    this.i = paramArrayOfString;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */