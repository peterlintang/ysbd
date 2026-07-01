package com.taobao.munion.nineoldandroids.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class e<T, V>
  extends d<T, V>
{
  private static final String a = "get";
  private static final String b = "is";
  private static final String c = "set";
  private Method d;
  private Method e;
  private Field f;
  
  public e(Class<T> paramClass, Class<V> paramClass1, String paramString)
  {
    super(paramClass1, paramString);
    char c1 = Character.toUpperCase(paramString.charAt(0));
    String str1 = paramString.substring(1);
    str1 = c1 + str1;
    String str2 = "get" + str1;
    try
    {
      this.e = paramClass.getMethod(str2, null);
      paramString = this.e.getReturnType();
      if (!a(paramClass1, paramString)) {
        throw new c("Underlying type (" + paramString + ") does not match Property type (" + paramClass1 + ")");
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException3)
    {
      try
      {
        this.e = paramClass.getDeclaredMethod(str2, null);
        this.e.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        for (;;)
        {
          String str3 = "is" + str1;
          try
          {
            this.e = paramClass.getMethod(str3, null);
          }
          catch (NoSuchMethodException localNoSuchMethodException4)
          {
            try
            {
              this.e = paramClass.getDeclaredMethod(str3, null);
              this.e.setAccessible(true);
            }
            catch (NoSuchMethodException localNoSuchMethodException1)
            {
              try
              {
                this.f = paramClass.getField(paramString);
                paramClass = this.f.getType();
                if (a(paramClass1, paramClass)) {
                  break label347;
                }
                throw new c("Underlying type (" + paramClass + ") does not match Property type (" + paramClass1 + ")");
              }
              catch (NoSuchFieldException paramClass)
              {
                throw new c("No accessor method or field found for property with name " + paramString);
              }
            }
          }
        }
      }
      paramClass1 = "set" + localNoSuchMethodException1;
      try
      {
        this.d = paramClass.getDeclaredMethod(paramClass1, new Class[] { paramString });
        this.d.setAccessible(true);
        label347:
        return;
      }
      catch (NoSuchMethodException paramClass) {}
    }
  }
  
  private boolean a(Class<V> paramClass, Class paramClass1)
  {
    boolean bool2 = false;
    if (paramClass1 != paramClass)
    {
      boolean bool1 = bool2;
      if (paramClass1.isPrimitive()) {
        if (((paramClass1 != Float.TYPE) || (paramClass != Float.class)) && ((paramClass1 != Integer.TYPE) || (paramClass != Integer.class)) && ((paramClass1 != Boolean.TYPE) || (paramClass != Boolean.class)) && ((paramClass1 != Long.TYPE) || (paramClass != Long.class)) && ((paramClass1 != Double.TYPE) || (paramClass != Double.class)) && ((paramClass1 != Short.TYPE) || (paramClass != Short.class)) && ((paramClass1 != Byte.TYPE) || (paramClass != Byte.class)))
        {
          bool1 = bool2;
          if (paramClass1 == Character.TYPE)
          {
            bool1 = bool2;
            if (paramClass != Character.class) {}
          }
        }
        else
        {
          bool1 = true;
        }
      }
      return bool1;
    }
    return true;
  }
  
  public V a(T paramT)
  {
    if (this.e != null) {
      try
      {
        paramT = this.e.invoke(paramT, null);
        return paramT;
      }
      catch (IllegalAccessException paramT)
      {
        throw new AssertionError();
      }
      catch (InvocationTargetException paramT)
      {
        throw new RuntimeException(paramT.getCause());
      }
    }
    if (this.f != null) {
      try
      {
        paramT = this.f.get(paramT);
        return paramT;
      }
      catch (IllegalAccessException paramT)
      {
        throw new AssertionError();
      }
    }
    throw new AssertionError();
  }
  
  public void a(T paramT, V paramV)
  {
    if (this.d != null) {
      try
      {
        this.d.invoke(paramT, new Object[] { paramV });
        return;
      }
      catch (IllegalAccessException paramT)
      {
        throw new AssertionError();
      }
      catch (InvocationTargetException paramT)
      {
        throw new RuntimeException(paramT.getCause());
      }
    }
    if (this.f != null) {
      try
      {
        this.f.set(paramT, paramV);
        return;
      }
      catch (IllegalAccessException paramT)
      {
        throw new AssertionError();
      }
    }
    throw new UnsupportedOperationException("Property " + b() + " is read-only");
  }
  
  public boolean a()
  {
    return (this.d == null) && (this.f == null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\util\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */