package com.umeng.socialize.media;

public enum UMediaObject$MediaType
{
  public static MediaType convertToEmun(String paramString)
  {
    MediaType[] arrayOfMediaType = values();
    int j = arrayOfMediaType.length;
    int i = 0;
    for (;;)
    {
      Object localObject;
      if (i >= j) {
        localObject = null;
      }
      MediaType localMediaType;
      do
      {
        return (MediaType)localObject;
        localMediaType = arrayOfMediaType[i];
        localObject = localMediaType;
      } while (localMediaType.toString().equals(paramString));
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\UMediaObject$MediaType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */