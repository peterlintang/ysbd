package com.umeng.socialize.bean;

public enum Gender
{
  public static Gender convertToEmun(String paramString)
  {
    Gender[] arrayOfGender = values();
    int j = arrayOfGender.length;
    int i = 0;
    for (;;)
    {
      Object localObject;
      if (i >= j) {
        localObject = null;
      }
      Gender localGender;
      do
      {
        return (Gender)localObject;
        localGender = arrayOfGender[i];
        localObject = localGender;
      } while (localGender.toString().equals(paramString));
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\Gender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */