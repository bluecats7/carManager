package cn.lanjie.pojo;


public class CustomerInfo {

  private long id;
  private String tel;
  private String status;
  private java.sql.Date registerDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public java.sql.Date getRegisterDate() {
    return registerDate;
  }

  public void setRegisterDate(java.sql.Date registerDate) {
    this.registerDate = registerDate;
  }

}
