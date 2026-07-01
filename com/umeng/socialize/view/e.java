package com.umeng.socialize.view;

import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.media.UMediaObject.a;

class e
  implements UMediaObject.a
{
  e(CommentActivity paramCommentActivity, UMediaObject paramUMediaObject) {}
  
  public void a() {}
  
  public void a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (!this.b.isUrlMedia())) {
      this.a.setImageBytes(paramArrayOfByte);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */