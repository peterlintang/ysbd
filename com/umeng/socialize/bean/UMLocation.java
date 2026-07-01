package com.umeng.socialize.bean;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class UMLocation
  implements Parcelable
{
  public static final Parcelable.Creator<UMLocation> CREATOR = new q();
  private double a;
  private double b;
  
  public UMLocation(double paramDouble1, double paramDouble2)
  {
    this.a = paramDouble1;
    this.b = paramDouble2;
  }
  
  private UMLocation(Parcel paramParcel)
  {
    this.a = paramParcel.readDouble();
    this.b = paramParcel.readDouble();
  }
  
  public static UMLocation build(Location paramLocation)
  {
    try
    {
      if ((paramLocation.getLatitude() != 0.0D) && (paramLocation.getLongitude() != 0.0D))
      {
        paramLocation = new UMLocation(paramLocation.getLatitude(), paramLocation.getLongitude());
        return paramLocation;
      }
    }
    catch (Exception paramLocation) {}
    return null;
  }
  
  public static UMLocation build(String paramString)
  {
    try
    {
      paramString = paramString.substring(1, paramString.length() - 1).split(",");
      paramString = new UMLocation(Double.parseDouble(paramString[1]), Double.parseDouble(paramString[0]));
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public double getLatitude()
  {
    return this.a;
  }
  
  public double getLongitude()
  {
    return this.b;
  }
  
  public void setLatitude(double paramDouble)
  {
    this.a = paramDouble;
  }
  
  public void setLongitude(double paramDouble)
  {
    this.b = paramDouble;
  }
  
  public String toString()
  {
    return "(" + this.b + "," + this.a + ")";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeDouble(this.a);
    paramParcel.writeDouble(this.b);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\UMLocation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */