package com.ireadercity.b2.curlview;

final class d
{
  public double a = 0.0D;
  public double b = 0.0D;
  public double c = 0.0D;
  public double d = 0.0D;
  public double e = 0.0D;
  public double f;
  public double g;
  public double h = 1.0D;
  public double i = 1.0D;
  
  public d(a parama) {}
  
  public final void a(double paramDouble)
  {
    double d1 = Math.cos(paramDouble);
    paramDouble = Math.sin(paramDouble);
    double d2 = this.a;
    double d3 = this.b;
    double d4 = this.a;
    double d5 = -paramDouble;
    double d6 = this.b;
    this.a = (d2 * d1 + d3 * paramDouble);
    this.b = (d4 * d5 + d6 * d1);
    d2 = this.f;
    d3 = this.g;
    d4 = this.f;
    d5 = -paramDouble;
    d6 = this.g;
    this.f = (d2 * d1 + d3 * paramDouble);
    this.g = (d1 * d6 + d5 * d4);
  }
  
  public final void a(double paramDouble1, double paramDouble2)
  {
    this.a += paramDouble1;
    this.b += paramDouble2;
  }
  
  public final void a(d paramd)
  {
    this.a = paramd.a;
    this.b = paramd.b;
    this.c = paramd.c;
    this.d = paramd.d;
    this.e = paramd.e;
    this.f = paramd.f;
    this.g = paramd.g;
    this.h = paramd.h;
    this.i = paramd.i;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\curlview\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */