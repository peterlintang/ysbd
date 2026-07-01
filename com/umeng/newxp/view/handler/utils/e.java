package com.umeng.newxp.view.handler.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.ImageView;

public abstract class e
{
  private static final String a = "ImageWorker";
  private static final int b = 200;
  private static final int k = 0;
  private static final int l = 1;
  private static final int m = 2;
  private static final int n = 3;
  protected boolean c = false;
  protected Resources d;
  private b e;
  private b.a f;
  private Bitmap g;
  private boolean h = true;
  private boolean i = false;
  private final Object j = new Object();
  
  protected e(Context paramContext)
  {
    this.d = paramContext.getResources();
  }
  
  public static void a(ImageView paramImageView)
  {
    paramImageView = c(paramImageView);
    if (paramImageView != null) {
      paramImageView.a(true);
    }
  }
  
  private void a(ImageView paramImageView, Drawable paramDrawable)
  {
    if (this.h)
    {
      paramDrawable = new TransitionDrawable(new Drawable[] { new ColorDrawable(17170445), paramDrawable });
      paramImageView.setBackgroundDrawable(new BitmapDrawable(this.d, this.g));
      paramImageView.setImageDrawable(paramDrawable);
      paramDrawable.startTransition(200);
      return;
    }
    paramImageView.setImageDrawable(paramDrawable);
  }
  
  public static boolean b(Object paramObject, ImageView paramImageView)
  {
    paramImageView = c(paramImageView);
    if (paramImageView != null)
    {
      Object localObject = e.b.a(paramImageView);
      if ((localObject == null) || (!localObject.equals(paramObject))) {
        paramImageView.a(true);
      }
    }
    else
    {
      return true;
    }
    return false;
  }
  
  private static e.b c(ImageView paramImageView)
  {
    if (paramImageView != null)
    {
      paramImageView = paramImageView.getDrawable();
      if ((paramImageView instanceof e.a)) {
        return ((e.a)paramImageView).a();
      }
    }
    return null;
  }
  
  protected abstract Bitmap a(Object paramObject);
  
  protected void a()
  {
    if (this.e != null) {
      this.e.a();
    }
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.g = paramBitmap;
  }
  
  public void a(FragmentActivity paramFragmentActivity, String paramString)
  {
    this.f = new b.a(paramFragmentActivity, paramString);
    this.e = b.a(paramFragmentActivity.getSupportFragmentManager(), this.f);
    new e.c(this).c(new Object[] { Integer.valueOf(1) });
  }
  
  public void a(FragmentManager paramFragmentManager, b.a parama)
  {
    this.f = parama;
    this.e = b.a(paramFragmentManager, this.f);
    new e.c(this).c(new Object[] { Integer.valueOf(1) });
  }
  
  public void a(b.a parama)
  {
    this.f = parama;
    this.e = b.a(parama);
    new e.c(this).c(new Object[] { Integer.valueOf(1) });
  }
  
  public void a(Object paramObject, ImageView paramImageView)
  {
    a(paramObject, paramImageView, null);
  }
  
  public void a(Object paramObject, ImageView paramImageView, String paramString)
  {
    if (paramObject == null) {
      return;
    }
    if ((paramString != null) && (paramString.trim().length() > 0))
    {
      com.taobao.munion.p4p.statistics.model.a locala = new com.taobao.munion.p4p.statistics.model.a("");
      locala.a(paramString);
      if (paramObject != null) {
        locala.b((String)paramObject);
      }
      com.taobao.munion.p4p.statistics.a.a().b(locala);
    }
    if (this.e != null) {}
    for (paramString = this.e.a(String.valueOf(paramObject));; paramString = null)
    {
      if (paramString != null)
      {
        paramImageView.setImageDrawable(paramString);
        return;
      }
      if (!b(paramObject, paramImageView)) {
        break;
      }
      paramString = new e.b(this, paramImageView);
      paramImageView.setImageDrawable(new e.a(this.d, this.g, paramString));
      paramString.a(com.umeng.newxp.common.c.b.d, new Object[] { paramObject });
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  protected void b()
  {
    if (this.e != null) {
      this.e.b();
    }
  }
  
  public void b(int paramInt)
  {
    this.g = BitmapFactory.decodeResource(this.d, paramInt);
  }
  
  public void b(boolean paramBoolean)
  {
    this.i = paramBoolean;
    c(false);
  }
  
  protected void c()
  {
    if (this.e != null) {
      this.e.c();
    }
  }
  
  public void c(boolean paramBoolean)
  {
    synchronized (this.j)
    {
      this.c = paramBoolean;
      if (!this.c) {
        this.j.notifyAll();
      }
      return;
    }
  }
  
  protected void d()
  {
    if (this.e != null)
    {
      this.e.d();
      this.e = null;
    }
  }
  
  protected b f()
  {
    return this.e;
  }
  
  public void g()
  {
    new e.c(this).c(new Object[] { Integer.valueOf(0) });
  }
  
  public void h()
  {
    new e.c(this).c(new Object[] { Integer.valueOf(2) });
  }
  
  public void i()
  {
    new e.c(this).c(new Object[] { Integer.valueOf(3) });
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */