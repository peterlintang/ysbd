package com.umeng.socialize.bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MultiStatus
{
  private int a;
  private Map<SHARE_MEDIA, Integer> b;
  private Map<String, Integer> c;
  
  public MultiStatus(int paramInt)
  {
    this.a = paramInt;
    this.b = new HashMap();
    this.c = new HashMap();
  }
  
  public Map<String, Integer> getAllChildren()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(this.c);
    Object localObject = this.b.keySet();
    if (localObject != null) {
      localObject = ((Set)localObject).iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject).hasNext()) {
        return localHashMap;
      }
      SHARE_MEDIA localSHARE_MEDIA = (SHARE_MEDIA)((Iterator)localObject).next();
      Integer localInteger = (Integer)this.b.get(localSHARE_MEDIA);
      localHashMap.put(localSHARE_MEDIA.toString(), localInteger);
    }
  }
  
  public int getChildCode(String paramString)
  {
    if (this.c.containsKey(paramString)) {
      return ((Integer)this.c.get(paramString)).intValue();
    }
    paramString = SHARE_MEDIA.convertToEmun(paramString);
    if ((paramString != null) && (this.b.containsKey(paramString))) {
      return ((Integer)this.b.get(paramString)).intValue();
    }
    return -103;
  }
  
  public Map<SHARE_MEDIA, Integer> getPlatformCode()
  {
    return this.b;
  }
  
  public int getPlatformStatus(SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (this.b.containsKey(paramSHARE_MEDIA)) {
      return ((Integer)this.b.get(paramSHARE_MEDIA)).intValue();
    }
    return -102;
  }
  
  public int getStCode()
  {
    return this.a;
  }
  
  public void setInfoCode(Map<String, Integer> paramMap)
  {
    this.c.putAll(paramMap);
  }
  
  public void setPlatformCode(Map<SHARE_MEDIA, Integer> paramMap)
  {
    this.b.putAll(paramMap);
  }
  
  public void setStCode(int paramInt)
  {
    this.a = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("status=" + this.a + "{");
    Iterator localIterator;
    if ((this.b != null) && (this.b.keySet() != null)) {
      localIterator = this.b.keySet().iterator();
    }
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        localStringBuilder.append("}");
        return localStringBuilder.toString();
      }
      SHARE_MEDIA localSHARE_MEDIA = (SHARE_MEDIA)localIterator.next();
      Integer localInteger = (Integer)this.b.get(localSHARE_MEDIA);
      localStringBuilder.append("[" + localSHARE_MEDIA.toString() + "=" + localInteger + "]");
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\MultiStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */