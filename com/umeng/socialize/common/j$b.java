package com.umeng.socialize.common;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.umeng.socom.Log;
import com.umeng.socom.b.g;
import com.umeng.socom.net.o.a;
import java.io.File;
import java.io.IOException;

public class j$b
{
  Context a;
  ImageView b;
  String c;
  j.a d;
  int e = -1;
  Animation f;
  j.d g = j.d.a;
  boolean h = false;
  boolean i = false;
  
  public j$b(Context paramContext, ImageView paramImageView, String paramString)
  {
    if ((paramContext == null) || (paramImageView == null) || (g.c(paramString))) {
      return;
    }
    this.a = paramContext;
    this.b = paramImageView;
    this.c = paramString;
  }
  
  private void a(Context paramContext, ImageView paramImageView, Drawable paramDrawable, boolean paramBoolean1, j.a parama, Animation paramAnimation, boolean paramBoolean2, int paramInt)
  {
    if ((paramDrawable == null) || (paramImageView == null))
    {
      if ((paramImageView != null) && (paramInt > 0)) {
        paramImageView.setImageResource(paramInt);
      }
      if (parama != null) {
        parama.a(o.a.b, null, paramDrawable);
      }
      Log.e(j.a(), "bind drawable failed. drawable [" + paramDrawable + "]  imageView[+" + paramImageView + "+]");
    }
    for (;;)
    {
      return;
      paramContext = paramDrawable;
      if (paramBoolean2) {
        paramContext = new BitmapDrawable(j.a(((BitmapDrawable)paramDrawable).getBitmap()));
      }
      if (paramBoolean1)
      {
        paramImageView.setBackgroundDrawable(paramContext);
        if (paramAnimation != null) {
          paramImageView.startAnimation(paramAnimation);
        }
      }
      try
      {
        paramImageView = j.b(this.a, this.c);
        if (parama == null) {
          continue;
        }
        parama.a(o.a.a, paramImageView, paramContext);
        return;
        paramImageView.setImageDrawable(paramContext);
      }
      catch (IOException paramImageView)
      {
        for (;;)
        {
          paramImageView.printStackTrace();
          paramImageView = null;
        }
      }
    }
  }
  
  private void a(Drawable paramDrawable)
  {
    if (paramDrawable == null)
    {
      new k(this).execute(new Object[0]);
      return;
    }
    a(this.a, this.b, paramDrawable, this.i, this.d, this.f, this.h, this.e);
  }
  
  public b a(int paramInt)
  {
    this.e = paramInt;
    return this;
  }
  
  public b a(Animation paramAnimation)
  {
    this.f = paramAnimation;
    return this;
  }
  
  public b a(j.a parama)
  {
    this.d = parama;
    return this;
  }
  
  public b a(j.d paramd)
  {
    this.g = paramd;
    return this;
  }
  
  public b a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    return this;
  }
  
  public void a()
  {
    Object localObject;
    Drawable localDrawable;
    try
    {
      File localFile = j.b(this.a, this.c);
      switch (b()[this.g.ordinal()])
      {
      default: 
        return;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Log.b(j.a(), "can't get from cache.", localIOException);
        if (this.d != null) {
          this.d.a(o.a.b, null, null);
        }
        localObject = null;
      }
      if (this.d != null)
      {
        this.d.a(j.d.b);
        this.d.a(j.c.a);
      }
      if ((localObject != null) && (((File)localObject).exists()))
      {
        localDrawable = Drawable.createFromPath(((File)localObject).getAbsolutePath());
        if (localDrawable == null) {
          ((File)localObject).delete();
        }
        a(this.a, this.b, localDrawable, this.i, this.d, this.f, this.h, this.e);
        return;
      }
      Log.b(j.a(), "cache is not exists");
      return;
    }
    if (this.d != null)
    {
      this.d.a(j.d.a);
      this.d.a(j.c.a);
    }
    if ((localObject != null) && (((File)localObject).exists()))
    {
      localDrawable = Drawable.createFromPath(((File)localObject).getAbsolutePath());
      if (localDrawable == null) {
        ((File)localObject).delete();
      }
      a(this.a, this.b, localDrawable, this.i, this.d, this.f, this.h, this.e);
      return;
    }
    a(null);
    return;
    if (this.d != null) {
      this.d.a(j.d.c);
    }
    a(null);
  }
  
  public b b(boolean paramBoolean)
  {
    this.i = paramBoolean;
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\common\j$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */