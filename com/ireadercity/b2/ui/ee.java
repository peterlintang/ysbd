package com.ireadercity.b2.ui;

import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.ireadercity.b2.ui.widget.PDFView;
import com.ireadercity.b2.ui.widget.ScrollLayout_PDF;
import com.ireadercity.b2.ui.widget.g;

final class ee
  implements g
{
  ee(PDFViewerActivity paramPDFViewerActivity) {}
  
  public final void a()
  {
    if (PDFViewerActivity.a(this.a).getVisibility() == 0)
    {
      PDFViewerActivity.a(this.a).setVisibility(8);
      this.a.c();
      return;
    }
    PDFViewerActivity.a(this.a).setVisibility(0);
    PDFViewerActivity.a(this.a).requestFocus();
    this.a.b();
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    ((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).a(paramFloat1, paramFloat2, paramFloat3);
    ((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).invalidate();
  }
  
  public final void a(MotionEvent paramMotionEvent, boolean paramBoolean)
  {
    ((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).d();
    if (paramBoolean) {}
    for (float f = 1.0F;; f = ((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).c())
    {
      f = Math.min(((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).c(), Math.max(f, 0.6F));
      new StringBuilder("onDoubleTapm : mCurrentScaleFactor = ").append(f).toString();
      ((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).a(f, paramMotionEvent.getX(), paramMotionEvent.getY(), 300.0F);
      ((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).invalidate();
      return;
    }
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    ((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).a(paramMotionEvent);
    ((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).invalidate();
    return false;
  }
  
  public final void b()
  {
    ((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).f();
    ((PDFView)PDFViewerActivity.b(this.a).getChildAt(PDFViewerActivity.b(this.a).a())).invalidate();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */