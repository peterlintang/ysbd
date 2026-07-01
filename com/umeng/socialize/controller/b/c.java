package com.umeng.socialize.controller.b;

import com.umeng.socialize.controller.UMSocialService;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.TYPE})
public @interface c
{
  Class<? extends UMSocialService> a();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */