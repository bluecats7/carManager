package cn.lanjie.pojo;


public class TranCar {

  private long tid;
  private long cid;
  private long kid;
  private String address;
  private String recipAddress;
  private java.sql.Date sendTime;
  private String name;
  private long weight;
  private long state;
  private java.sql.Date create;


  public long getTid() {
    return tid;
  }

  public void setTid(long tid) {
    this.tid = tid;
  }


  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }


  public long getKid() {
    return kid;
  }

  public void setKid(long kid) {
    this.kid = kid;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getRecipAddress() {
    return recipAddress;
  }

  public void setRecipAddress(String recipAddress) {
    this.recipAddress = recipAddress;
  }


  public java.sql.Date getSendTime() {
    return sendTime;
  }

  public void setSendTime(java.sql.Date sendTime) {
    this.sendTime = sendTime;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getWeight() {
    return weight;
  }

  public void setWeight(long weight) {
    this.weight = weight;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public java.sql.Date getCreate() {
    return create;
  }

  public void setCreate(java.sql.Date create) {
    this.create = create;
  }

}
