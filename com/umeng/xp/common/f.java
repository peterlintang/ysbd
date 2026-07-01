package com.umeng.xp.common;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class f
  extends Animation
{
  private final float a;
  private final float b;
  private float c;
  private float d;
  private Camera e;
  private boolean f;
  private boolean g;
  private final float h = 100.0F;
  
  public f(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
  }
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = this.a;
    f1 += (this.b - f1) * paramFloat;
    float f2 = this.c;
    float f3 = this.d;
    Camera localCamera = this.e;
    paramTransformation = paramTransformation.getMatrix();
    localCamera.save();
    if (this.f)
    {
      localCamera.translate(0.0F, 0.0F, (1.0F - paramFloat) * 100.0F);
      if (!this.g) {
        break label123;
      }
      localCamera.rotateX(f1);
    }
    for (;;)
    {
      localCamera.getMatrix(paramTransformation);
      localCamera.restore();
      paramTransformation.preTranslate(-f2, -f3);
      paramTransformation.postTranslate(f2, f3);
      return;
      localCamera.translate(0.0F, 0.0F, 100.0F * paramFloat);
      break;
      label123:
      localCamera.rotateY(f1);
    }
  }
  
  public void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    this.e = new Camera();
    if ((this.f) && (getDuration() > 0L)) {
      setStartOffset(getDuration());
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\common\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */