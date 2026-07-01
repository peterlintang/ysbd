package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomerWebView
  extends WebView
{
  private static int B = 10086;
  private volatile int A = 0;
  private boolean C = false;
  private float a;
  private float b;
  private float c;
  private float d;
  private long e;
  private volatile boolean f = false;
  private d g;
  private ClipboardManager h;
  private PopupWindow i;
  private volatile boolean j = false;
  private int k = 0;
  private int l = 0;
  private int m = 0;
  private Handler n;
  private Handler o;
  private ImageButton p;
  private ImageButton q;
  private ImageButton r;
  private ImageButton s;
  private View.OnClickListener t;
  private String u;
  private String v = "";
  private Method w;
  private Method x;
  private volatile boolean y = false;
  private volatile boolean z = false;
  
  public CustomerWebView(Context paramContext)
  {
    super(paramContext);
    d();
  }
  
  public CustomerWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    d();
  }
  
  public CustomerWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    d();
  }
  
  private void d()
  {
    setBackgroundColor(0);
    this.h = ((ClipboardManager)getContext().getSystemService("clipboard"));
    this.i = new PopupWindow(getContext());
    this.i.setWidth((int)(com.ireadercity.b2.a.D * 0.75D));
    this.i.setHeight(com.ireadercity.b2.a.E / 8);
    this.i.setBackgroundDrawable(null);
    this.i.setOutsideTouchable(true);
    View localView = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2130903127, null);
    this.t = new a(this);
    this.q = ((ImageButton)localView.findViewById(2131362218));
    this.s = ((ImageButton)localView.findViewById(2131362220));
    this.r = ((ImageButton)localView.findViewById(2131362219));
    this.p = ((ImageButton)localView.findViewById(2131362217));
    this.q.setOnClickListener(this.t);
    this.s.setOnClickListener(this.t);
    this.r.setOnClickListener(this.t);
    this.p.setOnClickListener(this.t);
    this.i.setContentView(localView);
    this.n = new b(this);
    this.o = new c(this);
  }
  
  private String e()
  {
    if ((Build.VERSION.SDK_INT > 8) && (Build.VERSION.SDK_INT < 14)) {}
    while (this.h == null) {
      try
      {
        if (this.w == null) {
          this.w = WebView.class.getMethod("getSelection", null);
        }
        String str = this.w.invoke(this, null);
        return str;
      }
      catch (SecurityException localSecurityException)
      {
        localSecurityException.printStackTrace();
        return "";
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;)
        {
          localNoSuchMethodException.printStackTrace();
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;)
        {
          localIllegalArgumentException.printStackTrace();
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;)
        {
          localIllegalAccessException.printStackTrace();
        }
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        for (;;)
        {
          localInvocationTargetException.printStackTrace();
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          localNullPointerException.printStackTrace();
        }
      }
    }
    return this.h.getText();
  }
  
  public final void a(d paramd)
  {
    this.g = paramd;
  }
  
  /* Error */
  public final void a(String paramString, int paramInt)
  {
    // Byte code:
    //   0: new 226	java/lang/StringBuilder
    //   3: dup
    //   4: ldc_w 269
    //   7: invokespecial 272	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   10: aload_1
    //   11: invokevirtual 275	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   17: pop
    //   18: aload_1
    //   19: ifnull +75 -> 94
    //   22: aload_1
    //   23: invokevirtual 280	java/lang/String:trim	()Ljava/lang/String;
    //   26: invokevirtual 284	java/lang/String:length	()I
    //   29: ifle +65 -> 94
    //   32: new 226	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 228	java/lang/StringBuilder:<init>	()V
    //   39: iload_2
    //   40: invokevirtual 287	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   43: ldc_w 289
    //   46: invokevirtual 275	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   49: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   52: pop
    //   53: aload_0
    //   54: aload_1
    //   55: putfield 87	com/ireadercity/b2/ui/widget/CustomerWebView:u	Ljava/lang/String;
    //   58: aload_0
    //   59: getfield 96	com/ireadercity/b2/ui/widget/CustomerWebView:i	Landroid/widget/PopupWindow;
    //   62: invokevirtual 292	android/widget/PopupWindow:dismiss	()V
    //   65: aload_1
    //   66: ifnull +13 -> 79
    //   69: aload_1
    //   70: invokevirtual 280	java/lang/String:trim	()Ljava/lang/String;
    //   73: invokevirtual 284	java/lang/String:length	()I
    //   76: ifgt +113 -> 189
    //   79: getstatic 214	android/os/Build$VERSION:SDK_INT	I
    //   82: istore_2
    //   83: iload_2
    //   84: bipush 8
    //   86: if_icmpgt +17 -> 103
    //   89: aload_0
    //   90: getfield 90	com/ireadercity/b2/ui/widget/CustomerWebView:g	Lcom/ireadercity/b2/ui/widget/d;
    //   93: astore_1
    //   94: return
    //   95: astore_3
    //   96: aload_3
    //   97: invokevirtual 293	java/lang/Exception:printStackTrace	()V
    //   100: goto -35 -> 65
    //   103: aload_0
    //   104: getfield 295	com/ireadercity/b2/ui/widget/CustomerWebView:x	Ljava/lang/reflect/Method;
    //   107: ifnonnull +16 -> 123
    //   110: aload_0
    //   111: ldc 4
    //   113: ldc_w 297
    //   116: aconst_null
    //   117: invokevirtual 224	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   120: putfield 295	com/ireadercity/b2/ui/widget/CustomerWebView:x	Ljava/lang/reflect/Method;
    //   123: aload_0
    //   124: getfield 295	com/ireadercity/b2/ui/widget/CustomerWebView:x	Ljava/lang/reflect/Method;
    //   127: aload_0
    //   128: aconst_null
    //   129: invokevirtual 234	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   132: pop
    //   133: aload_0
    //   134: iconst_0
    //   135: putfield 58	com/ireadercity/b2/ui/widget/CustomerWebView:j	Z
    //   138: goto -49 -> 89
    //   141: astore_1
    //   142: aload_1
    //   143: invokevirtual 246	java/lang/IllegalArgumentException:printStackTrace	()V
    //   146: goto -57 -> 89
    //   149: astore_1
    //   150: aload_1
    //   151: invokevirtual 244	java/lang/SecurityException:printStackTrace	()V
    //   154: goto -65 -> 89
    //   157: astore_1
    //   158: aload_1
    //   159: invokevirtual 247	java/lang/IllegalAccessException:printStackTrace	()V
    //   162: goto -73 -> 89
    //   165: astore_1
    //   166: aload_1
    //   167: invokevirtual 245	java/lang/NoSuchMethodException:printStackTrace	()V
    //   170: goto -81 -> 89
    //   173: astore_1
    //   174: aload_1
    //   175: invokevirtual 248	java/lang/reflect/InvocationTargetException:printStackTrace	()V
    //   178: goto -89 -> 89
    //   181: astore_1
    //   182: aload_1
    //   183: invokevirtual 249	java/lang/NullPointerException:printStackTrace	()V
    //   186: goto -97 -> 89
    //   189: iload_2
    //   190: i2f
    //   191: getstatic 130	com/ireadercity/b2/a:E	I
    //   194: i2f
    //   195: fconst_2
    //   196: fdiv
    //   197: fcmpl
    //   198: ifle +30 -> 228
    //   201: aload_0
    //   202: getfield 96	com/ireadercity/b2/ui/widget/CustomerWebView:i	Landroid/widget/PopupWindow;
    //   205: aload_0
    //   206: bipush 49
    //   208: iconst_0
    //   209: bipush 20
    //   211: invokevirtual 301	android/widget/PopupWindow:showAtLocation	(Landroid/view/View;III)V
    //   214: aload_0
    //   215: getfield 90	com/ireadercity/b2/ui/widget/CustomerWebView:g	Lcom/ireadercity/b2/ui/widget/d;
    //   218: astore_1
    //   219: return
    //   220: astore_1
    //   221: aload_1
    //   222: invokevirtual 302	android/view/WindowManager$BadTokenException:printStackTrace	()V
    //   225: goto -11 -> 214
    //   228: new 226	java/lang/StringBuilder
    //   231: dup
    //   232: ldc_w 304
    //   235: invokespecial 272	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   238: getstatic 130	com/ireadercity/b2/a:E	I
    //   241: i2d
    //   242: ldc2_w 305
    //   245: dmul
    //   246: d2i
    //   247: invokevirtual 287	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   250: invokevirtual 241	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   253: pop
    //   254: aload_0
    //   255: getfield 96	com/ireadercity/b2/ui/widget/CustomerWebView:i	Landroid/widget/PopupWindow;
    //   258: aload_0
    //   259: bipush 49
    //   261: iconst_0
    //   262: getstatic 130	com/ireadercity/b2/a:E	I
    //   265: i2d
    //   266: ldc2_w 305
    //   269: dmul
    //   270: d2i
    //   271: bipush 20
    //   273: isub
    //   274: invokevirtual 301	android/widget/PopupWindow:showAtLocation	(Landroid/view/View;III)V
    //   277: goto -63 -> 214
    //   280: astore_1
    //   281: aload_1
    //   282: invokevirtual 302	android/view/WindowManager$BadTokenException:printStackTrace	()V
    //   285: goto -71 -> 214
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	288	0	this	CustomerWebView
    //   0	288	1	paramString	String
    //   0	288	2	paramInt	int
    //   95	2	3	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   53	65	95	java/lang/Exception
    //   103	123	141	java/lang/IllegalArgumentException
    //   123	138	141	java/lang/IllegalArgumentException
    //   79	83	149	java/lang/SecurityException
    //   103	123	149	java/lang/SecurityException
    //   123	138	149	java/lang/SecurityException
    //   142	146	149	java/lang/SecurityException
    //   158	162	149	java/lang/SecurityException
    //   174	178	149	java/lang/SecurityException
    //   182	186	149	java/lang/SecurityException
    //   103	123	157	java/lang/IllegalAccessException
    //   123	138	157	java/lang/IllegalAccessException
    //   79	83	165	java/lang/NoSuchMethodException
    //   103	123	165	java/lang/NoSuchMethodException
    //   123	138	165	java/lang/NoSuchMethodException
    //   142	146	165	java/lang/NoSuchMethodException
    //   158	162	165	java/lang/NoSuchMethodException
    //   174	178	165	java/lang/NoSuchMethodException
    //   182	186	165	java/lang/NoSuchMethodException
    //   103	123	173	java/lang/reflect/InvocationTargetException
    //   123	138	173	java/lang/reflect/InvocationTargetException
    //   103	123	181	java/lang/NullPointerException
    //   123	138	181	java/lang/NullPointerException
    //   201	214	220	android/view/WindowManager$BadTokenException
    //   254	277	280	android/view/WindowManager$BadTokenException
  }
  
  public final boolean a()
  {
    return this.i.isShowing();
  }
  
  public final void b()
  {
    if (this.i != null) {
      this.i.dismiss();
    }
  }
  
  public final void c()
  {
    if ((this.j) || (Build.VERSION.SDK_INT >= 14)) {
      return;
    }
    ((Vibrator)getContext().getSystemService("vibrator")).vibrate(new long[] { 50L, 30L }, -1);
    if (Build.VERSION.SDK_INT > 8) {}
    for (;;)
    {
      try
      {
        emulateShiftHeld();
        d locald = this.g;
        this.j = true;
        this.m += 1;
        return;
      }
      catch (Exception localException1)
      {
        localException1.printStackTrace();
        new KeyEvent(0L, 0L, 0, 59, 0, 0).dispatch(this);
        continue;
      }
      if (Build.VERSION.SDK_INT > 8) {
        continue;
      }
      try
      {
        new KeyEvent(0L, 0L, 0, 59, 0, 0).dispatch(this);
      }
      catch (Exception localException2)
      {
        throw new AssertionError(localException2);
      }
    }
  }
  
  public void emulateShiftHeld()
  {
    super.emulateShiftHeld();
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.g != null) {
      this.g.d();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.g != null) {
      this.g.e();
    }
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      try
      {
        boolean bool = super.onTouchEvent(paramMotionEvent);
        return bool;
      }
      catch (NullPointerException paramMotionEvent)
      {
        Message localMessage;
        paramMotionEvent.printStackTrace();
      }
      this.A = 0;
      this.y = true;
      this.z = false;
      if (com.ireadercity.b2.a.X) {
        this.o.sendEmptyMessageDelayed(B, 1000L);
      }
      this.c = paramMotionEvent.getX();
      this.d = paramMotionEvent.getY();
      this.e = System.currentTimeMillis();
      continue;
      this.a = (paramMotionEvent.getX() - this.c);
      this.b = (paramMotionEvent.getY() - this.d);
      this.A += 1;
      if ((this.A > 3) && ((Math.abs(this.a) >= 10.0F) || (Math.abs(this.b) >= 10.0F)))
      {
        this.f = true;
        continue;
        this.a = (paramMotionEvent.getX() - this.c);
        this.b = (paramMotionEvent.getY() - this.d);
        this.e = (System.currentTimeMillis() - this.e);
        if ((this.m > 0) && (Build.VERSION.SDK_INT <= 8) && (com.ireadercity.b2.a.X))
        {
          if (this.h != null) {
            this.h.setText(null);
          }
          this.m = 0;
          localMessage = this.n.obtainMessage();
          localMessage.obj = this.h.getText();
          this.n.sendMessageDelayed(localMessage, 100L);
        }
        if ((!this.j) && (Math.abs(this.a) < 10.0F) && (Math.abs(this.b) < 10.0F) && (this.e > 50L) && (this.c < com.ireadercity.b2.a.D * 0.66F) && (this.c > com.ireadercity.b2.a.D * 0.33F))
        {
          this.i.dismiss();
          this.g.a();
        }
        for (;;)
        {
          if (com.ireadercity.b2.a.X)
          {
            if ((Build.VERSION.SDK_INT > 8) && (Build.VERSION.SDK_INT < 14) && (this.f) && (!this.v.equals(e())))
            {
              this.v = e();
              a(this.v, (int)this.d);
            }
            this.o.removeMessages(B);
          }
          this.a = 0.0F;
          this.b = 0.0F;
          this.c = 0.0F;
          this.f = false;
          this.j = false;
          this.z = true;
          this.y = false;
          this.A = 0;
          break;
          if ((!this.j) && (this.b >= 10.0F) && (getScrollY() == 0))
          {
            this.l += 1;
            if (this.l > 1)
            {
              this.g.b();
              this.l = 0;
            }
            this.i.dismiss();
          }
          else if ((!this.j) && (this.b < -10.0F) && (getContentHeight() * getScale() == getHeight() + getScrollY()))
          {
            this.k += 1;
            if (this.k > 1)
            {
              this.g.c();
              this.k = 0;
            }
            this.i.dismiss();
          }
          else
          {
            this.i.dismiss();
          }
        }
      }
    }
    return false;
  }
  
  public void setBackgroundColor(int paramInt)
  {
    super.setBackgroundColor(0);
  }
  
  public boolean zoomIn()
  {
    return false;
  }
  
  public boolean zoomOut()
  {
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\CustomerWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */