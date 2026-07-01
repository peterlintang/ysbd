package com.taobao.munion.utils;

import java.util.HashMap;

public abstract class e
{
  protected HashMap<String, Object[]> a = new HashMap();
  
  private Object d(String paramString)
  {
    paramString = (Object[])this.a.get(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString[0];
  }
  
  private void e(String paramString)
  {
    paramString = (Object[])this.a.get(paramString);
    if (paramString == null) {
      return;
    }
    paramString[1] = Integer.valueOf(((Integer)paramString[1]).intValue() + 1);
  }
  
  protected int a(String paramString)
  {
    paramString = (Object[])this.a.get(paramString);
    if (paramString == null) {
      return -1;
    }
    int i = ((Integer)paramString[1]).intValue();
    if (i == 0) {
      return 0;
    }
    paramString[1] = Integer.valueOf(i - 1);
    return i - 1;
  }
  
  protected abstract Object a(String paramString, Object paramObject);
  
  /* Error */
  public Object b(String paramString, Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 42	com/taobao/munion/utils/e:d	(Ljava/lang/String;)Ljava/lang/Object;
    //   7: astore_3
    //   8: aload_3
    //   9: ifnull +14 -> 23
    //   12: aload_0
    //   13: aload_1
    //   14: invokespecial 44	com/taobao/munion/utils/e:e	(Ljava/lang/String;)V
    //   17: aload_3
    //   18: astore_2
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_2
    //   22: areturn
    //   23: aload_0
    //   24: aload_1
    //   25: aload_2
    //   26: invokevirtual 46	com/taobao/munion/utils/e:a	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   29: astore_3
    //   30: aload_3
    //   31: astore_2
    //   32: aload_3
    //   33: ifnull -14 -> 19
    //   36: aload_0
    //   37: getfield 16	com/taobao/munion/utils/e:a	Ljava/util/HashMap;
    //   40: aload_1
    //   41: iconst_2
    //   42: anewarray 4	java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: aload_3
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: iconst_1
    //   52: invokestatic 37	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   55: aastore
    //   56: invokevirtual 50	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   59: pop
    //   60: aload_3
    //   61: astore_2
    //   62: goto -43 -> 19
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	e
    //   0	70	1	paramString	String
    //   0	70	2	paramObject	Object
    //   7	54	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	8	65	finally
    //   12	17	65	finally
    //   23	30	65	finally
    //   36	60	65	finally
  }
  
  public void b()
  {
    try
    {
      this.a.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual 56	com/taobao/munion/utils/e:a	(Ljava/lang/String;)I
    //   7: ifne +18 -> 25
    //   10: aload_0
    //   11: getfield 16	com/taobao/munion/utils/e:a	Ljava/util/HashMap;
    //   14: aload_1
    //   15: invokevirtual 59	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   18: pop
    //   19: iconst_1
    //   20: istore_2
    //   21: aload_0
    //   22: monitorexit
    //   23: iload_2
    //   24: ireturn
    //   25: iconst_0
    //   26: istore_2
    //   27: goto -6 -> 21
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	e
    //   0	35	1	paramString	String
    //   20	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	19	30	finally
  }
  
  public Object c(String paramString)
  {
    try
    {
      paramString = d(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */