package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.List;

public final class g
{
  private static final int a = 17;
  
  public static String a(List<i> paramList)
  {
    String str1 = "";
    String str2;
    if ((paramList == null) || (paramList.size() <= 0)) {
      str2 = "";
    }
    int i;
    do
    {
      return str2;
      i = 0;
      str2 = str1;
    } while (i >= paramList.size());
    if ((paramList.get(i) != null) && (((i)paramList.get(i)).a.length() == a))
    {
      str1 = str1 + "<mac ";
      str1 = str1 + "macDbm=\"" + ((i)paramList.get(i)).b + "\"";
      str1 = str1 + ">";
      str1 = str1 + ((i)paramList.get(i)).a;
      str1 = str1 + "</mac>";
    }
    for (;;)
    {
      i += 1;
      break;
    }
  }
  
  public static List<h> a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 5)
    {
      new l();
      return l.a(paramContext);
    }
    new j();
    return j.a(paramContext);
  }
  
  public static String b(List<h> paramList)
  {
    Object localObject;
    if ((paramList == null) || (paramList.size() <= 0))
    {
      localObject = "";
      return (String)localObject;
    }
    String str = "";
    int i = 0;
    for (;;)
    {
      localObject = str;
      if (i >= paramList.size()) {
        break;
      }
      str = str + "<cell ";
      str = str + "mcc=\"" + ((h)paramList.get(i)).a + "\" ";
      str = str + "mnc=\"" + ((h)paramList.get(i)).b + "\" ";
      str = str + "lac=\"" + ((h)paramList.get(i)).c + "\" ";
      str = str + "type=\"" + ((h)paramList.get(i)).e + "\" ";
      str = str + "stationId=\"" + ((h)paramList.get(i)).f + "\" ";
      str = str + "networkId=\"" + ((h)paramList.get(i)).g + "\" ";
      str = str + "systemId=\"" + ((h)paramList.get(i)).h + "\" ";
      str = str + "dbm=\"" + ((h)paramList.get(i)).i + "\" ";
      str = str + " >";
      str = str + ((h)paramList.get(i)).d;
      str = str + "</cell>";
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */