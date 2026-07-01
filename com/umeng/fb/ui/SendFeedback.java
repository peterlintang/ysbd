package com.umeng.fb.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.umeng.common.b.g;
import com.umeng.fb.UMFeedbackService;
import com.umeng.fb.b.d;
import com.umeng.fb.f;
import com.umeng.fb.util.ActivityStarter;
import com.umeng.fb.util.FeedBackListener;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SendFeedback
  extends Activity
{
  static boolean a = true;
  private static final String b = SendFeedback.class.getName();
  public static ExecutorService executorService = Executors.newFixedThreadPool(3);
  private Spinner c;
  private Spinner d;
  private EditText e;
  private TextView f;
  private TextView g;
  private ImageButton h;
  private FeedBackListener i;
  private Map<String, String> j;
  private Map<String, String> k;
  private JSONObject l;
  
  private void a()
  {
    this.c = ((Spinner)findViewById(com.umeng.fb.b.c.a(this)));
    this.d = ((Spinner)findViewById(com.umeng.fb.b.c.b(this)));
    this.f = ((TextView)findViewById(com.umeng.fb.b.c.c(this)));
    if (ActivityStarter.useGoBackButton)
    {
      this.g = ((TextView)findViewById(com.umeng.fb.b.c.d(this)));
      this.g.setVisibility(0);
    }
    for (;;)
    {
      this.e = ((EditText)findViewById(com.umeng.fb.b.c.e(this)));
      this.h = ((ImageButton)findViewById(com.umeng.fb.b.c.f(this)));
      ArrayAdapter localArrayAdapter;
      if (this.c != null)
      {
        localArrayAdapter = new ArrayAdapter(this, 17367048, getResources().getStringArray(com.umeng.fb.b.a.a(this)));
        localArrayAdapter.setDropDownViewResource(17367049);
        this.c.setAdapter(localArrayAdapter);
      }
      if (this.d != null)
      {
        localArrayAdapter = new ArrayAdapter(this, 17367048, getResources().getStringArray(com.umeng.fb.b.a.b(this)));
        localArrayAdapter.setDropDownViewResource(17367049);
        this.d.setAdapter(localArrayAdapter);
      }
      if (this.h != null) {
        this.h.setOnClickListener(new e(this));
      }
      b();
      c();
      return;
      this.g = ((TextView)findViewById(com.umeng.fb.b.c.d(this)));
      this.g.setVisibility(4);
    }
  }
  
  private void b()
  {
    if (this.e != null) {
      this.e.setHint(getString(com.umeng.fb.b.e.d(this)));
    }
    if (this.f != null) {
      this.f.setText(getString(com.umeng.fb.b.e.e(this)));
    }
    if (this.g != null) {
      this.g.setText(getString(com.umeng.fb.b.e.f(this)));
    }
  }
  
  private void c()
  {
    String str1 = getIntent().getStringExtra("feedback_id");
    String str2;
    if ((str1 != null) && (this.e != null))
    {
      str2 = getSharedPreferences("feedback", 0).getString(str1, null);
      if (g.c(str2)) {}
    }
    try
    {
      str2 = new com.umeng.fb.a(new JSONArray(str2).getJSONObject(0)).a();
      this.e.setText(str2);
      com.umeng.fb.util.c.a(this, "feedback", str1);
      int m;
      if (this.c != null)
      {
        m = d();
        if (m != -1) {
          this.c.setSelection(m);
        }
      }
      if (this.d != null)
      {
        m = e();
        if (m != -1) {
          this.d.setSelection(m);
        }
      }
      f();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (f.h) {
          localException.printStackTrace();
        }
      }
    }
  }
  
  private int d()
  {
    return getSharedPreferences("UmengFb_Nums", 0).getInt("ageGroup", -1);
  }
  
  private int e()
  {
    return getSharedPreferences("UmengFb_Nums", 0).getInt("sex", -1);
  }
  
  private void f()
  {
    for (;;)
    {
      try
      {
        Object localObject = getSharedPreferences("UmengFb_Nums", 0);
        String str = ((SharedPreferences)localObject).getString("OtherAttrContext", "");
        localObject = ((SharedPreferences)localObject).getString("OtherAttrRemark", "");
        if ((str != null) && (str.length() > 0))
        {
          this.j = getMap(new JSONObject(str).getJSONObject("Json_OtherAttrContact"));
          if ((localObject != null) && (((String)localObject).length() > 0))
          {
            this.k = getMap(new JSONObject((String)localObject).getJSONObject("Json_OtherAttrRemark"));
            if (this.i == null) {
              break;
            }
            this.i.onResetFB(this, this.j, this.k);
          }
        }
        else
        {
          this.j = null;
          continue;
        }
        this.k = null;
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
        return;
      }
    }
  }
  
  public static JSONObject getJSON(Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    paramMap = new JSONObject();
    try
    {
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramMap.put((String)localEntry.getKey(), localEntry.getValue().toString());
      }
      return paramMap;
    }
    catch (Exception localException)
    {
      System.out.println(localException.getMessage());
    }
  }
  
  public static Map<String, String> getMap(JSONObject paramJSONObject)
  {
    try
    {
      Iterator localIterator = paramJSONObject.keys();
      HashMap localHashMap = new HashMap();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localHashMap.put(str, paramJSONObject.get(str).toString());
      }
      return localHashMap;
    }
    catch (JSONException paramJSONObject)
    {
      paramJSONObject.printStackTrace();
      return null;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(d.a(this));
    setFBListener(UMFeedbackService.fbListener);
    a();
    if (this.f != null)
    {
      this.f.setOnClickListener(new SendFeedback.b(this, null));
      if (this.e != null) {
        ((InputMethodManager)getSystemService("input_method")).toggleSoftInput(2, 0);
      }
    }
    if (this.g != null)
    {
      this.g.setOnClickListener(new SendFeedback.a(this, null));
      ((InputMethodManager)getSystemService("input_method")).toggleSoftInput(2, 0);
    }
  }
  
  protected void onPause()
  {
    try
    {
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(this.e.getWindowToken(), 0);
      super.onPause();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = b;
        localException.getMessage();
      }
    }
  }
  
  public void setFBListener(FeedBackListener paramFeedBackListener)
  {
    this.i = paramFeedBackListener;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\ui\SendFeedback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */