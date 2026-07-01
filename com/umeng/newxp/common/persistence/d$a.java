package com.umeng.newxp.common.persistence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

final class d$a
  implements b
{
  private static final Object f = new Object();
  private final File a;
  private final File b;
  private final int c;
  private Map d;
  private boolean e = false;
  private WeakHashMap<b.b, Object> g;
  
  d$a(File paramFile, int paramInt, Map paramMap)
  {
    this.a = paramFile;
    this.b = d.a(paramFile);
    this.c = paramInt;
    if (paramMap != null) {}
    for (;;)
    {
      this.d = paramMap;
      this.g = new WeakHashMap();
      return;
      paramMap = new HashMap();
    }
  }
  
  private FileOutputStream a(File paramFile)
  {
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
      return localFileOutputStream;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      if (!paramFile.getParentFile().mkdir()) {
        return null;
      }
      try
      {
        paramFile = new FileOutputStream(paramFile);
        return paramFile;
      }
      catch (FileNotFoundException paramFile) {}
    }
    return null;
  }
  
  private boolean e()
  {
    if (this.a.exists()) {
      if (!this.b.exists()) {
        if (this.a.renameTo(this.b)) {
          break label44;
        }
      }
    }
    for (;;)
    {
      return false;
      this.a.delete();
      try
      {
        label44:
        FileOutputStream localFileOutputStream = a(this.a);
        if (localFileOutputStream == null) {
          continue;
        }
        e.a(this.d, localFileOutputStream);
        localFileOutputStream.close();
        this.b.delete();
        return true;
      }
      catch (IOException localIOException)
      {
        if (!this.a.exists()) {
          continue;
        }
        this.a.delete();
        return false;
      }
      catch (XmlPullParserException localXmlPullParserException)
      {
        for (;;) {}
      }
    }
  }
  
  public final float a(String paramString, float paramFloat)
  {
    try
    {
      paramString = (Float)this.d.get(paramString);
      if (paramString != null) {
        paramFloat = paramString.floatValue();
      }
      return paramFloat;
    }
    finally {}
  }
  
  public final int a(String paramString, int paramInt)
  {
    try
    {
      paramString = (Integer)this.d.get(paramString);
      if (paramString != null) {
        paramInt = paramString.intValue();
      }
      return paramInt;
    }
    finally {}
  }
  
  public final long a(String paramString, long paramLong)
  {
    try
    {
      paramString = (Long)this.d.get(paramString);
      if (paramString != null) {
        paramLong = paramString.longValue();
      }
      return paramLong;
    }
    finally {}
  }
  
  /* Error */
  public final String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/umeng/newxp/common/persistence/d$a:d	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 106 2 0
    //   12: checkcast 129	java/lang/String
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull +7 -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: areturn
    //   24: aload_2
    //   25: astore_1
    //   26: goto -6 -> 20
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	a
    //   0	34	1	paramString1	String
    //   0	34	2	paramString2	String
    // Exception table:
    //   from	to	target	type
    //   2	16	29	finally
    //   20	22	29	finally
  }
  
  public final void a(b.b paramb)
  {
    try
    {
      this.g.put(paramb, f);
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public final void a(Map paramMap)
  {
    if (paramMap != null) {}
    try
    {
      this.d = paramMap;
      return;
    }
    finally
    {
      paramMap = finally;
      throw paramMap;
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      this.e = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean a()
  {
    return (this.a != null) && (new File(this.a.getAbsolutePath()).exists());
  }
  
  public final boolean a(String paramString)
  {
    try
    {
      boolean bool = this.d.containsKey(paramString);
      return bool;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final boolean a(String paramString, boolean paramBoolean)
  {
    try
    {
      paramString = (Boolean)this.d.get(paramString);
      if (paramString != null) {
        paramBoolean = paramString.booleanValue();
      }
      return paramBoolean;
    }
    finally {}
  }
  
  public final Map<String, ?> b()
  {
    try
    {
      HashMap localHashMap = new HashMap(this.d);
      return localHashMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void b(b.b paramb)
  {
    try
    {
      this.g.remove(paramb);
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public final b.a c()
  {
    return new d.a.a(this);
  }
  
  public final boolean d()
  {
    try
    {
      boolean bool = this.e;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\persistence\d$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */