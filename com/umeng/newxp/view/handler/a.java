package com.umeng.newxp.view.handler;

import android.content.Context;
import android.view.View;
import com.umeng.newxp.Promoter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class a
{
  protected View a;
  
  public static <T extends a> T a(Class<T> paramClass, Context paramContext)
  {
    try
    {
      paramClass = paramClass.getDeclaredConstructor(new Class[0]);
      paramClass.setAccessible(true);
      paramClass = (a)paramClass.newInstance(new Object[0]);
      paramClass.a(paramContext);
      return paramClass;
    }
    catch (NoSuchMethodException paramClass)
    {
      paramClass.printStackTrace();
      return null;
    }
    catch (IllegalArgumentException paramClass)
    {
      for (;;)
      {
        paramClass.printStackTrace();
      }
    }
    catch (InstantiationException paramClass)
    {
      for (;;)
      {
        paramClass.printStackTrace();
      }
    }
    catch (IllegalAccessException paramClass)
    {
      for (;;)
      {
        paramClass.printStackTrace();
      }
    }
    catch (InvocationTargetException paramClass)
    {
      for (;;)
      {
        paramClass.printStackTrace();
      }
    }
  }
  
  public View a()
  {
    return this.a;
  }
  
  protected abstract View a(Context paramContext);
  
  public void a(View paramView)
  {
    this.a = paramView;
  }
  
  public abstract <T extends Promoter> void a(T paramT, Object... paramVarArgs);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */