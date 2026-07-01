package com.umeng.newxp.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.umeng.newxp.b;
import com.umeng.newxp.c;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class a
  implements Parcelable
{
  public static final Parcelable.Creator<a> g = new a.1();
  public String a;
  public String b;
  public int c;
  public String d;
  public b e;
  public c f;
  private Set<a.a> h = new HashSet();
  
  private a(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readInt();
    this.e = b.a(paramParcel.readString());
    this.f = c.a(paramParcel.readString(), null);
    int j = paramParcel.readInt();
    int i = 0;
    while (i < j)
    {
      this.h.add(a.a.a(paramParcel.readString()));
      i += 1;
    }
  }
  
  public a(String paramString1, String paramString2, String paramString3, b paramb, c paramc)
  {
    this.a = paramString1;
    this.b = paramString2;
    paramString1 = paramString3;
    if (TextUtils.isEmpty(paramString3)) {
      paramString1 = "um_0";
    }
    this.d = paramString1;
    this.e = paramb;
    this.f = paramc;
    if (this.e == null) {
      this.e = b.a;
    }
    if (this.f == null) {
      this.f = c.a;
    }
  }
  
  public a(String paramString1, String paramString2, String paramString3, b paramb, c paramc, Set<a.a> paramSet)
  {
    this.a = paramString1;
    this.b = paramString2;
    paramString1 = paramString3;
    if (TextUtils.isEmpty(paramString3)) {
      paramString1 = "um_0";
    }
    this.d = paramString1;
    this.e = paramb;
    this.f = paramc;
    if (this.e == null) {
      this.e = b.a;
    }
    if (this.f == null) {
      this.f = c.a;
    }
    this.h = paramSet;
  }
  
  public Set<a.a> a()
  {
    return this.h;
  }
  
  public void a(a.a parama)
  {
    this.h.add(parama);
  }
  
  public void a(Collection<a.a> paramCollection)
  {
    this.h.addAll(paramCollection);
  }
  
  public void a(Set<a.a> paramSet)
  {
    this.h = paramSet;
  }
  
  public String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.h != null)
    {
      Iterator localIterator = this.h.iterator();
      while (localIterator.hasNext())
      {
        a.a locala = (a.a)localIterator.next();
        localStringBuilder.append(locala.toString() + ".");
      }
      if (localStringBuilder.length() > 0) {
        localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
      }
    }
    return localStringBuilder.toString();
  }
  
  public boolean b(a.a parama)
  {
    return this.h.contains(parama);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "Category [keyword=" + this.a + ", name=" + this.b + ", index=" + this.c + ", resType=" + this.e + ", template=" + this.f + ", attrs=" + this.h + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.e.toString());
    paramParcel.writeString(this.f.toString());
    paramParcel.writeInt(this.h.size());
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext()) {
      paramParcel.writeString(((a.a)localIterator.next()).toString());
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */