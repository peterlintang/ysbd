package com.taobao.munion.net;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

public class t
  implements Parcelable
{
  public static final String a = "error_info";
  public static final int b = -1;
  public static final int c = -2;
  public static final int d = -3;
  public static final int e = -4;
  public static final int f = -5;
  public static final int g = -6;
  public static final int h = -7;
  public static final int i = -10;
  public static final int j = -50;
  public static final int k = -51;
  public static final int l = -52;
  public static final int m = -54;
  public static final int n = 720;
  public static final int o = 728;
  public static final Parcelable.Creator<t> p = new t.1();
  private int q = -1;
  private String r = "网络错误";
  
  private t(Parcel paramParcel)
  {
    a(paramParcel);
  }
  
  public t(JSONObject paramJSONObject)
  {
    a(paramJSONObject);
  }
  
  private void a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return;
    }
    this.r = paramJSONObject.optString("desc");
    try
    {
      this.q = Integer.parseInt(paramJSONObject.optString("code"));
      return;
    }
    catch (Exception paramJSONObject)
    {
      paramJSONObject.printStackTrace();
    }
  }
  
  public int a()
  {
    return this.q;
  }
  
  public void a(Parcel paramParcel)
  {
    this.q = paramParcel.readInt();
    this.r = paramParcel.readString();
  }
  
  public String b()
  {
    return this.r;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return this.q + " : " + this.r;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.q);
    paramParcel.writeString(this.r);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */