package com.ireadercity.b2.f;

import android.content.Context;
import android.widget.Toast;
import com.ireadercity.b2.a;
import com.ireadercity.b2.b.q;
import com.ireadercity.b2.b.t;

public final class b
{
  private static String a = "ScoreManage";
  
  public static int a()
  {
    try
    {
      i = Integer.parseInt(t.b(q.a(a.u)));
      j = i;
      if (i <= 999) {}
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        try
        {
          b(999);
          int j = 999;
          String str = a;
          new StringBuilder("getSavedAvaiableScore avaiableScore=").append(j).toString();
          return j;
        }
        catch (Exception localException2)
        {
          int i;
          localException2.printStackTrace();
        }
        localException1 = localException1;
        localException1.printStackTrace();
        i = 0;
      }
    }
    return 0;
  }
  
  public static void a(int paramInt)
  {
    b(a() + paramInt);
  }
  
  public static boolean a(Context paramContext, int paramInt)
  {
    int i = a();
    if (i >= paramInt)
    {
      i -= paramInt;
      b(i);
      Toast.makeText(paramContext, "本次下载消耗积分:" + paramInt + " 还剩：" + i, 1).show();
      return true;
    }
    Toast.makeText(paramContext, "积分不够，请先获取积分", 1).show();
    return false;
  }
  
  private static void b(int paramInt)
  {
    String str = a;
    new StringBuilder("saveAvaiableScore=").append(paramInt).toString();
    try
    {
      q.a(a.u, t.a(paramInt));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\f\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */