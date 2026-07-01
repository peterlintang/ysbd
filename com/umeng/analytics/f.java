package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import java.net.URLEncoder;
import org.json.JSONObject;

class f
{
  static SharedPreferences a(Context paramContext)
  {
    return paramContext.getSharedPreferences("mobclick_agent_user_" + paramContext.getPackageName(), 0);
  }
  
  static SharedPreferences b(Context paramContext)
  {
    return paramContext.getSharedPreferences("mobclick_agent_online_setting_" + paramContext.getPackageName(), 0);
  }
  
  static SharedPreferences c(Context paramContext)
  {
    return paramContext.getSharedPreferences("mobclick_agent_header_" + paramContext.getPackageName(), 0);
  }
  
  static SharedPreferences d(Context paramContext)
  {
    return paramContext.getSharedPreferences("mobclick_agent_update_" + paramContext.getPackageName(), 0);
  }
  
  static SharedPreferences e(Context paramContext)
  {
    return paramContext.getSharedPreferences("mobclick_agent_state_" + paramContext.getPackageName(), 0);
  }
  
  static String f(Context paramContext)
  {
    return "mobclick_agent_header_" + paramContext.getPackageName();
  }
  
  static String g(Context paramContext)
  {
    return "mobclick_agent_cached_" + paramContext.getPackageName();
  }
  
  static JSONObject h(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    paramContext = a(paramContext);
    try
    {
      if (paramContext.getInt("gender", -1) != -1) {
        localJSONObject.put("sex", paramContext.getInt("gender", -1));
      }
      if (paramContext.getInt("age", -1) != -1) {
        localJSONObject.put("age", paramContext.getInt("age", -1));
      }
      if (!"".equals(paramContext.getString("user_id", ""))) {
        localJSONObject.put("id", paramContext.getString("user_id", ""));
      }
      if (!"".equals(paramContext.getString("id_source", ""))) {
        localJSONObject.put("url", URLEncoder.encode(paramContext.getString("id_source", "")));
      }
      int i = localJSONObject.length();
      if (i > 0) {
        return localJSONObject;
      }
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\analytics\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */