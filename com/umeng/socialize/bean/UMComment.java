package com.umeng.socialize.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.umeng.socialize.c.b.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public class UMComment
  extends BaseMsg
  implements Parcelable
{
  public static final Parcelable.Creator<UMComment> CREATOR = new p();
  private static boolean b = false;
  private static List<Double[]> c;
  public long dt;
  public Gender gender;
  public String signature;
  public String uid;
  public String uname;
  public String user_icon;
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    c = localArrayList;
    localArrayList.add(new Double[] { Double.valueOf(39.90973623453719D), Double.valueOf(116.3671875D) });
    c.add(new Double[] { Double.valueOf(34.5D), Double.valueOf(112.916667D) });
    c.add(new Double[] { Double.valueOf(30.891465D), Double.valueOf(111.345027D) });
    c.add(new Double[] { Double.valueOf(41.257503D), Double.valueOf(114.834788D) });
    c.add(new Double[] { Double.valueOf(43.97681D), Double.valueOf(117.475441D) });
    c.add(new Double[] { Double.valueOf(22.596615D), Double.valueOf(114.304495D) });
    c.add(new Double[] { Double.valueOf(27.175D), Double.valueOf(78.042222D) });
    c.add(new Double[] { Double.valueOf(40.689167D), Double.valueOf(74.044444D) });
  }
  
  public UMComment() {}
  
  private UMComment(Parcel paramParcel)
  {
    super(paramParcel);
    this.user_icon = paramParcel.readString();
    this.uid = paramParcel.readString();
    this.uname = paramParcel.readString();
    this.signature = paramParcel.readString();
    this.dt = paramParcel.readLong();
    this.gender = Gender.convertToEmun(paramParcel.readString());
  }
  
  public static UMComment parseJson(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return null;
    }
    UMComment localUMComment = new UMComment();
    try
    {
      if (paramJSONObject.has("uname")) {
        localUMComment.uname = paramJSONObject.getString("uname");
      }
      if (paramJSONObject.has("ic")) {
        localUMComment.user_icon = paramJSONObject.getString("ic");
      }
      if (paramJSONObject.has("uid")) {
        localUMComment.uid = paramJSONObject.getString("uid");
      }
      if (paramJSONObject.has(c.s)) {
        localUMComment.text = paramJSONObject.getString(c.s);
      }
      if (paramJSONObject.has("dt")) {
        localUMComment.dt = paramJSONObject.getLong("dt");
      }
      if (paramJSONObject.has("gender"))
      {
        int i = paramJSONObject.optInt("gender", 0);
        localUMComment.gender = Gender.convertToEmun(i);
      }
      if (b)
      {
        paramJSONObject = (Double[])c.get(new Random().nextInt(c.size()));
        localUMComment.location = new UMLocation(paramJSONObject[0].doubleValue(), paramJSONObject[1].doubleValue());
      }
      else if (paramJSONObject.has(c.t))
      {
        localUMComment.location = UMLocation.build(paramJSONObject.getString(c.t));
      }
    }
    catch (JSONException paramJSONObject) {}
    return localUMComment;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.user_icon);
    paramParcel.writeString(this.uid);
    paramParcel.writeString(this.uname);
    paramParcel.writeString(this.signature);
    paramParcel.writeLong(this.dt);
    if (this.gender == null) {}
    for (String str = "";; str = this.gender.toString())
    {
      paramParcel.writeString(str);
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\UMComment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */