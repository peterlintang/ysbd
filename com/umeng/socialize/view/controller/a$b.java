package com.umeng.socialize.view.controller;

import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.bean.UMFriend.a;
import java.util.Comparator;

class a$b
  implements Comparator<UMFriend>
{
  private a$b(a parama) {}
  
  public int a(UMFriend paramUMFriend1, UMFriend paramUMFriend2)
  {
    paramUMFriend1 = paramUMFriend1.getPinyin();
    paramUMFriend2 = paramUMFriend2.getPinyin();
    return paramUMFriend1.b.charAt(0) - paramUMFriend2.b.charAt(0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\controller\a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */