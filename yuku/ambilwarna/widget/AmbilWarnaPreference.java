package yuku.ambilwarna.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;

public class AmbilWarnaPreference
  extends Preference
{
  int a;
  
  public AmbilWarnaPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setWidgetLayoutResource(2130903041);
  }
  
  protected void onBindView(View paramView)
  {
    super.onBindView(paramView);
    paramView = paramView.findViewById(2131361815);
    if (paramView != null) {
      paramView.setBackgroundColor(this.a);
    }
  }
  
  protected void onClick()
  {
    new yuku.ambilwarna.a(getContext(), this.a, new a(this)).c();
  }
  
  protected Object onGetDefaultValue(TypedArray paramTypedArray, int paramInt)
  {
    return Integer.valueOf(paramTypedArray.getInteger(paramInt, 0));
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!paramParcelable.getClass().equals(AmbilWarnaPreference.SavedState.class))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (AmbilWarnaPreference.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.a = paramParcelable.a;
    notifyChanged();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    Object localObject = super.onSaveInstanceState();
    if (isPersistent()) {
      return (Parcelable)localObject;
    }
    localObject = new AmbilWarnaPreference.SavedState((Parcelable)localObject);
    ((AmbilWarnaPreference.SavedState)localObject).a = this.a;
    return (Parcelable)localObject;
  }
  
  protected void onSetInitialValue(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean)
    {
      this.a = getPersistedInt(this.a);
      return;
    }
    int i = ((Integer)paramObject).intValue();
    this.a = i;
    persistInt(i);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\yuku\ambilwarna\widget\AmbilWarnaPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */