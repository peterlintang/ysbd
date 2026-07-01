package yuku.ambilwarna.widget;

import yuku.ambilwarna.h;

final class a
  implements h
{
  a(AmbilWarnaPreference paramAmbilWarnaPreference) {}
  
  public final void a(int paramInt)
  {
    if (!AmbilWarnaPreference.a(this.a, Integer.valueOf(paramInt))) {
      return;
    }
    this.a.a = paramInt;
    AmbilWarnaPreference.a(this.a, this.a.a);
    AmbilWarnaPreference.a(this.a);
  }
  
  public final void b(int paramInt)
  {
    this.a.a = paramInt;
    AmbilWarnaPreference.b(this.a, this.a.a);
    AmbilWarnaPreference.b(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\yuku\ambilwarna\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */