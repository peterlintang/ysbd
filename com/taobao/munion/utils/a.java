package com.taobao.munion.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a
{
  private final Object a;
  private final Class b;
  
  public a(Object paramObject)
  {
    this.a = paramObject;
    this.b = paramObject.getClass();
  }
  
  public a(String paramString)
  {
    Object localObject = null;
    try
    {
      paramString = Class.forName(paramString).newInstance();
      this.a = paramString;
      this.b = paramString.getClass();
      return;
    }
    catch (InstantiationException paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
    catch (IllegalAccessException paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
    catch (ClassNotFoundException paramString)
    {
      for (;;)
      {
        paramString = (String)localObject;
      }
    }
  }
  
  public static Object a(Class paramClass, String paramString)
  {
    try
    {
      paramClass = paramClass.getMethod(paramString, null).invoke(null, new Object[0]);
      return paramClass;
    }
    catch (InvocationTargetException paramClass)
    {
      return null;
    }
    catch (IllegalAccessException paramClass)
    {
      return null;
    }
    catch (IllegalArgumentException paramClass)
    {
      return null;
    }
    catch (NoSuchMethodException paramClass)
    {
      return null;
    }
    catch (SecurityException paramClass) {}
    return null;
  }
  
  public static Object a(Class paramClass, String paramString, Object... paramVarArgs)
  {
    int i = 0;
    Class[] arrayOfClass = new Class[paramVarArgs.length];
    while (i < arrayOfClass.length)
    {
      arrayOfClass[i] = paramVarArgs[i].getClass();
      i += 1;
    }
    try
    {
      paramClass = paramClass.getMethod(paramString, arrayOfClass).invoke(paramVarArgs, new Object[0]);
      return paramClass;
    }
    catch (SecurityException paramClass)
    {
      return null;
    }
    catch (NoSuchMethodException paramClass)
    {
      return null;
    }
    catch (IllegalArgumentException paramClass)
    {
      return null;
    }
    catch (IllegalAccessException paramClass)
    {
      return null;
    }
    catch (InvocationTargetException paramClass) {}
    return null;
  }
  
  public static Class b(String paramString)
  {
    try
    {
      paramString = Class.forName(paramString);
      return paramString;
    }
    catch (ClassNotFoundException paramString) {}
    return null;
  }
  
  public static Object b(Class paramClass, String paramString)
  {
    try
    {
      paramClass = paramClass.getField(paramString).get(null);
      return paramClass;
    }
    catch (IllegalAccessException paramClass)
    {
      return null;
    }
    catch (IllegalArgumentException paramClass)
    {
      return null;
    }
    catch (NoSuchFieldException paramClass)
    {
      return null;
    }
    catch (SecurityException paramClass) {}
    return null;
  }
  
  public static Object c(String paramString)
  {
    try
    {
      paramString = Class.forName(paramString).newInstance();
      return paramString;
    }
    catch (InstantiationException paramString)
    {
      return null;
    }
    catch (IllegalAccessException paramString)
    {
      return null;
    }
    catch (ClassNotFoundException paramString) {}
    return null;
  }
  
  private Field c(Class<?> paramClass, String paramString)
  {
    try
    {
      paramClass = paramClass.getDeclaredField(paramString);
      return paramClass;
    }
    catch (NoSuchFieldException paramClass) {}
    return null;
  }
  
  public Object a(String paramString)
  {
    try
    {
      paramString = this.b.getMethod(paramString, null).invoke(this.a, null);
      return paramString;
    }
    catch (InvocationTargetException paramString)
    {
      return null;
    }
    catch (IllegalAccessException paramString)
    {
      return null;
    }
    catch (IllegalArgumentException paramString)
    {
      return null;
    }
    catch (NoSuchMethodException paramString)
    {
      return null;
    }
    catch (SecurityException paramString) {}
    return null;
  }
  
  public Object a(String paramString, Object... paramVarArgs)
  {
    Class[] arrayOfClass = new Class[paramVarArgs.length];
    int i = 0;
    while (i < arrayOfClass.length)
    {
      arrayOfClass[i] = paramVarArgs[i].getClass();
      i += 1;
    }
    try
    {
      paramString = this.b.getMethod(paramString, arrayOfClass).invoke(this.a, paramVarArgs);
      return paramString;
    }
    catch (SecurityException paramString)
    {
      return null;
    }
    catch (NoSuchMethodException paramString)
    {
      return null;
    }
    catch (IllegalArgumentException paramString)
    {
      return null;
    }
    catch (IllegalAccessException paramString)
    {
      return null;
    }
    catch (InvocationTargetException paramString) {}
    return null;
  }
  
  public boolean a(String paramString, Object paramObject)
  {
    boolean bool = true;
    Field localField = null;
    try
    {
      for (Class localClass = this.b; (localField == null) && (localClass != null) && (!localClass.isInterface()); localClass = localClass.getSuperclass()) {
        localField = c(localClass, paramString);
      }
    }
    catch (SecurityException paramString)
    {
      for (;;)
      {
        bool = false;
      }
    }
    catch (IllegalArgumentException paramString)
    {
      for (;;)
      {
        bool = false;
      }
    }
    catch (IllegalAccessException paramString)
    {
      do
      {
        for (;;)
        {
          bool = false;
        }
      } while (localField != null);
    }
    localField.setAccessible(true);
    localField.set(this.a, paramObject);
    localField.setAccessible(false);
    return bool;
    return false;
  }
  
  public Object d(String paramString)
  {
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject4 = null;
    Object localObject1 = localObject4;
    Object localObject2 = localObject5;
    Object localObject3 = localObject6;
    Field localField;
    do
    {
      try
      {
        Class localClass = this.b;
        localField = null;
        while ((localField == null) && (localClass != null))
        {
          localObject1 = localObject4;
          localObject2 = localObject5;
          localObject3 = localObject6;
          if (!localClass.isInterface())
          {
            localObject1 = localObject4;
            localObject2 = localObject5;
            localObject3 = localObject6;
            localField = c(localClass, paramString);
            localObject1 = localObject4;
            localObject2 = localObject5;
            localObject3 = localObject6;
            localClass = localClass.getSuperclass();
            continue;
            localObject1 = localObject4;
            localObject2 = localObject5;
            localObject3 = localObject6;
            localField.setAccessible(true);
            localObject1 = localObject4;
            localObject2 = localObject5;
            localObject3 = localObject6;
            paramString = localField.get(this.a);
            localObject1 = paramString;
            localObject2 = paramString;
            localObject3 = paramString;
            localField.setAccessible(false);
            return paramString;
          }
        }
      }
      catch (SecurityException paramString)
      {
        return localObject1;
      }
      catch (IllegalAccessException paramString)
      {
        return localObject2;
      }
      catch (IllegalArgumentException paramString)
      {
        return localObject3;
      }
    } while (localField != null);
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */