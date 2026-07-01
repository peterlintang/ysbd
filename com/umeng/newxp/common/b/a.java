package com.umeng.newxp.common.b;

import android.content.Context;
import android.content.Intent;
import com.umeng.newxp.common.c.f;
import com.umeng.newxp.common.c.g;
import com.umeng.newxp.common.c.h;
import com.umeng.newxp.common.c.i;
import com.umeng.newxp.common.c.j;
import com.umeng.newxp.common.persistence.c;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class a
{
  private static final String a = "d6fc3a4a06adbde89223bvefedc24fecde188aaa9161";
  private static final Object d = new Object();
  private static a e = null;
  private static final String j = ".DataStorage";
  private static final String k = "ContextData";
  private c b = null;
  private Context c = null;
  private String f = null;
  private b g = null;
  private String h = "xx_utdid_key";
  private String i = "xx_utdid_domain";
  private boolean l = false;
  
  public a(Context paramContext)
  {
    this.c = paramContext;
    this.b = new c(paramContext, ".DataStorage", "ContextData", false, true);
    this.g = new b();
    this.h = String.format("K_%d", new Object[] { Integer.valueOf(i.b(this.h)) });
    this.i = String.format("D_%d", new Object[] { Integer.valueOf(i.b(this.i)) });
  }
  
  public static a a(Context paramContext)
  {
    if ((paramContext != null) && (e == null)) {}
    synchronized (d)
    {
      if (e == null) {
        e = new a(paramContext);
      }
      return e;
    }
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    Mac localMac = Mac.getInstance("HmacSHA1");
    localMac.init(new SecretKeySpec("d6fc3a4a06adbde89223bvefedc24fecde188aaa9161".getBytes(), localMac.getAlgorithm()));
    return com.umeng.newxp.common.a.a.d.f(localMac.doFinal(paramArrayOfByte));
  }
  
  private void a(String paramString)
  {
    try
    {
      if (j.b() >= 11)
      {
        Object localObject2 = this.c.getSystemService("clipboard");
        if (localObject2 != null) {
          try
          {
            Class localClass = Class.forName("android.content.ClipData");
            if (localClass != null)
            {
              Intent localIntent = new Intent();
              localIntent.putExtra(this.h, paramString);
              paramString = h.a(localClass, "newIntent", new Object[] { this.i, localIntent }, new Class[] { CharSequence.class, Intent.class });
              if (paramString != null)
              {
                localClass = paramString.getClass();
                h.b(localObject2, "setPrimaryClip", new Object[] { paramString }, new Class[] { localClass });
                return;
              }
            }
          }
          catch (ClassNotFoundException localClassNotFoundException)
          {
            for (;;)
            {
              localClassNotFoundException.printStackTrace();
              Object localObject1 = null;
            }
          }
        }
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  private void b()
  {
    String str1 = c();
    String str2 = this.b.b(this.h);
    if ((!i.a(str1)) && (i.a(str2))) {
      b(str1);
    }
    if ((i.a(str1)) && (!i.a(str2))) {
      a(str2);
    }
  }
  
  private void b(String paramString)
  {
    this.b.a(this.h, paramString);
    this.b.a("v", "1");
    this.b.c();
  }
  
  private String c()
  {
    try
    {
      if (j.b() >= 11)
      {
        Object localObject1 = this.c.getSystemService("clipboard");
        if (localObject1 != null)
        {
          localObject1 = h.b(localObject1, "getPrimaryClip");
          if (localObject1 != null)
          {
            int m = g.a(h.b(localObject1, "getItemCount"));
            if (m > 0)
            {
              Object localObject2 = Integer.TYPE;
              localObject1 = h.b(localObject1, "getItemAt", new Object[] { Integer.valueOf(m - 1) }, new Class[] { localObject2 });
              if (localObject1 != null)
              {
                localObject1 = h.b(localObject1, "getIntent");
                if ((localObject1 instanceof Intent))
                {
                  localObject1 = (Intent)localObject1;
                  if (localObject1 != null)
                  {
                    localObject1 = ((Intent)localObject1).getStringExtra(this.h);
                    if (!i.a((String)localObject1))
                    {
                      localObject2 = this.g.a((String)localObject1);
                      if (localObject2 != null) {
                        return (String)localObject1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    catch (Exception localException) {}
    return null;
  }
  
  private void c(String paramString)
  {
    a(paramString);
    b(paramString);
  }
  
  private final byte[] d()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int m = (int)(System.currentTimeMillis() / 1000L);
    int n = new Random().nextInt();
    Object localObject = com.umeng.newxp.common.c.d.a(m);
    byte[] arrayOfByte = com.umeng.newxp.common.c.d.a(n);
    localByteArrayOutputStream.write((byte[])localObject, 0, 4);
    localByteArrayOutputStream.write(arrayOfByte, 0, 4);
    localByteArrayOutputStream.write(3);
    localByteArrayOutputStream.write(0);
    try
    {
      localObject = f.a(this.c);
      localByteArrayOutputStream.write(com.umeng.newxp.common.c.d.a(i.b((String)localObject)), 0, 4);
      localByteArrayOutputStream.write(com.umeng.newxp.common.c.d.a(i.b(a(localByteArrayOutputStream.toByteArray()))));
      return localByteArrayOutputStream.toByteArray();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = new Random().nextInt();
      }
    }
  }
  
  /* Error */
  public String a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 46	com/umeng/newxp/common/b/a:f	Ljava/lang/String;
    //   6: ifnull +12 -> 18
    //   9: aload_0
    //   10: getfield 46	com/umeng/newxp/common/b/a:f	Ljava/lang/String;
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: invokestatic 283	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   21: ifnonnull +6 -> 27
    //   24: invokestatic 286	android/os/Looper:prepare	()V
    //   27: aload_0
    //   28: getfield 42	com/umeng/newxp/common/b/a:b	Lcom/umeng/newxp/common/persistence/c;
    //   31: aload_0
    //   32: getfield 52	com/umeng/newxp/common/b/a:h	Ljava/lang/String;
    //   35: invokevirtual 183	com/umeng/newxp/common/persistence/c:b	(Ljava/lang/String;)Ljava/lang/String;
    //   38: astore_2
    //   39: aload_2
    //   40: invokestatic 186	com/umeng/newxp/common/c/i:a	(Ljava/lang/String;)Z
    //   43: ifne +10 -> 53
    //   46: aload_0
    //   47: getfield 58	com/umeng/newxp/common/b/a:l	Z
    //   50: ifne +12 -> 62
    //   53: aload_0
    //   54: invokespecial 288	com/umeng/newxp/common/b/a:b	()V
    //   57: aload_0
    //   58: iconst_1
    //   59: putfield 58	com/umeng/newxp/common/b/a:l	Z
    //   62: aload_2
    //   63: astore_1
    //   64: aload_2
    //   65: invokestatic 186	com/umeng/newxp/common/c/i:a	(Ljava/lang/String;)Z
    //   68: ifeq +15 -> 83
    //   71: aload_0
    //   72: getfield 42	com/umeng/newxp/common/b/a:b	Lcom/umeng/newxp/common/persistence/c;
    //   75: aload_0
    //   76: getfield 52	com/umeng/newxp/common/b/a:h	Ljava/lang/String;
    //   79: invokevirtual 183	com/umeng/newxp/common/persistence/c:b	(Ljava/lang/String;)Ljava/lang/String;
    //   82: astore_1
    //   83: aload_1
    //   84: invokestatic 186	com/umeng/newxp/common/c/i:a	(Ljava/lang/String;)Z
    //   87: ifne +23 -> 110
    //   90: aload_0
    //   91: aload_0
    //   92: getfield 48	com/umeng/newxp/common/b/a:g	Lcom/umeng/newxp/common/b/b;
    //   95: aload_1
    //   96: invokevirtual 225	com/umeng/newxp/common/b/b:a	(Ljava/lang/String;)Ljava/lang/String;
    //   99: putfield 46	com/umeng/newxp/common/b/a:f	Ljava/lang/String;
    //   102: aload_0
    //   103: getfield 46	com/umeng/newxp/common/b/a:f	Ljava/lang/String;
    //   106: astore_1
    //   107: goto -93 -> 14
    //   110: aload_0
    //   111: invokespecial 290	com/umeng/newxp/common/b/a:d	()[B
    //   114: astore_1
    //   115: aload_1
    //   116: ifnull +49 -> 165
    //   119: aload_0
    //   120: getfield 48	com/umeng/newxp/common/b/a:g	Lcom/umeng/newxp/common/b/b;
    //   123: aload_1
    //   124: invokevirtual 291	com/umeng/newxp/common/b/b:a	([B)Ljava/lang/String;
    //   127: astore_2
    //   128: aload_2
    //   129: ifnull +24 -> 153
    //   132: aload_0
    //   133: aload_2
    //   134: invokespecial 293	com/umeng/newxp/common/b/a:c	(Ljava/lang/String;)V
    //   137: aload_0
    //   138: aload_1
    //   139: invokestatic 124	com/umeng/newxp/common/a/a/d:f	([B)Ljava/lang/String;
    //   142: putfield 46	com/umeng/newxp/common/b/a:f	Ljava/lang/String;
    //   145: aload_0
    //   146: getfield 46	com/umeng/newxp/common/b/a:f	Ljava/lang/String;
    //   149: astore_1
    //   150: goto -136 -> 14
    //   153: invokestatic 295	com/umeng/newxp/common/b/b:a	()Ljava/lang/String;
    //   156: astore_1
    //   157: goto -143 -> 14
    //   160: astore_1
    //   161: aload_1
    //   162: invokevirtual 296	java/lang/Exception:printStackTrace	()V
    //   165: aconst_null
    //   166: astore_1
    //   167: goto -153 -> 14
    //   170: astore_1
    //   171: aload_0
    //   172: monitorexit
    //   173: aload_1
    //   174: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	a
    //   13	144	1	localObject1	Object
    //   160	2	1	localException	Exception
    //   166	1	1	localObject2	Object
    //   170	4	1	localObject3	Object
    //   38	96	2	str	String
    // Exception table:
    //   from	to	target	type
    //   110	115	160	java/lang/Exception
    //   119	128	160	java/lang/Exception
    //   132	150	160	java/lang/Exception
    //   153	157	160	java/lang/Exception
    //   2	14	170	finally
    //   18	27	170	finally
    //   27	53	170	finally
    //   53	62	170	finally
    //   64	83	170	finally
    //   83	107	170	finally
    //   110	115	170	finally
    //   119	128	170	finally
    //   132	150	170	finally
    //   153	157	170	finally
    //   161	165	170	finally
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */