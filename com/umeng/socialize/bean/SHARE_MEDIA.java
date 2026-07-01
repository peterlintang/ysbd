package com.umeng.socialize.bean;

public enum SHARE_MEDIA
{
  static
  {
    RENREN = new j("RENREN", 2);
  }
  
  public static SHARE_MEDIA convertToEmun(String paramString)
  {
    SHARE_MEDIA[] arrayOfSHARE_MEDIA = values();
    int j = arrayOfSHARE_MEDIA.length;
    int i = 0;
    for (;;)
    {
      Object localObject;
      if (i >= j) {
        localObject = null;
      }
      SHARE_MEDIA localSHARE_MEDIA;
      do
      {
        return (SHARE_MEDIA)localObject;
        localSHARE_MEDIA = arrayOfSHARE_MEDIA[i];
        localObject = localSHARE_MEDIA;
      } while (localSHARE_MEDIA.toString().equals(paramString));
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\SHARE_MEDIA.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */