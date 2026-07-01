package com.umeng.socialize.c;

import android.text.TextUtils;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.bean.UMFriend.a;
import com.umeng.socialize.c.a.e;
import com.umeng.socom.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class p
  extends e
{
  public List<UMFriend> a;
  private boolean b = true;
  
  public p(JSONObject paramJSONObject)
  {
    super(paramJSONObject);
  }
  
  public static char a(char paramChar)
  {
    char c = paramChar;
    if (paramChar >= 'a')
    {
      c = paramChar;
      if (paramChar <= 'z') {
        c = (char)(paramChar - ' ');
      }
    }
    return c;
  }
  
  public void a()
  {
    Object localObject1 = this.l;
    if (localObject1 == null)
    {
      Log.b(e.k, "data json is null....");
      return;
    }
    this.a = new ArrayList();
    Iterator localIterator = ((JSONObject)localObject1).keys();
    label34:
    if (localIterator.hasNext()) {}
    for (;;)
    {
      Object localObject3;
      try
      {
        localObject3 = localIterator.next().toString();
        JSONObject localJSONObject = (JSONObject)this.l.get((String)localObject3);
        if (!localJSONObject.has("name")) {
          break label34;
        }
        localObject1 = localJSONObject.getString("name");
        if ((TextUtils.isEmpty((CharSequence)localObject3)) || (TextUtils.isEmpty((CharSequence)localObject1))) {
          break label34;
        }
        UMFriend localUMFriend = new UMFriend();
        localUMFriend.setFid((String)localObject3);
        localUMFriend.setName((String)localObject1);
        localObject3 = localJSONObject.optString("link_name", "");
        if (!TextUtils.isEmpty((CharSequence)localObject3)) {
          break label243;
        }
        localUMFriend.setLink_name((String)localObject1);
        localObject1 = localJSONObject.optString("pinyin", "");
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          localObject3 = new UMFriend.a();
          ((UMFriend.a)localObject3).b = String.valueOf(a(((String)localObject1).charAt(0)));
          ((UMFriend.a)localObject3).a = ((String)localObject1);
          localUMFriend.setPinyin((UMFriend.a)localObject3);
        }
        if (localJSONObject.has("profile_image_url")) {
          localUMFriend.setIcon(localJSONObject.getString("profile_image_url"));
        }
        this.a.add(localUMFriend);
      }
      catch (Exception localException)
      {
        Log.b(k, "Parse friend data error", localException);
      }
      break label34;
      break;
      label243:
      Object localObject2 = localObject3;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */