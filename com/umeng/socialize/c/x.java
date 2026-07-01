package com.umeng.socialize.c;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.socialize.bean.Gender;
import com.umeng.socialize.bean.SnsAccount;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.c.a.e;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.common.m;
import java.util.Map;

public class x
  extends b
{
  private static final String g = "/user/custom_account/";
  private static final int h = 19;
  private SnsAccount i;
  
  public x(Context paramContext, SocializeEntity paramSocializeEntity, SnsAccount paramSnsAccount)
  {
    super(paramContext, "", e.class, paramSocializeEntity, 19, b.b.b);
    this.i = paramSnsAccount;
  }
  
  protected String a()
  {
    return "/user/custom_account/" + m.a(this.c) + "/" + SocializeConstants.UID + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    String str = this.i.getUsid();
    if (!TextUtils.isEmpty(str)) {
      paramMap.put("usid", str);
    }
    if (this.i.getGender() != null) {}
    for (str = this.i.getGender().toString();; str = null)
    {
      if (!TextUtils.isEmpty(str)) {
        paramMap.put("gender", str);
      }
      str = this.i.getUserName();
      if (!TextUtils.isEmpty(str)) {
        paramMap.put("username", str);
      }
      str = this.i.getBirthday();
      if (!TextUtils.isEmpty(str)) {
        paramMap.put("birthday", str);
      }
      str = this.i.getProfileUrl();
      if (!TextUtils.isEmpty(str)) {
        paramMap.put("profile_url", str);
      }
      str = this.i.getAccount_icon_url();
      if (!TextUtils.isEmpty(str)) {
        paramMap.put("icon", str);
      }
      str = this.i.getExtendArgs();
      if (!TextUtils.isEmpty(str)) {
        paramMap.put("extend", str);
      }
      return paramMap;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */