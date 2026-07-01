package com.ireadercity.b2.opds;

import android.app.AlertDialog.Builder;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

final class c
  extends Handler
{
  c(OnlineBookStore paramOnlineBookStore) {}
  
  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return;
      this.a.q.setVisibility(4);
      this.a.a.setClickable(true);
      if (this.a.r != null)
      {
        this.a.p.setVisibility(0);
        if (this.a.v != null)
        {
          this.a.v.a();
          this.a.v = new g(this.a, this.a.r, this.a.s, this.a.y);
          this.a.f.setAdapter(this.a.v);
          this.a.f.setOnItemClickListener(this.a);
          return;
        }
        this.a.v = new g(this.a, this.a.r, this.a.s, this.a.y);
        this.a.f.setAdapter(this.a.v);
        this.a.f.setOnItemClickListener(this.a);
        return;
      }
      Toast.makeText(this.a, "没有找到任何文件", 0).show();
      return;
      try
      {
        Object localObject = (HttpURLConnection)new URL((String)paramMessage.obj).openConnection();
        ((HttpURLConnection)localObject).setRequestProperty("User-Agent", "iReader by YouLoft");
        ((HttpURLConnection)localObject).setAllowUserInteraction(true);
        ((HttpURLConnection)localObject).setDoInput(true);
        ((HttpURLConnection)localObject).setDoOutput(true);
        ((HttpURLConnection)localObject).setUseCaches(false);
        ((HttpURLConnection)localObject).setRequestMethod("POST");
        ((HttpURLConnection)localObject).connect();
        if (((HttpURLConnection)localObject).getResponseCode() == 401)
        {
          localObject = this.a.getLayoutInflater().inflate(2130903051, null);
          ((TextView)((View)localObject).findViewById(2131361898)).setVisibility(8);
          this.a.a((String)paramMessage.obj, (View)localObject).show();
          return;
        }
      }
      catch (MalformedURLException paramMessage)
      {
        paramMessage.printStackTrace();
        return;
      }
      catch (ProtocolException paramMessage)
      {
        paramMessage.printStackTrace();
        return;
      }
      catch (IOException paramMessage)
      {
        paramMessage.printStackTrace();
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\opds\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */