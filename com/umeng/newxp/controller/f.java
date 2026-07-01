package com.umeng.newxp.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.newxp.b;
import com.umeng.newxp.common.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f
{
  public static final a a = new a("", "热卖", "", b.b, com.umeng.newxp.c.b);
  public static final a b = new a("", "精彩推荐", "", b.a, com.umeng.newxp.c.a);
  private static final String e = f.class.getName();
  private static final String f = "UMENG_TABS_CACHE";
  private static final String g = "Tabs";
  String c;
  int d = 0;
  private final Context h;
  
  private f(Context paramContext)
  {
    this.h = paramContext;
  }
  
  public static f a(Context paramContext, String paramString)
  {
    paramContext = new f(paramContext.getApplicationContext());
    paramContext.c = paramString;
    paramString = e;
    new StringBuilder("Initailized TabsDiskCahce [").append(paramContext.c).append("]").toString();
    return paramContext;
  }
  
  private List<a> b(JSONArray paramJSONArray)
  {
    localArrayList = new ArrayList();
    int i = 0;
    try
    {
      while (i < paramJSONArray.length())
      {
        Object localObject3 = (JSONObject)paramJSONArray.get(i);
        Object localObject1 = ((JSONObject)localObject3).optString("title");
        String str = ((JSONObject)localObject3).optString("url_params");
        Object localObject4 = ((JSONObject)localObject3).optString("resource_type");
        Object localObject2 = ((JSONObject)localObject3).optString("template");
        localObject3 = ((JSONObject)localObject3).optString("tabid", "");
        this.d += 1;
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          b localb = b.a((String)localObject4);
          localObject4 = new HashSet();
          localObject2 = com.umeng.newxp.c.a((String)localObject2, (Set)localObject4);
          localObject1 = new a(com.umeng.newxp.common.c.c(str), (String)localObject1, (String)localObject3, localb, (com.umeng.newxp.c)localObject2);
          ((a)localObject1).c = i;
          ((a)localObject1).a((Collection)localObject4);
          localArrayList.add(localObject1);
        }
        i += 1;
      }
      return localArrayList;
    }
    catch (JSONException paramJSONArray)
    {
      paramJSONArray = e;
    }
  }
  
  private String c()
  {
    return "Tabs_" + this.c;
  }
  
  public List<a> a(a... paramVarArgs)
  {
    Object localObject = a();
    if ((localObject != null) && (((JSONArray)localObject).length() > 0))
    {
      List localList = b((JSONArray)localObject);
      if (localList != null)
      {
        localObject = localList;
        if (localList.size() != 0) {}
      }
      else
      {
        if (paramVarArgs == null) {
          break label48;
        }
        localObject = Arrays.asList(paramVarArgs);
      }
      return (List<a>)localObject;
      label48:
      return new ArrayList();
    }
    if (paramVarArgs != null) {
      return Arrays.asList(paramVarArgs);
    }
    return new ArrayList();
  }
  
  public JSONArray a()
  {
    Object localObject;
    if (this.h == null)
    {
      localObject = e;
      return null;
    }
    try
    {
      localObject = new JSONArray(this.h.getSharedPreferences("UMENG_TABS_CACHE", 1).getString(c(), ""));
      String str2 = e;
      new StringBuilder("get Data from TabsDiskCahce [").append(this.c).append("] ").append(((JSONArray)localObject).toString()).toString();
      return (JSONArray)localObject;
    }
    catch (Exception localException)
    {
      String str1 = e;
    }
    return null;
  }
  
  public boolean a(JSONArray paramJSONArray)
  {
    if (this.h == null) {
      paramJSONArray = e;
    }
    for (;;)
    {
      return false;
      if (paramJSONArray == null) {
        continue;
      }
      try
      {
        if (paramJSONArray.length() <= 0) {
          continue;
        }
        Object localObject = this.h.getSharedPreferences("UMENG_TABS_CACHE", 2);
        SharedPreferences.Editor localEditor = ((SharedPreferences)localObject).edit();
        try
        {
          localEditor.putString(c(), paramJSONArray.toString());
          localEditor.commit();
          localObject = e;
          new StringBuilder("update TabsDiskCahce [").append(this.c).append("] ").append(paramJSONArray.toString()).toString();
          return true;
        }
        finally {}
        return false;
      }
      catch (Exception paramJSONArray)
      {
        paramJSONArray = e;
      }
    }
  }
  
  public boolean b()
  {
    try
    {
      SharedPreferences.Editor localEditor = this.h.getSharedPreferences("UMENG_TABS_CACHE", 2).edit();
      localEditor.clear();
      localEditor.commit();
      return true;
    }
    catch (Exception localException)
    {
      String str = e;
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */