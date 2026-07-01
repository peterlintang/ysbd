package org.mozilla.intl.chardet;

public abstract class nsPSMDetector
{
  public static final int ALL = 0;
  public static final int CHINESE = 2;
  public static final int JAPANESE = 1;
  public static final int KOREAN = 5;
  public static final int MAX_VERIFIERS = 16;
  public static final int NO_OF_LANGUAGES = 6;
  public static final int SIMPLIFIED_CHINESE = 3;
  public static final int TRADITIONAL_CHINESE = 4;
  int mClassItems;
  boolean mClassRunSampler;
  boolean mDone;
  int[] mItemIdx = new int[16];
  int mItems;
  boolean mRunSampler;
  nsEUCSampler mSampler = new nsEUCSampler();
  byte[] mState = new byte[16];
  nsEUCStatistics[] mStatisticsData;
  nsVerifier[] mVerifier;
  
  public nsPSMDetector()
  {
    initVerifiers(0);
    Reset();
  }
  
  public nsPSMDetector(int paramInt)
  {
    initVerifiers(paramInt);
    Reset();
  }
  
  public nsPSMDetector(int paramInt, nsVerifier[] paramArrayOfnsVerifier, nsEUCStatistics[] paramArrayOfnsEUCStatistics)
  {
    if (paramArrayOfnsEUCStatistics != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.mClassRunSampler = bool;
      this.mStatisticsData = paramArrayOfnsEUCStatistics;
      this.mVerifier = paramArrayOfnsVerifier;
      this.mClassItems = paramInt;
      Reset();
      return;
    }
  }
  
  public void DataEnd()
  {
    if (this.mDone == true) {}
    for (;;)
    {
      return;
      if (this.mItems == 2)
      {
        if (!this.mVerifier[this.mItemIdx[0]].charset().equals("GB18030")) {
          break label77;
        }
        Report(this.mVerifier[this.mItemIdx[1]].charset());
        this.mDone = true;
      }
      while (this.mRunSampler)
      {
        Sample(null, 0, true);
        return;
        label77:
        if (this.mVerifier[this.mItemIdx[1]].charset().equals("GB18030"))
        {
          Report(this.mVerifier[this.mItemIdx[0]].charset());
          this.mDone = true;
        }
      }
    }
  }
  
  public boolean HandleData(byte[] paramArrayOfByte, int paramInt)
  {
    int k = 0;
    while (k < paramInt)
    {
      byte b = paramArrayOfByte[k];
      int j = 0;
      while (j < this.mItems)
      {
        int i = nsVerifier.getNextState(this.mVerifier[this.mItemIdx[j]], b, this.mState[j]);
        if (i == 2)
        {
          Report(this.mVerifier[this.mItemIdx[j]].charset());
          this.mDone = true;
          return this.mDone;
        }
        if (i == 1)
        {
          this.mItems -= 1;
          if (j < this.mItems)
          {
            this.mItemIdx[j] = this.mItemIdx[this.mItems];
            this.mState[j] = this.mState[this.mItems];
          }
        }
        else
        {
          this.mState[j] = i;
          j += 1;
        }
      }
      if (this.mItems <= 1)
      {
        if (1 == this.mItems) {
          Report(this.mVerifier[this.mItemIdx[0]].charset());
        }
        this.mDone = true;
        return this.mDone;
      }
      int i1 = 0;
      int m = 0;
      j = 0;
      while (j < this.mItems)
      {
        int i2 = i1;
        int n = m;
        if (!this.mVerifier[this.mItemIdx[j]].isUCS2())
        {
          i2 = i1;
          n = m;
          if (!this.mVerifier[this.mItemIdx[j]].isUCS2())
          {
            n = m + 1;
            i2 = j;
          }
        }
        j += 1;
        i1 = i2;
        m = n;
      }
      if (1 == m)
      {
        Report(this.mVerifier[this.mItemIdx[i1]].charset());
        this.mDone = true;
        return this.mDone;
      }
      k += 1;
    }
    if (this.mRunSampler) {
      Sample(paramArrayOfByte, paramInt);
    }
    return this.mDone;
  }
  
  public abstract void Report(String paramString);
  
  public void Reset()
  {
    this.mRunSampler = this.mClassRunSampler;
    this.mDone = false;
    this.mItems = this.mClassItems;
    int i = 0;
    while (i < this.mItems)
    {
      this.mState[i] = 0;
      this.mItemIdx[i] = i;
      i += 1;
    }
    this.mSampler.Reset();
  }
  
  public void Sample(byte[] paramArrayOfByte, int paramInt)
  {
    Sample(paramArrayOfByte, paramInt, false);
  }
  
