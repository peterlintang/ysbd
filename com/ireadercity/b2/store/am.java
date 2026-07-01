package com.ireadercity.b2.store;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Toast;
import com.ireadercity.b2.a.h;
import java.util.List;

final class am
  extends Handler
{
  am(ak paramak) {}
  
  public final void handleMessage(Message paramMessage)
  {
    new StringBuilder("handleMessage message.what=").append(paramMessage.what).toString();
    switch (paramMessage.what)
    {
    }
    label302:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              paramMessage = (String)paramMessage.obj;
              new StringBuilder("output=").append(paramMessage).toString();
              List localList = ak.b(paramMessage);
              paramMessage = ak.e(this.a).getResources().getString(2131230909);
              if (localList.size() == 0) {
                paramMessage = ak.e(this.a).getResources().getString(2131230910);
              }
              for (;;)
              {
                ak.g(this.a).setText(paramMessage);
                ak.g(this.a).show();
                new StringBuilder().append(ak.h(this.a)).append("requestPageNumber").toString();
                switch (ak.i(this.a) / 10)
                {
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                default: 
                  return;
                case 1: 
                  CloudStoreActivity.a.a.setVisibility(8);
                  if ((localList.size() != 0) || (ak.h(this.a) != 2)) {
                    break label302;
                  }
                  CloudStoreActivity.a.g.setVisibility(0);
                  return;
                  ak.b(this.a).addAll(localList);
                  ak.f(this.a).notifyDataSetChanged();
                }
              }
              CloudStoreActivity.a.g.setVisibility(8);
              return;
              CloudStoreActivity.a.b.setVisibility(8);
              if ((localList.size() == 0) && (ak.h(this.a) == 2))
              {
                CloudStoreActivity.a.h.setVisibility(0);
                return;
              }
              CloudStoreActivity.a.h.setVisibility(8);
              return;
              CloudStoreActivity.a.e.setVisibility(8);
              if ((localList.size() == 0) && (ak.h(this.a) == 2))
              {
                CloudStoreActivity.a.k.setVisibility(0);
                return;
              }
              CloudStoreActivity.a.k.setVisibility(8);
              return;
              CloudStoreActivity.a.c.setVisibility(8);
              if ((localList.size() == 0) && (ak.h(this.a) == 2))
              {
                CloudStoreActivity.a.i.setVisibility(0);
                return;
              }
              CloudStoreActivity.a.i.setVisibility(8);
              return;
              CloudStoreActivity.a.f.setVisibility(8);
              if ((localList.size() == 0) && (ak.h(this.a) == 2))
              {
                CloudStoreActivity.a.l.setVisibility(0);
                return;
              }
              CloudStoreActivity.a.l.setVisibility(8);
              return;
              ((Exception)paramMessage.obj).printStackTrace();
              switch (ak.i(this.a) / 10)
              {
              case 5: 
              case 6: 
              case 7: 
              case 8: 
              default: 
                return;
              case 1: 
                CloudStoreActivity.a.a.setVisibility(8);
              }
            } while (ak.h(this.a) != 2);
            CloudStoreActivity.a.g.setVisibility(0);
            return;
            CloudStoreActivity.a.b.setVisibility(8);
          } while (ak.h(this.a) != 2);
          CloudStoreActivity.a.h.setVisibility(0);
          return;
          CloudStoreActivity.a.e.setVisibility(8);
        } while (ak.h(this.a) != 2);
        CloudStoreActivity.a.k.setVisibility(0);
        return;
        CloudStoreActivity.a.c.setVisibility(8);
      } while (ak.h(this.a) != 2);
      CloudStoreActivity.a.i.setVisibility(0);
      return;
      CloudStoreActivity.a.f.setVisibility(8);
    } while (ak.h(this.a) != 2);
    CloudStoreActivity.a.l.setVisibility(0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */