package com.kgisl.parseexbeen;

import javax.sound.midi.Track;

/**
 * Giveup
 */
public class Giveup {

    private String TRADENUM;
    private String BS_IND;
    private String BROK_ID;
    private String PART_CODE;	 
    private String INST_TYPE;	 
    private String SYMBOL;	
    private String EXP_DATE;	 
    private String STR_PRICE;	 
    private String OPT_TYPE;	 
    private String TRD_QTY;	 
    private String TRD_PRICE; 
    private String GV_STS;	 
    private String OC_FLAG;	 
    private String CU_FLAG;	
    private String ORDER_NUM;	 
    private String LAST_MODIDT;	 
    private String RESERVED;

    /**
     * @return the tRADENUM
     */
    public String getTRADENUM() {
        return TRADENUM;
    }
    /**
     * @param tRADENUM the tRADENUM to set
     */
    public void setTRADENUM(String tRADENUM) {
        this.TRADENUM = tRADENUM;
    }
    /**
     * @return the bS_IND
     */
    public String getBS_IND() {
        return BS_IND;
    }
    /**
     * @param bS_IND the bS_IND to set
     */
    public void setBS_IND(String bS_IND) {
        this.BS_IND = bS_IND;
    }
    /**
     * @return the bROK_ID
     */
    public String getBROK_ID() {
        return BROK_ID;
    }
    /**
     * @param bROK_ID the bROK_ID to set
     */
    public void setBROK_ID(String bROK_ID) {
        this.BROK_ID = bROK_ID;
    }
    /**
     * @return the pART_CODE
     */
    public String getPART_CODE() {
        return PART_CODE;
    }
    /**
     * @param pART_CODE the pART_CODE to set
     */
    public void setPART_CODE(String pART_CODE) {
        this.PART_CODE = pART_CODE;
    }
    /**
     * @return the iNST_TYPE
     */
    public String getINST_TYPE() {
        return INST_TYPE;
    }
    /**
     * @param iNST_TYPE the iNST_TYPE to set
     */
    public void setINST_TYPE(String iNST_TYPE) {
        this.INST_TYPE = iNST_TYPE;
    }
    /**
     * @return the sYMBOL
     */
    public String getSYMBOL() {
        return SYMBOL;
    }
    /**
     * @param sYMBOL the sYMBOL to set
     */
    public void setSYMBOL(String sYMBOL) {
        this.SYMBOL = sYMBOL;
    }
    /**
     * @return the eXP_DATE
     */
    public String getEXP_DATE() {
        return EXP_DATE;
    }
    /**
     * @param eXP_DATE the eXP_DATE to set
     */
    public void setEXP_DATE(String eXP_DATE) {
        this.EXP_DATE = eXP_DATE;
    }
    /**
     * @return the sTR_PRICE
     */
    public String getSTR_PRICE() {
        return STR_PRICE;
    }
    /**
     * @param sTR_PRICE the sTR_PRICE to set
     */
    public void setSTR_PRICE(String sTR_PRICE) {
        this.STR_PRICE = sTR_PRICE;
    }
    /**
     * @return the oPT_TYPE
     */
    public String getOPT_TYPE() {
        return OPT_TYPE;
    }
    /**
     * @param oPT_TYPE the oPT_TYPE to set
     */
    public void setOPT_TYPE(String oPT_TYPE) {
        this.OPT_TYPE = oPT_TYPE;
    }
    /**
     * @return the tRD_QTY
     */
    public String getTRD_QTY() {
        return TRD_QTY;
    }
    /**
     * @param tRD_QTY the tRD_QTY to set
     */
    public void setTRD_QTY(String tRD_QTY) {
        this.TRD_QTY = tRD_QTY;
    }
    /**
     * @return the tRD_PRICE
     */
    public String getTRD_PRICE() {
        return TRD_PRICE;
    }
    /**
     * @param tRD_PRICE the tRD_PRICE to set
     */
    public void setTRD_PRICE(String tRD_PRICE) {
        this.TRD_PRICE = tRD_PRICE;
    }

    /**
     * @return the gV_STS
     */
    public String getGV_STS() {
        return GV_STS;
    }
    /**
     * @param gV_STS the gV_STS to set
     */
    public void setGV_STS(String gV_STS) {
        this.GV_STS = gV_STS;
    }
    /**
     * @return the oC_FLAG
     */
    public String getOC_FLAG() {
        return OC_FLAG;
    }
    /**
     * @param oC_FLAG the oC_FLAG to set
     */
    public void setOC_FLAG(String oC_FLAG) {
        this.OC_FLAG = oC_FLAG;
    }
    /**
     * @return the cU_FLAG
     */
    public String getCU_FLAG() {
        return CU_FLAG;
    }
    /**
     * @param cU_FLAG the cU_FLAG to set
     */
    public void setCU_FLAG(String cU_FLAG) {
        this.CU_FLAG = cU_FLAG;
    }
    /**
     * @return the oRDER_NUM
     */
    public String getORDER_NUM() {
        return ORDER_NUM;
    }
    /**
     * @param oRDER_NUM the oRDER_NUM to set
     */
    public void setORDER_NUM(String oRDER_NUM) {
        this.ORDER_NUM = oRDER_NUM;
    }
    /**
     * @return the lAST_MODIDT
     */
    public String getLAST_MODIDT() {
        return LAST_MODIDT;
    }
    /**
     * @param lAST_MODIDT the lAST_MODIDT to set
     */
    public void setLAST_MODIDT(String lAST_MODIDT) {
        this.LAST_MODIDT = lAST_MODIDT;
    }
    /**
     * @return the rESERVED
     */
    public String getRESERVED() {
        return RESERVED;
    }
    /**
     * @param rESERVED the rESERVED to set
     */
    public void setRESERVED(String rESERVED) {
        this.RESERVED = rESERVED;
    }
  @Override
  public String toString() {
      return "TRADENUM : "+ TRADENUM
      +", BS_IND: "+BS_IND 
      +", BROK_ID: "+BROK_ID 
      +", PART_CODE: "+PART_CODE 
      +", INST_TYPE: "+INST_TYPE 	 
      +", SYMBOL: "+SYMBOL 
      +", EXP_DATE: "+EXP_DATE 
      +", STR_PRICE: "+STR_PRICE 	 
      +", OPT_TYPE: "+OPT_TYPE 
      +", TRD_QTY: "+TRD_QTY 	 
      +", TRD_PRICE: "+TRD_PRICE 
      +", GV_STS: "+GV_STS 
      +", OC_FLAG: "+OC_FLAG 	 
      +", CU_FLAG: "+CU_FLAG 
      +", ORDER_NUM: "+ORDER_NUM 	 
      +", LAST_MODIDT: "+ LAST_MODIDT
      +", RESERVED: "+ RESERVED;
  }
  
}