  public void Sample(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    int m = 0;
    int i = 0;
    int k;
    int n;
    for (int j = 0; i < this.mItems; j = n)
    {
      k = m;
      if (this.mStatisticsData[this.mItemIdx[i]] != null) {
        k = m + 1;
      }
      n = j;
      if (!this.mVerifier[this.mItemIdx[i]].isUCS2())
      {
        n = j;
        if (!this.mVerifier[this.mItemIdx[i]].charset().equals("GB18030")) {
          n = j + 1;
        }
      }
      i += 1;
      m = k;
    }
    boolean bool;
    if (m > 1)
    {
      bool = true;
      this.mRunSampler = bool;
      if (!this.mRunSampler) {
        break label401;
      }
      this.mRunSampler = this.mSampler.Sample(paramArrayOfByte, paramInt);
      if (((!paramBoolean) || (!this.mSampler.GetSomeData())) && ((!this.mSampler.EnoughData()) || (m != j))) {
        break label401;
      }
      this.mSampler.CalFreq();
      paramInt = -1;
      float f1 = 0.0F;
      j = 0;
      i = 0;
      label199:
      if (j >= this.mItems) {
        break label374;
      }
      if ((this.mStatisticsData[this.mItemIdx[j]] == null) || (this.mVerifier[this.mItemIdx[j]].charset().equals("Big5"))) {
        break label402;
      }
      float f2 = this.mSampler.GetScore(this.mStatisticsData[this.mItemIdx[j]].mFirstByteFreq(), this.mStatisticsData[this.mItemIdx[j]].mFirstByteWeight(), this.mStatisticsData[this.mItemIdx[j]].mSecondByteFreq(), this.mStatisticsData[this.mItemIdx[j]].mSecondByteWeight());
      k = i + 1;
      if ((i != 0) && (f1 <= f2)) {
        break label415;
      }
      f1 = f2;
      paramInt = k;
      i = j;
    }
    for (;;)
    {
      k = j + 1;
      j = i;
      i = paramInt;
      paramInt = j;
      j = k;
      break label199;
      bool = false;
      break;
      label374:
      if (paramInt >= 0)
      {
        Report(this.mVerifier[this.mItemIdx[paramInt]].charset());
        this.mDone = true;
      }
      label401:
      return;
      label402:
      k = paramInt;
      paramInt = i;
      i = k;
      continue;
      label415:
      i = paramInt;
      paramInt = k;
    }
  }
  
  public String[] getProbableCharsets()
  {
    int i = 0;
    if (this.mItems <= 0) {
      return new String[] { "nomatch" };
    }
    String[] arrayOfString = new String[this.mItems];
    while (i < this.mItems)
    {
      arrayOfString[i] = this.mVerifier[this.mItemIdx[i]].charset();
      i += 1;
    }
    return arrayOfString;
  }
  
  protected void initVerifiers(int paramInt)
  {
    boolean bool = false;
    int i;
    if (paramInt >= 0)
    {
      i = paramInt;
      if (paramInt < 6) {}
    }
    else
    {
      i = 0;
    }
    this.mVerifier = null;
    this.mStatisticsData = null;
    if (i == 4)
    {
      this.mVerifier = new nsVerifier[] { new nsUTF8Verifier(), new nsBIG5Verifier(), new nsISO2022CNVerifier(), new nsEUCTWVerifier(), new nsCP1252Verifier(), new nsUCS2BEVerifier(), new nsUCS2LEVerifier() };
      this.mStatisticsData = new nsEUCStatistics[] { null, new Big5Statistics(), null, new EUCTWStatistics(), null, null, null };
    }
    for (;;)
    {
      if (this.mStatisticsData != null) {
        bool = true;
      }
      this.mClassRunSampler = bool;
      this.mClassItems = this.mVerifier.length;
      return;
      if (i == 5)
      {
        this.mVerifier = new nsVerifier[] { new nsUTF8Verifier(), new nsEUCKRVerifier(), new nsISO2022KRVerifier(), new nsCP1252Verifier(), new nsUCS2BEVerifier(), new nsUCS2LEVerifier() };
      }
      else if (i == 3)
      {
        this.mVerifier = new nsVerifier[] { new nsUTF8Verifier(), new nsGB2312Verifier(), new nsGB18030Verifier(), new nsISO2022CNVerifier(), new nsHZVerifier(), new nsCP1252Verifier(), new nsUCS2BEVerifier(), new nsUCS2LEVerifier() };
      }
      else if (i == 1)
      {
        this.mVerifier = new nsVerifier[] { new nsUTF8Verifier(), new nsSJISVerifier(), new nsEUCJPVerifier(), new nsISO2022JPVerifier(), new nsCP1252Verifier(), new nsUCS2BEVerifier(), new nsUCS2LEVerifier() };
      }
      else if (i == 2)
      {
        this.mVerifier = new nsVerifier[] { new nsUTF8Verifier(), new nsGB2312Verifier(), new nsGB18030Verifier(), new nsBIG5Verifier(), new nsISO2022CNVerifier(), new nsHZVerifier(), new nsEUCTWVerifier(), new nsCP1252Verifier(), new nsUCS2BEVerifier(), new nsUCS2LEVerifier() };
        this.mStatisticsData = new nsEUCStatistics[] { null, new GB2312Statistics(), null, new Big5Statistics(), null, null, new EUCTWStatistics(), null, null, null };
      }
      else if (i == 0)
      {
        this.mVerifier = new nsVerifier[] { new nsUTF8Verifier(), new nsSJISVerifier(), new nsEUCJPVerifier(), new nsISO2022JPVerifier(), new nsEUCKRVerifier(), new nsISO2022KRVerifier(), new nsBIG5Verifier(), new nsEUCTWVerifier(), new nsGB2312Verifier(), new nsGB18030Verifier(), new nsISO2022CNVerifier(), new nsHZVerifier(), new nsCP1252Verifier(), new nsUCS2BEVerifier(), new nsUCS2LEVerifier() };
        this.mStatisticsData = new nsEUCStatistics[] { null, null, new EUCJPStatistics(), null, new EUCKRStatistics(), null, new Big5Statistics(), new EUCTWStatistics(), new GB2312Statistics(), null, null, null, null, null, null };
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\mozilla\intl\chardet\nsPSMDetector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */