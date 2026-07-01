package com.taobao.munion.model;

import org.json.JSONObject;

public class a
{
  public String a;
  public String b;
  public String c;
  public String d;
  public String e;
  public String f;
  public String g;
  public int h;
  public String i;
  public String j;
  public int k;
  public int l;
  public String m;
  public String n;
  public String o;
  public String p;
  public String q;
  public String r;
  public double s;
  public String t;
  public int u;
  public double v;
  public String w;
  public String x;
  public String y;
  public JSONObject z;
  
  public a(JSONObject paramJSONObject)
  {
    this.z = paramJSONObject;
    this.a = paramJSONObject.optString("red_key");
    this.b = paramJSONObject.optString("promoter");
    this.c = paramJSONObject.optString("img");
    this.d = paramJSONObject.optString("is_prepay");
    this.e = paramJSONObject.optString("ad_location");
    this.f = paramJSONObject.optString("anim_in");
    this.g = paramJSONObject.optString("title");
    this.h = paramJSONObject.optInt("sell");
    this.i = paramJSONObject.optString("description");
    this.j = paramJSONObject.optString("grade");
    this.k = paramJSONObject.optInt("content_type");
    this.l = paramJSONObject.optInt("landing_type");
    this.m = paramJSONObject.optString("icon");
    this.n = paramJSONObject.optString("platform");
    this.o = paramJSONObject.optString("provider");
    this.p = paramJSONObject.optString("ad_words");
    this.q = paramJSONObject.optString("url");
    this.r = paramJSONObject.optString("pic_resolution");
    this.s = paramJSONObject.optDouble("promoprice");
    this.t = paramJSONObject.optString("ismall");
    this.u = paramJSONObject.optInt("category");
    this.v = paramJSONObject.optDouble("price");
    this.w = paramJSONObject.optString("images");
    this.x = paramJSONObject.optString("act_pams");
    this.y = paramJSONObject.optString("filter");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */