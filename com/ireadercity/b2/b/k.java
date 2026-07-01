package com.ireadercity.b2.b;

import android.widget.ImageView;
import java.util.Stack;

final class k
{
  private Stack<m> b = new Stack();
  
  private k(g paramg) {}
  
  public final void a(ImageView paramImageView)
  {
    int i = 0;
    while (i < this.b.size()) {
      if (((m)this.b.get(i)).b == paramImageView) {
        this.b.remove(i);
      } else {
        i += 1;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */