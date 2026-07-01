package com.umeng.socialize.media;

import android.os.AsyncTask;

class d
  extends AsyncTask<Void, Void, byte[]>
{
  d(UMImage paramUMImage, UMediaObject.a parama) {}
  
  protected void a(byte[] paramArrayOfByte)
  {
    if (this.b != null) {
      this.b.a(paramArrayOfByte);
    }
  }
  
  protected byte[] a(Void... paramVarArgs)
  {
    return UMImage.a(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */