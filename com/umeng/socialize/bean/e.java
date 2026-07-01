package com.umeng.socialize.bean;

import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;
import com.umeng.socialize.exception.SocializeException;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class e
{
  public static final int CALLBACK_LISTENER_FLAG_SDK = 1;
  public static final int CALLBACK_LISTENER_FLAG_SINGEL = 16;
  private static final int a = 10;
  private static final int b = 0;
  private static final int c = 15;
  private static final int d = 240;
  private static final int e = 256;
  private static final int f = 512;
  private static final int g = 768;
  private static final int h = 1024;
  private static final int i = 3840;
  private static final Map<e.a, Integer[]> j = Collections.synchronizedMap(new WeakHashMap());
  private static final Map<e.a, Integer[]> k = Collections.synchronizedMap(new HashMap());
  
  private int a(e.a parama)
  {
    int m = 0;
    try
    {
      if (j.containsKey(parama)) {
        m = 1;
      }
      boolean bool = k.containsKey(parama);
      int n = m;
      if (bool) {
        n = m + 2;
      }
      return n;
    }
    finally {}
  }
  
  private boolean a(int paramInt)
  {
    if ((paramInt & 0xF0) == 16) {}
    try
    {
      Iterator localIterator = j.keySet().iterator();
      label49:
      boolean bool;
      if (!localIterator.hasNext())
      {
        localIterator = k.keySet().iterator();
        bool = localIterator.hasNext();
        if (bool) {
          break label128;
        }
        bool = false;
      }
      for (;;)
      {
        return bool;
        e.a locala = (e.a)localIterator.next();
        Integer[] arrayOfInteger = (Integer[])j.get(locala);
        if (arrayOfInteger == null) {
          break;
        }
        bool = a(paramInt, arrayOfInteger[0].intValue());
        if (bool)
        {
          j.remove(locala);
          break label195;
          label128:
          locala = (e.a)localIterator.next();
          arrayOfInteger = (Integer[])k.get(locala);
          if (arrayOfInteger == null) {
            break label49;
          }
          bool = a(paramInt, arrayOfInteger[0].intValue());
          if (bool) {
            k.remove(locala);
          }
        }
      }
    }
    finally {}
  }
  
  private boolean a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & 0xF) == (paramInt2 & 0xF)) {}
    for (int m = 1; (m != 0) && ((paramInt2 & 0xF0) == 16) && ((paramInt2 & 0xF00) == (paramInt1 & 0xF00)); m = 0) {
      return true;
    }
    return false;
  }
  
  private boolean a(e.a parama, int paramInt)
  {
    if ((parama instanceof SocializeListeners.SnsPostListener)) {
      parama = SocializeListeners.SnsPostListener.class;
    }
    while (9 < getListener(parama).length)
    {
      return true;
      if ((parama instanceof SocializeListeners.SocializeClientListener)) {
        parama = SocializeListeners.SocializeClientListener.class;
      } else if ((parama instanceof SocializeListeners.MulStatusListener)) {
        parama = SocializeListeners.MulStatusListener.class;
      } else if ((parama instanceof SocializeListeners.OauthCallbackListener)) {
        parama = SocializeListeners.OauthCallbackListener.class;
      } else {
        throw new SocializeException("unknow listener`s class.");
      }
    }
    return false;
  }
  
  private boolean a(e.a parama, boolean paramBoolean, int paramInt)
  {
    boolean bool = false;
    if (paramBoolean) {}
    Map localMap;
    int m;
    for (;;)
    {
      try
      {
        localMap = j;
        m = b(parama) | paramInt;
        if (!a(parama, paramInt)) {
          break;
        }
        throw new SocializeException("该类型监听器已经超过最大使用量,请注销不使用的监听器再试。");
      }
      finally {}
      localMap = k;
    }
    a(m);
    Integer[] arrayOfInteger = new Integer[2];
    arrayOfInteger[0] = Integer.valueOf(m);
    if (a(parama) > 0) {}
    for (paramBoolean = bool;; paramBoolean = true)
    {
      localMap.put(parama, arrayOfInteger);
      return paramBoolean;
    }
  }
  
  private boolean a(Class<?> paramClass1, Class<?> paramClass2)
  {
    paramClass1 = paramClass1.getInterfaces();
    int n;
    int m;
    if (paramClass1 != null)
    {
      n = paramClass1.length;
      m = 0;
    }
    for (;;)
    {
      if (m >= n) {
        return false;
      }
      if (paramClass1[m] == paramClass2) {
        return true;
      }
      m += 1;
    }
  }
  
  private int b(e.a parama)
  {
    if ((parama instanceof SocializeListeners.SnsPostListener)) {
      return 512;
    }
    if ((parama instanceof SocializeListeners.SocializeClientListener)) {
      return 768;
    }
    if ((parama instanceof SocializeListeners.MulStatusListener)) {
      return 256;
    }
    if ((parama instanceof SocializeListeners.OauthCallbackListener)) {
      return 1024;
    }
    throw new SocializeException("unknow params");
  }
  
  public boolean cleanListeners()
  {
    try
    {
      j.clear();
      k.clear();
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public <T> T[] getListener(Class<T> paramClass)
  {
    HashSet localHashSet = new HashSet();
    if (!a(paramClass, e.a.class)) {
      throw new SocializeException("The param is not implements ICallbackLister.");
    }
    for (;;)
    {
      try
      {
        localIterator = j.keySet().iterator();
        if (localIterator.hasNext()) {
          continue;
        }
        localIterator = k.keySet().iterator();
        boolean bool = localIterator.hasNext();
        if (bool) {
          continue;
        }
      }
      catch (Exception localException)
      {
        Iterator localIterator;
        e.a locala;
        continue;
      }
      return localHashSet.toArray((Object[])Array.newInstance(paramClass, localHashSet.size()));
      locala = (e.a)localIterator.next();
      if (paramClass.isInstance(locala))
      {
        localHashSet.add(locala);
        continue;
        locala = (e.a)localIterator.next();
        if (paramClass.isInstance(locala)) {
          localHashSet.add(locala);
        }
      }
    }
  }
  
  public boolean registerListener(e.a parama)
  {
    try
    {
      boolean bool = a(parama, false, 0);
      return bool;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public boolean registerListener(e.a parama, int paramInt)
  {
    try
    {
      boolean bool = a(parama, false, paramInt);
      return bool;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public boolean registerWeakRefListener(e.a parama)
  {
    try
    {
      boolean bool = a(parama, true, 0);
      return bool;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public boolean registerWeakRefListener(e.a parama, int paramInt)
  {
    try
    {
      boolean bool = a(parama, true, paramInt);
      return bool;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public void unregisterLisreners(e.a... paramVarArgs)
  {
    int n;
    int m;
    if (paramVarArgs != null)
    {
      n = paramVarArgs.length;
      m = 0;
    }
    for (;;)
    {
      if (m >= n) {
        return;
      }
      unregisterListener(paramVarArgs[m]);
      m += 1;
    }
  }
  
  public boolean unregisterListener(e.a parama)
  {
    Integer[] arrayOfInteger1 = null;
    try
    {
      if (k.containsKey(parama)) {
        arrayOfInteger1 = (Integer[])k.remove(parama);
      }
      Integer[] arrayOfInteger2 = arrayOfInteger1;
      if (j.containsKey(parama))
      {
        arrayOfInteger2 = arrayOfInteger1;
        if (arrayOfInteger1 == null) {
          arrayOfInteger2 = (Integer[])j.remove(parama);
        }
      }
      return arrayOfInteger2 != null;
    }
    catch (Exception parama) {}
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */