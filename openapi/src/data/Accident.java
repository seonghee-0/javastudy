package data;

public class Accident {
  
  private String occrrnc_dt;
  private int dth_dnv_cnt;
  
  public String getOccrrnc_dt() {
    return occrrnc_dt;
  }
  public void setOccrrnc_dt(String occrrnc_dt) {
    this.occrrnc_dt = occrrnc_dt;
  }
  public int getDth_dnv_cnt() {
    return dth_dnv_cnt;
  }
  public void setDth_dnv_cnt(int dth_dnv_cnt) {
    this.dth_dnv_cnt = dth_dnv_cnt;
  }
  public Accident() {}
  public Accident(String occrrnc_dt, int dth_dnv_cnt) {
    super();
    this.occrrnc_dt = occrrnc_dt;
    this.dth_dnv_cnt = dth_dnv_cnt;
  }
  

  
}
