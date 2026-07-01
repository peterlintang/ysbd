package com.umeng.fb.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.umeng.common.b.g;
import com.umeng.fb.b.e;
import com.umeng.fb.util.ActivityStarter;
import com.umeng.fb.util.FeedBackListener;
import com.umeng.fb.util.b;
import com.umeng.fb.util.c;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

class SendFeedback$b
  implements View.OnClickListener
{
  private SendFeedback$b(SendFeedback paramSendFeedback) {}
  
  public void onClick(View paramView)
  {
    int j = -1;
    if (SendFeedback.a(this.a) != null) {}
    for (paramView = SendFeedback.a(this.a).getText().toString();; paramView = null)
    {
      if (g.c(paramView))
      {
        Toast.makeText(this.a, this.a.getString(e.a(this.a)), 0).show();
        return;
      }
      if (paramView.length() > 140)
      {
        Toast.makeText(this.a, this.a.getString(e.b(this.a)), 0).show();
        return;
      }
      if (SendFeedback.b(this.a) != null) {}
      for (int i = SendFeedback.b(this.a).getSelectedItemPosition();; i = -1)
      {
        if (SendFeedback.c(this.a) != null) {
          j = SendFeedback.c(this.a).getSelectedItemPosition();
        }
        JSONObject localJSONObject2;
        JSONObject localJSONObject3;
        if (SendFeedback.d(this.a) != null)
        {
          SendFeedback.d(this.a).onSubmitFB(this.a);
          SendFeedback.a(this.a, ActivityStarter.contactMap);
          SendFeedback.b(this.a, ActivityStarter.remarkMap);
          localJSONObject2 = new JSONObject();
          localJSONObject3 = new JSONObject();
          if (SendFeedback.e(this.a) == null) {
            break label630;
          }
        }
        label630:
        for (Object localObject = SendFeedback.getJSON(SendFeedback.e(this.a));; localObject = null)
        {
          if (SendFeedback.f(this.a) != null) {}
          for (JSONObject localJSONObject1 = SendFeedback.getJSON(SendFeedback.f(this.a));; localJSONObject1 = null)
          {
            if (localObject != null) {}
            try
            {
              localJSONObject2.put("Json_OtherAttrContact", localObject);
              if (localJSONObject1 != null) {
                localJSONObject3.put("Json_OtherAttrRemark", localJSONObject1);
              }
            }
            catch (Exception localException)
            {
              SharedPreferences.Editor localEditor;
              for (;;) {}
            }
            localEditor = this.a.getSharedPreferences("UmengFb_Nums", 0).edit();
            localEditor.putInt("ageGroup", i);
            localEditor.putInt("sex", j);
            if (localJSONObject2.length() > 0) {
              localEditor.putString("OtherAttrContext", localJSONObject2.toString());
            }
            if (localJSONObject3.length() > 0) {
              localEditor.putString("OtherAttrRemark", localJSONObject3.toString());
            }
            localEditor.commit();
            for (;;)
            {
              try
              {
                SendFeedback.a(this.a, b.a(this.a, paramView, i, j, (JSONObject)localObject, localJSONObject1));
                c.c(this.a, SendFeedback.g(this.a));
                paramView = new com.umeng.fb.a.f(SendFeedback.g(this.a), this.a);
                SendFeedback.executorService.submit(paramView);
                paramView = new Intent(this.a, FeedbackConversations.class).setFlags(131072);
                this.a.startActivity(paramView);
                ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(SendFeedback.a(this.a).getWindowToken(), 0);
                this.a.finish();
                return;
              }
              catch (Exception paramView)
              {
                if (com.umeng.fb.f.h) {
                  paramView.printStackTrace();
                }
                c.d(this.a, SendFeedback.g(this.a));
                return;
              }
              localObject = this.a.getSharedPreferences("UmengFb_Nums", 0).edit();
              ((SharedPreferences.Editor)localObject).putInt("ageGroup", i);
              ((SharedPreferences.Editor)localObject).putInt("sex", j);
              ((SharedPreferences.Editor)localObject).commit();
              try
              {
                SendFeedback.a(this.a, b.a(this.a, paramView, i, j, null, null));
              }
              catch (Exception paramView)
              {
                if (com.umeng.fb.f.h) {
                  paramView.printStackTrace();
                }
                c.d(this.a, SendFeedback.g(this.a));
                return;
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\SendFeedback$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */