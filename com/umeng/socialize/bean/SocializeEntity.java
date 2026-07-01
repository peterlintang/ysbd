package com.umeng.socialize.bean;

import com.umeng.socialize.c.f.a;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.a.aa;
import com.umeng.socialize.media.BaseMediaObject;
import com.umeng.socialize.media.UMediaObject;
import java.util.Map;

public class SocializeEntity
{
  private int a;
  private int b;
  private int c;
  public String customID;
  private int d;
  public String descriptor;
  private boolean e;
  public String entityKey = "-1";
  private String f;
  private f.a g;
  private UMediaObject h = null;
  private String i;
  public boolean initialized = false;
  private SocializeConfig j = null;
  private RequestType k;
  public String sessionID = "";
  
  public SocializeEntity(String paramString, RequestType paramRequestType)
  {
    this.descriptor = paramString;
    this.k = paramRequestType;
    aa.b.put(paramString + paramRequestType, this);
  }
  
  public static String buildPoolKey(String paramString, RequestType paramRequestType)
  {
    return paramString + paramRequestType.toString();
  }
  
  public static SocializeEntity cloneNew(SocializeEntity paramSocializeEntity, RequestType paramRequestType)
  {
    paramRequestType = new SocializeEntity(paramSocializeEntity.descriptor, paramRequestType);
    paramRequestType.entityKey = paramSocializeEntity.entityKey;
    paramRequestType.sessionID = paramSocializeEntity.sessionID;
    paramRequestType.customID = paramSocializeEntity.customID;
    paramRequestType.a = paramSocializeEntity.a;
    paramRequestType.b = paramSocializeEntity.a;
    paramRequestType.c = paramSocializeEntity.c;
    paramRequestType.d = paramSocializeEntity.d;
    paramRequestType.e = paramSocializeEntity.e;
    paramRequestType.f = paramSocializeEntity.f;
    paramRequestType.g = paramSocializeEntity.g;
    paramRequestType.initialized = paramSocializeEntity.initialized;
    return paramRequestType;
  }
  
  public void IncrementCc()
  {
    try
    {
      this.b += 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void IncrementSc()
  {
    try
    {
      this.d += 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void changeILike()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 109	com/umeng/socialize/bean/SocializeEntity:g	Lcom/umeng/socialize/c/f$a;
    //   6: getstatic 116	com/umeng/socialize/c/f$a:a	Lcom/umeng/socialize/c/f$a;
    //   9: if_acmpne +23 -> 32
    //   12: aload_0
    //   13: aload_0
    //   14: getfield 101	com/umeng/socialize/bean/SocializeEntity:c	I
    //   17: iconst_1
    //   18: isub
    //   19: putfield 101	com/umeng/socialize/bean/SocializeEntity:c	I
    //   22: aload_0
    //   23: getstatic 118	com/umeng/socialize/c/f$a:b	Lcom/umeng/socialize/c/f$a;
    //   26: putfield 109	com/umeng/socialize/bean/SocializeEntity:g	Lcom/umeng/socialize/c/f$a;
    //   29: aload_0
    //   30: monitorexit
    //   31: return
    //   32: aload_0
    //   33: aload_0
    //   34: getfield 101	com/umeng/socialize/bean/SocializeEntity:c	I
    //   37: iconst_1
    //   38: iadd
    //   39: putfield 101	com/umeng/socialize/bean/SocializeEntity:c	I
    //   42: aload_0
    //   43: getstatic 116	com/umeng/socialize/c/f$a:a	Lcom/umeng/socialize/c/f$a;
    //   46: putfield 109	com/umeng/socialize/bean/SocializeEntity:g	Lcom/umeng/socialize/c/f$a;
    //   49: goto -20 -> 29
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	SocializeEntity
    //   52	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	29	52	finally
    //   32	49	52	finally
  }
  
  public int getComment_count()
  {
    return this.b;
  }
  
  public SocializeConfig getEntityConfig()
  {
    return this.j;
  }
  
  public f.a getIlike()
  {
    return this.g;
  }
  
  public int getLike_count()
  {
    return this.c;
  }
  
  public <T extends BaseMediaObject> T getMedia(Class<T> paramClass)
  {
    if ((this.h != null) && (paramClass != null) && (this.h.getClass().equals(paramClass))) {
      return (BaseMediaObject)this.h;
    }
    return null;
  }
  
  public UMediaObject getMedia()
  {
    return this.h;
  }
  
  public String getNickName()
  {
    return this.f;
  }
  
  public int getPv()
  {
    return this.a;
  }
  
  public RequestType getRequestType()
  {
    return this.k;
  }
  
  public String getShareContent()
  {
    return this.i;
  }
  
  public int getShare_count()
  {
    return this.d;
  }
  
  public boolean isNew()
  {
    return this.e;
  }
  
  public void setComment_count(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void setConfig(SocializeConfig paramSocializeConfig)
  {
    this.j = paramSocializeConfig;
  }
  
  public void setIlikey(f.a parama)
  {
    this.g = parama;
  }
  
  public void setLike_count(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void setMedia(UMediaObject paramUMediaObject)
  {
    this.h = paramUMediaObject;
  }
  
  public void setNew(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public void setNickName(String paramString)
  {
    this.f = paramString;
  }
  
  public void setPv(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void setShareContent(String paramString)
  {
    this.i = paramString;
  }
  
  public void setShare_count(int paramInt)
  {
    this.d = paramInt;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\SocializeEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */