package com.umeng.socialize.common;

import android.content.Context;
import android.content.res.Resources;
import java.util.Map;

public abstract class b
{
  private Map<String, b.b> a;
  private Context b;
  
  public b(Context paramContext, Map<String, b.b> paramMap)
  {
    this.a = paramMap;
    this.b = paramContext;
  }
  
  public static int a(Context paramContext, b.a parama, String paramString)
  {
    Resources localResources = paramContext.getResources();
    paramContext = paramContext.getPackageName();
    int i = localResources.getIdentifier(paramString, parama.toString(), paramContext);
    if (i <= 0) {
      throw new RuntimeException("获取资源ID失败:(packageName=" + paramContext + " type=" + parama + " name=" + paramString);
    }
    return i;
  }
  
  /* Error */
  public Map<String, b.b> a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 16	com/umeng/socialize/common/b:a	Ljava/util/Map;
    //   6: ifnonnull +12 -> 18
    //   9: aload_0
    //   10: getfield 16	com/umeng/socialize/common/b:a	Ljava/util/Map;
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: aload_0
    //   19: getfield 16	com/umeng/socialize/common/b:a	Ljava/util/Map;
    //   22: invokeinterface 72 1 0
    //   27: invokeinterface 78 1 0
    //   32: astore_1
    //   33: aload_1
    //   34: invokeinterface 84 1 0
    //   39: ifne +11 -> 50
    //   42: aload_0
    //   43: getfield 16	com/umeng/socialize/common/b:a	Ljava/util/Map;
    //   46: astore_1
    //   47: goto -33 -> 14
    //   50: aload_1
    //   51: invokeinterface 88 1 0
    //   56: checkcast 90	java/lang/String
    //   59: astore_2
    //   60: aload_0
    //   61: getfield 16	com/umeng/socialize/common/b:a	Ljava/util/Map;
    //   64: aload_2
    //   65: invokeinterface 94 2 0
    //   70: checkcast 96	com/umeng/socialize/common/b$b
    //   73: astore_2
    //   74: aload_2
    //   75: aload_0
    //   76: getfield 18	com/umeng/socialize/common/b:b	Landroid/content/Context;
    //   79: aload_2
    //   80: getfield 99	com/umeng/socialize/common/b$b:a	Lcom/umeng/socialize/common/b$a;
    //   83: aload_2
    //   84: getfield 102	com/umeng/socialize/common/b$b:b	Ljava/lang/String;
    //   87: invokestatic 104	com/umeng/socialize/common/b:a	(Landroid/content/Context;Lcom/umeng/socialize/common/b$a;Ljava/lang/String;)I
    //   90: putfield 108	com/umeng/socialize/common/b$b:d	I
    //   93: aload_2
    //   94: iconst_1
    //   95: putfield 112	com/umeng/socialize/common/b$b:c	Z
    //   98: goto -65 -> 33
    //   101: astore_1
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	b
    //   13	38	1	localObject1	Object
    //   101	4	1	localObject2	Object
    //   59	35	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	101	finally
    //   18	33	101	finally
    //   33	47	101	finally
    //   50	98	101	finally
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\common\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */