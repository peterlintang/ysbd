package com.umeng.newxp.common.c;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class h
{
  public static Object a(Class paramClass, String paramString)
  {
    try
    {
      paramClass = paramClass.getDeclaredMethod(paramString, new Class[0]);
      paramClass.setAccessible(true);
      paramClass = paramClass.invoke(null, new Object[0]);
      return paramClass;
    }
    catch (SecurityException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (NoSuchMethodException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (IllegalArgumentException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (IllegalAccessException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (InvocationTargetException paramClass)
    {
      paramClass.printStackTrace();
    }
    return null;
  }
  
  public static Object a(Class paramClass, String paramString, Object[] paramArrayOfObject, Class... paramVarArgs)
  {
    try
    {
      paramClass = paramClass.getDeclaredMethod(paramString, paramVarArgs);
      paramClass.setAccessible(true);
      paramClass = paramClass.invoke(null, paramArrayOfObject);
      return paramClass;
    }
    catch (SecurityException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (NoSuchMethodException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (IllegalArgumentException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (IllegalAccessException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (InvocationTargetException paramClass)
    {
      paramClass.printStackTrace();
    }
    return null;
  }
  
  public static Object a(Object paramObject, String paramString)
  {
    try
    {
      paramString = paramObject.getClass().getSuperclass().getDeclaredMethod(paramString, new Class[0]);
      paramString.setAccessible(true);
      paramObject = paramString.invoke(paramObject, new Object[0]);
      return paramObject;
    }
    catch (SecurityException paramObject)
    {
      ((SecurityException)paramObject).printStackTrace();
      return null;
    }
    catch (NoSuchMethodException paramObject)
    {
      for (;;)
      {
        ((NoSuchMethodException)paramObject).printStackTrace();
      }
    }
    catch (IllegalArgumentException paramObject)
    {
      for (;;)
      {
        ((IllegalArgumentException)paramObject).printStackTrace();
      }
    }
    catch (IllegalAccessException paramObject)
    {
      for (;;)
      {
        ((IllegalAccessException)paramObject).printStackTrace();
      }
    }
    catch (InvocationTargetException paramObject)
    {
      for (;;)
      {
        ((InvocationTargetException)paramObject).printStackTrace();
      }
    }
  }
  
  public static Object a(Object paramObject, String paramString, Object[] paramArrayOfObject, Class... paramVarArgs)
  {
    try
    {
      paramString = paramObject.getClass().getSuperclass().getDeclaredMethod(paramString, paramVarArgs);
      paramString.setAccessible(true);
      paramObject = paramString.invoke(paramObject, paramArrayOfObject);
      return paramObject;
    }
    catch (SecurityException paramObject)
    {
      ((SecurityException)paramObject).printStackTrace();
      return null;
    }
    catch (NoSuchMethodException paramObject)
    {
      for (;;)
      {
        ((NoSuchMethodException)paramObject).printStackTrace();
      }
    }
    catch (IllegalArgumentException paramObject)
    {
      for (;;)
      {
        ((IllegalArgumentException)paramObject).printStackTrace();
      }
    }
    catch (IllegalAccessException paramObject)
    {
      for (;;)
      {
        ((IllegalAccessException)paramObject).printStackTrace();
      }
    }
    catch (InvocationTargetException paramObject)
    {
      for (;;)
      {
        ((InvocationTargetException)paramObject).printStackTrace();
      }
    }
  }
  
  public static Object a(String paramString1, String paramString2)
  {
    Object localObject = null;
    try
    {
      Class localClass = Class.forName(paramString1);
      paramString1 = (String)localObject;
      if (localClass != null) {
        paramString1 = a(localClass, paramString2);
      }
      return paramString1;
    }
    catch (ClassNotFoundException paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  public static Object a(String paramString1, String paramString2, Object[] paramArrayOfObject, Class... paramVarArgs)
  {
    Object localObject = null;
    try
    {
      Class localClass = Class.forName(paramString1);
      paramString1 = (String)localObject;
      if (localClass != null) {
        paramString1 = a(localClass, paramString2, paramArrayOfObject, paramVarArgs);
      }
      return paramString1;
    }
    catch (ClassNotFoundException paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  public static Object b(Object paramObject, String paramString)
  {
    try
    {
      paramString = paramObject.getClass().getDeclaredMethod(paramString, new Class[0]);
      paramString.setAccessible(true);
      paramObject = paramString.invoke(paramObject, new Object[0]);
      return paramObject;
    }
    catch (SecurityException paramObject)
    {
      ((SecurityException)paramObject).printStackTrace();
      return null;
    }
    catch (NoSuchMethodException paramObject)
    {
      for (;;)
      {
        ((NoSuchMethodException)paramObject).printStackTrace();
      }
    }
    catch (IllegalArgumentException paramObject)
    {
      for (;;)
      {
        ((IllegalArgumentException)paramObject).printStackTrace();
      }
    }
    catch (IllegalAccessException paramObject)
    {
      for (;;)
      {
        ((IllegalAccessException)paramObject).printStackTrace();
      }
    }
    catch (InvocationTargetException paramObject)
    {
      for (;;)
      {
        ((InvocationTargetException)paramObject).printStackTrace();
      }
    }
  }
  
  public static Object b(Object paramObject, String paramString, Object[] paramArrayOfObject, Class... paramVarArgs)
  {
    try
    {
      paramString = paramObject.getClass().getDeclaredMethod(paramString, paramVarArgs);
      paramString.setAccessible(true);
      paramObject = paramString.invoke(paramObject, paramArrayOfObject);
      return paramObject;
    }
    catch (SecurityException paramObject)
    {
      ((SecurityException)paramObject).printStackTrace();
      return null;
    }
    catch (NoSuchMethodException paramObject)
    {
      for (;;)
      {
        ((NoSuchMethodException)paramObject).printStackTrace();
      }
    }
    catch (IllegalArgumentException paramObject)
    {
      for (;;)
      {
        ((IllegalArgumentException)paramObject).printStackTrace();
      }
    }
    catch (IllegalAccessException paramObject)
    {
      for (;;)
      {
        ((IllegalAccessException)paramObject).printStackTrace();
      }
    }
    catch (InvocationTargetException paramObject)
    {
      for (;;)
      {
        ((InvocationTargetException)paramObject).printStackTrace();
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */