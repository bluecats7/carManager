package cn.lanjie.pojo;


public class Withdraw {

  private long account;
  private String name;
  private double money;
  private String tel;
  private String status;
  private java.sql.Date applyTime;
  private String realName;
  private String remark;


  public long getAccount() {
    return account;
  }

  public void setAccount(long account) {
    this.account = account;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public java.sql.Date getApplyTime() {
    return applyTime;
  }

  public void setApplyTime(java.sql.Date applyTime) {
    this.applyTime = applyTime;
  }


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
