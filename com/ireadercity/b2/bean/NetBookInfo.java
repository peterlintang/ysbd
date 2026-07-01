package com.ireadercity.b2.bean;

import com.ireadercity.b2.h.y;
import java.io.Serializable;
import org.json.JSONObject;

public class NetBookInfo
  implements Serializable
{
  public static int a = 5;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private int g;
  private boolean h;
  private String i;
  private boolean j;
  private String k;
  private String l;
  private String m;
  private String n;
  private long o;
  private float p;
  
  private String n()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("bookID", this.b);
      localJSONObject.put("bookTitle", this.c);
      try
      {
        localJSONObject.put("bookDesc", this.d);
        localJSONObject.put("bookAuthor", this.e);
        localJSONObject.put("booklanguage", this.f);
        localJSONObject.put("bookScore", this.g);
        localJSONObject.put("bookCoverURL", this.i);
        localJSONObject.put("bookURL", this.k);
        localJSONObject.put("bookUploadedUserName", this.m);
        localJSONObject.put("bookFormat", this.n);
        localJSONObject.put("bookSize", this.o);
        localJSONObject.put("bookAverageRating", this.p);
        localJSONObject.toString();
        return localJSONObject.toString();
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localException2.printStackTrace();
        }
      }
      return null;
    }
    catch (Exception localException1)
    {
      localException1.printStackTrace();
    }
  }
  
  public final long a()
  {
    return this.o;
  }
  
  public final void a(float paramFloat)
  {
    this.p = paramFloat;
  }
  
  public final void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  public final void a(long paramLong)
  {
    this.o = paramLong;
  }
  
  public final void a(String paramString)
  {
    this.b = paramString;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public final void b(String paramString)
  {
    this.c = paramString;
  }
  
  public final boolean b()
  {
    return this.j;
  }
  
  public final void c()
  {
    this.j = true;
  }
  
  public final void c(String paramString)
  {
    this.d = paramString;
  }
  
  public final String d()
  {
    return this.b;
  }
  
  public final void d(String paramString)
  {
    this.e = paramString;
  }
  
  public final String e()
  {
    return this.c;
  }
  
  public final void e(String paramString)
  {
    this.f = paramString;
  }
  
  public final String f()
  {
    return this.d;
  }
  
  public final void f(String paramString)
  {
    this.i = paramString;
  }
  
  public final String g()
  {
    return this.e;
  }
  
  public final void g(String paramString)
  {
    this.k = paramString;
  }
  
  public final String h()
  {
    return this.i;
  }
  
  public final void h(String paramString)
  {
    this.l = paramString;
  }
  
  public final String i()
  {
    return this.k;
  }
  
  public final void i(String paramString)
  {
    this.m = paramString;
  }
  
  public final String j()
  {
    return this.m;
  }
  
  public final void j(String paramString)
  {
    this.n = paramString;
  }
  
  public final float k()
  {
    return this.p;
  }
  
  /* Error */
  public final void k(String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 127	com/ireadercity/b2/h/y:j	(Ljava/lang/String;)Ljava/lang/String;
    //   4: invokestatic 129	com/ireadercity/b2/h/y:h	(Ljava/lang/String;)Ljava/lang/String;
    //   7: astore_1
    //   8: aload_1
    //   9: invokestatic 132	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   12: ifeq +4 -> 16
    //   15: return
    //   16: new 40	org/json/JSONObject
    //   19: dup
    //   20: aload_1
    //   21: invokespecial 134	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   24: astore_1
    //   25: aload_0
    //   26: aload_1
    //   27: ldc 43
    //   29: invokevirtual 137	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   32: putfield 45	com/ireadercity/b2/bean/NetBookInfo:b	Ljava/lang/String;
    //   35: aload_0
    //   36: aload_1
    //   37: ldc 51
    //   39: invokevirtual 137	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   42: putfield 53	com/ireadercity/b2/bean/NetBookInfo:c	Ljava/lang/String;
    //   45: aload_0
    //   46: aload_1
    //   47: ldc 55
    //   49: invokevirtual 137	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   52: putfield 57	com/ireadercity/b2/bean/NetBookInfo:d	Ljava/lang/String;
    //   55: aload_0
    //   56: aload_1
    //   57: ldc 59
    //   59: invokevirtual 137	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   62: putfield 61	com/ireadercity/b2/bean/NetBookInfo:e	Ljava/lang/String;
    //   65: aload_0
    //   66: aload_1
    //   67: ldc 63
    //   69: invokevirtual 137	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   72: putfield 65	com/ireadercity/b2/bean/NetBookInfo:f	Ljava/lang/String;
    //   75: aload_0
    //   76: aload_1
    //   77: ldc 67
    //   79: invokevirtual 141	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   82: putfield 69	com/ireadercity/b2/bean/NetBookInfo:g	I
    //   85: aload_0
    //   86: aload_1
    //   87: ldc 74
    //   89: invokevirtual 137	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   92: putfield 76	com/ireadercity/b2/bean/NetBookInfo:i	Ljava/lang/String;
    //   95: aload_0
    //   96: aload_1
    //   97: ldc 78
    //   99: invokevirtual 137	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   102: putfield 80	com/ireadercity/b2/bean/NetBookInfo:k	Ljava/lang/String;
    //   105: aload_0
    //   106: aload_1
    //   107: ldc 82
    //   109: invokevirtual 137	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   112: putfield 84	com/ireadercity/b2/bean/NetBookInfo:m	Ljava/lang/String;
    //   115: aload_0
    //   116: aload_1
    //   117: ldc 86
    //   119: invokevirtual 137	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   122: putfield 88	com/ireadercity/b2/bean/NetBookInfo:n	Ljava/lang/String;
    //   125: aload_0
    //   126: aload_1
    //   127: ldc 90
    //   129: invokevirtual 145	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   132: putfield 92	com/ireadercity/b2/bean/NetBookInfo:o	J
    //   135: aload_0
    //   136: aload_1
    //   137: ldc 97
    //   139: invokevirtual 137	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   142: invokestatic 151	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   145: putfield 99	com/ireadercity/b2/bean/NetBookInfo:p	F
    //   148: return
    //   149: astore_1
    //   150: aload_1
    //   151: invokevirtual 108	java/lang/Exception:printStackTrace	()V
    //   154: return
    //   155: astore_2
    //   156: aload_2
    //   157: invokevirtual 108	java/lang/Exception:printStackTrace	()V
    //   160: goto -105 -> 55
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	this	NetBookInfo
    //   0	163	1	paramString	String
    //   155	2	2	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   8	15	149	java/lang/Exception
    //   16	45	149	java/lang/Exception
    //   55	148	149	java/lang/Exception
    //   156	160	149	java/lang/Exception
    //   45	55	155	java/lang/Exception
  }
  
  public final void l()
  {
    y.b(n(), y.j(this.k));
  }
  
  public final int m()
  {
    if (this.o < 2097152L) {
      return a;
    }
    return (int)(this.o / 2097152L) + a;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\bean\NetBookInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */