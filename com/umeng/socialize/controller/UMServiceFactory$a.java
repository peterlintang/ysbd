package com.umeng.socialize.controller;

import com.umeng.socialize.controller.b.d;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

final class UMServiceFactory$a
  implements InvocationHandler
{
  private UMSocialService a;
  private Class<? extends UMSocialService> b;
  
  public UMServiceFactory$a(UMSocialService paramUMSocialService, Class<? extends UMSocialService> paramClass)
  {
    this.a = paramUMSocialService;
    this.b = paramClass;
  }
  
  public final Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    paramObject = this.b.getMethod(paramMethod.getName(), paramMethod.getParameterTypes());
    if ((d)((Method)paramObject).getAnnotation(d.class) != null)
    {
      if (UMServiceFactory.a())
      {
        if (((Method)paramObject).getReturnType() == Boolean.TYPE)
        {
          System.out.println(((Method)paramObject).getName() + " return type is boolean.");
          return new Boolean(false);
        }
        return null;
      }
      return paramMethod.invoke(this.a, paramArrayOfObject);
    }
    throw new SecurityException("当前用户不允许执行此操作");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\UMServiceFactory$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */