package com.umeng.socialize.controller;

import android.app.Activity;
import android.text.TextUtils;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.controller.a.aa;
import com.umeng.socialize.controller.b.a;
import com.umeng.socialize.controller.b.b;
import com.umeng.socialize.controller.b.c;
import com.umeng.socialize.media.UMImage;
import java.lang.annotation.AnnotationFormatError;
import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;
import java.util.Map;

public abstract class UMServiceFactory
{
  private static boolean a = false;
  
  private static UMSocialService a(Class<? extends UMSocialService> paramClass, SocializeEntity paramSocializeEntity)
  {
    Object localObject = (c)paramClass.getAnnotation(c.class);
    if (localObject == null) {
      throw new AnnotationFormatError("该接口未定义实现类的注解");
    }
    try
    {
      localObject = (UMSocialService)((c)localObject).a().getConstructor(new Class[] { SocializeEntity.class }).newInstance(new Object[] { paramSocializeEntity });
      paramSocializeEntity = UMServiceFactory.class.getClassLoader();
      paramClass = new UMServiceFactory.a((UMSocialService)localObject, paramClass);
      return (UMSocialService)Proxy.newProxyInstance(paramSocializeEntity, new Class[] { UMSocialService.class }, paramClass);
    }
    catch (Exception paramClass)
    {
      throw new RuntimeException("该接口所定义的实现类不能被实例化", paramClass);
    }
  }
  
  public static UMSocialService getUMSocialService(String paramString, RequestType paramRequestType)
  {
    Object localObject1;
    if (RequestType.ANALYTICS == paramRequestType) {
      if (aa.b.containsKey(paramString + paramRequestType))
      {
        paramString = (SocializeEntity)aa.b.get(paramString + paramRequestType);
        Object localObject2 = null;
        localObject1 = localObject2;
        switch (b()[paramRequestType.ordinal()])
        {
        default: 
          localObject1 = localObject2;
        }
      }
    }
    for (;;)
    {
      if (localObject1 == null) {
        break label286;
      }
      return a((Class)localObject1, paramString);
      if (aa.b.containsKey(paramString + RequestType.SOCIAL))
      {
        paramString = SocializeEntity.cloneNew((SocializeEntity)aa.b.get(paramString + RequestType.SOCIAL), paramRequestType);
        break;
      }
      paramString = new SocializeEntity(paramString, paramRequestType);
      break;
      if (aa.b.containsKey(paramString + paramRequestType))
      {
        paramString = (SocializeEntity)aa.b.get(paramString + paramRequestType);
        break;
      }
      paramString = new SocializeEntity(paramString, paramRequestType);
      break;
      localObject1 = a.class;
      continue;
      localObject1 = b.class;
    }
    label286:
    throw new RuntimeException("RequestType [" + paramRequestType + "] is unusable.");
  }
  
  public static void shareTo(Activity paramActivity, SHARE_MEDIA paramSHARE_MEDIA, String paramString, byte[] paramArrayOfByte)
  {
    UMSocialService localUMSocialService = getUMSocialService("com.umeng.share", RequestType.SOCIAL);
    if (!TextUtils.isEmpty(paramString)) {
      localUMSocialService.setShareContent(paramString);
    }
    if (paramArrayOfByte != null) {
      localUMSocialService.setShareMedia(new UMImage(paramActivity, paramArrayOfByte));
    }
    localUMSocialService.directShare(paramActivity, paramSHARE_MEDIA, null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\UMServiceFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */