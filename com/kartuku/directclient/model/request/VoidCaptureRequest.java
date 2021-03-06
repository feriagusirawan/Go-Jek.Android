package com.kartuku.directclient.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.kartuku.directclient.model.Request;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VoidCaptureRequest
  extends Request
{
  private String ˊ;
  private String ˋ;
  private String ˎ;
  
  public String getIpgCaptureNo()
  {
    return this.ˎ;
  }
  
  public String getIpgGateway()
  {
    return this.ˊ;
  }
  
  public String getMerchantToken()
  {
    return this.merchantToken;
  }
  
  public String getTxnReference()
  {
    return this.ˋ;
  }
  
  public void setIpgCaptureNo(String paramString)
  {
    this.ˎ = paramString;
  }
  
  public void setIpgGateway(String paramString)
  {
    this.ˊ = paramString;
  }
  
  public void setMerchantToken(String paramString)
  {
    this.merchantToken = paramString;
  }
  
  public void setTxnReference(String paramString)
  {
    this.ˋ = paramString;
  }
}


/* Location:              /Users/michael/Downloads/dex2jar-2.0/GO_JEK.jar!/com/kartuku/directclient/model/request/VoidCaptureRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */