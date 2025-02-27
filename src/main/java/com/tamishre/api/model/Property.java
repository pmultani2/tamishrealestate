package com.tamishre.api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "property")
public class Property {
    @Id
    @Column(name = "ml_num", nullable = false, length = Integer.MAX_VALUE)
    private String mlNum;

    @Column(name = "number_of_photos")
    private Short numberOfPhotos;

    @Column(name = "class", length = 11)
    private String className;

    @OneToOne(mappedBy = "property", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Featured featured;

    @Column(name = "rm12_dc2_out", length = Integer.MAX_VALUE)
    private String rm12Dc2Out;

    @Column(name = "development_charges_paid_multi", length = Integer.MAX_VALUE)
    private String developmentChargesPaidMulti;

    @Column(name = "rm2_len", precision = 5, scale = 2)
    private BigDecimal rm2Len;

    @Column(name = "bsmt1_out", length = Integer.MAX_VALUE)
    private String bsmt1Out;

    @Column(name = "municipality_district", length = Integer.MAX_VALUE)
    private String municipalityDistrict;

    @Column(name = "water_feat4", length = Integer.MAX_VALUE)
    private String waterFeat4;

    @Column(name = "bsmt2_out", length = Integer.MAX_VALUE)
    private String bsmt2Out;

    @Column(name = "den_fr", length = Integer.MAX_VALUE)
    private String denFr;

    @Column(name = "rm7_dc3_out", length = Integer.MAX_VALUE)
    private String rm7Dc3Out;

    @Column(name = "water_acc_bldg1", length = Integer.MAX_VALUE)
    private String waterAccBldg1;

    @Column(name = "rm11_len", precision = 5, scale = 2)
    private BigDecimal rm11Len;

    @Column(name = "ass_year", precision = 4)
    private BigDecimal assYear;

    @Column(name = "a_c", length = Integer.MAX_VALUE)
    private String aC;

    @Column(name = "mmap_col", precision = 2)
    private BigDecimal mmapCol;

    @Column(name = "wcloset_t4lvl", length = Integer.MAX_VALUE)
    private String wclosetT4lvl;

    @Column(name = "rural_svc1", length = Integer.MAX_VALUE)
    private String ruralSvc1;

    @Column(name = "county", length = Integer.MAX_VALUE)
    private String county;

    @Column(name = "showing_requirements_multi", length = Integer.MAX_VALUE)
    private String showingRequirementsMulti;

    @Column(name = "rural_svc5", length = Integer.MAX_VALUE)
    private String ruralSvc5;

    @Column(name = "shoreline_exp", length = Integer.MAX_VALUE)
    private String shorelineExp;

    @Column(name = "level8", length = Integer.MAX_VALUE)
    private String level8;

    @Column(name = "uffi", length = Integer.MAX_VALUE)
    private String uffi;

    @Column(name = "rm2_dc3_out", length = Integer.MAX_VALUE)
    private String rm2Dc3Out;

    @Column(name = "area", length = Integer.MAX_VALUE)
    private String area;

    @Column(name = "access_prop1", length = Integer.MAX_VALUE)
    private String accessProp1;

    @Column(name = "easement_rest1", length = Integer.MAX_VALUE)
    private String easementRest1;

    @Column(name = "water_type", length = Integer.MAX_VALUE)
    private String waterType;

    @Column(name = "rm6_len", precision = 5, scale = 2)
    private BigDecimal rm6Len;

    @Column(name = "wcloset_t2lvl", length = Integer.MAX_VALUE)
    private String wclosetT2lvl;

    @Column(name = "rm8_len", precision = 5, scale = 2)
    private BigDecimal rm8Len;

    @Column(name = "tv", precision = 9)
    private BigDecimal tv;

    @Column(name = "rooms_plus", precision = 1)
    private BigDecimal roomsPlus;

    @Column(name = "rm11_dc1_out", length = Integer.MAX_VALUE)
    private String rm11Dc1Out;

    @Column(name = "pix_updt", length = Integer.MAX_VALUE)
    private String pixUpdt;

    @Column(name = "parcel_id", length = Integer.MAX_VALUE)
    private String parcelId;

    @Column(name = "rm9_wth", precision = 5, scale = 2)
    private BigDecimal rm9Wth;

    @Column(name = "wcloset_t1", precision = 1)
    private BigDecimal wclosetT1;

    @Column(name = "rm2_dc2_out", length = Integer.MAX_VALUE)
    private String rm2Dc2Out;

    @Column(name = "level3", length = Integer.MAX_VALUE)
    private String level3;

    @Column(name = "water_feat1", length = Integer.MAX_VALUE)
    private String waterFeat1;

    @Column(name = "prop_feat2_out", length = Integer.MAX_VALUE)
    private String propFeat2Out;

    @Column(name = "sqft", length = Integer.MAX_VALUE)
    private String sqft;

    @Column(name = "channel_name", length = Integer.MAX_VALUE)
    private String channelName;

    @Column(name = "rm10_dc1_out", length = Integer.MAX_VALUE)
    private String rm10Dc1Out;

    @Column(name = "wcloset_p2", precision = 1)
    private BigDecimal wclosetP2;

    @Column(name = "tot_park_spcs", precision = 5)
    private BigDecimal totParkSpcs;

    @Column(name = "shoreline1", length = Integer.MAX_VALUE)
    private String shoreline1;

    @Column(name = "wcloset_t3", precision = 1)
    private BigDecimal wclosetT3;

    @Column(name = "all_inc", length = Integer.MAX_VALUE)
    private String allInc;

    @Column(name = "outof_area", length = Integer.MAX_VALUE)
    private String outofArea;

    @Column(name = "laundry", length = Integer.MAX_VALUE)
    private String laundry;

    @Column(name = "heat_inc", length = Integer.MAX_VALUE)
    private String heatInc;

    @Column(name = "type_own_srch", length = Integer.MAX_VALUE)
    private String typeOwnSrch;

    @Column(name = "fpl_num", length = Integer.MAX_VALUE)
    private String fplNum;

    @Column(name = "level7", length = Integer.MAX_VALUE)
    private String level7;

    @Column(name = "spec_des6_out", length = Integer.MAX_VALUE)
    private String specDes6Out;

    @Column(name = "alt_power1", length = Integer.MAX_VALUE)
    private String altPower1;

    @Column(name = "roof_multi", length = Integer.MAX_VALUE)
    private String roofMulti;

    @Column(name = "disp_addr", length = Integer.MAX_VALUE)
    private String dispAddr;

    @Column(name = "pvt_ent", length = Integer.MAX_VALUE)
    private String pvtEnt;

    @Column(name = "idx_dt", length = Integer.MAX_VALUE)
    private String idxDt;

    @Column(name = "bath_tot", precision = 10, scale = 2)
    private BigDecimal bathTot;

    @Column(name = "rm8_dc3_out", length = Integer.MAX_VALUE)
    private String rm8Dc3Out;

    @Column(name = "st_dir", length = Integer.MAX_VALUE)
    private String stDir;

    @Column(name = "rm10_dc2_out", length = Integer.MAX_VALUE)
    private String rm10Dc2Out;

    @Column(name = "rm5_out", length = Integer.MAX_VALUE)
    private String rm5Out;

    @Column(name = "status", length = Integer.MAX_VALUE)
    private String status;

    @Column(name = "level9", length = Integer.MAX_VALUE)
    private String level9;

    @Column(name = "tour_url", length = Integer.MAX_VALUE)
    private String tourUrl;

    @Column(name = "fractional_ownership", length = Integer.MAX_VALUE)
    private String fractionalOwnership;

    @Column(name = "wcloset_p3", precision = 1)
    private BigDecimal wclosetP3;

    @Column(name = "zoning", length = Integer.MAX_VALUE)
    private String zoning;

    @Column(name = "fuel", length = Integer.MAX_VALUE)
    private String fuel;

    @Column(name = "access_prop2", length = Integer.MAX_VALUE)
    private String accessProp2;

    @Column(name = "shore_allow", length = Integer.MAX_VALUE)
    private String shoreAllow;

    @Column(name = "level6", length = Integer.MAX_VALUE)
    private String level6;

    @Column(name = "rm4_len", precision = 5, scale = 2)
    private BigDecimal rm4Len;

    @Column(name = "rm9_dc2_out", length = Integer.MAX_VALUE)
    private String rm9Dc2Out;

    @Column(name = "cross_st", length = Integer.MAX_VALUE)
    private String crossSt;

    @Column(name = "rm10_wth", precision = 5, scale = 2)
    private BigDecimal rm10Wth;

    @Column(name = "foundation_details_multi", length = Integer.MAX_VALUE)
    private String foundationDetailsMulti;

    @Column(name = "rm7_dc1_out", length = Integer.MAX_VALUE)
    private String rm7Dc1Out;

    @Column(name = "rm3_dc2_out", length = Integer.MAX_VALUE)
    private String rm3Dc2Out;

    @Column(name = "rm6_wth", precision = 5, scale = 2)
    private BigDecimal rm6Wth;

    @Column(name = "rm8_dc2_out", length = Integer.MAX_VALUE)
    private String rm8Dc2Out;

    @Column(name = "park_chgs", precision = 6, scale = 2)
    private BigDecimal parkChgs;

    @Column(name = "level11", length = Integer.MAX_VALUE)
    private String level11;

    @Column(name = "rm4_dc2_out", length = Integer.MAX_VALUE)
    private String rm4Dc2Out;

    @Column(name = "rm6_dc1_out", length = Integer.MAX_VALUE)
    private String rm6Dc1Out;

    @Column(name = "spec_des1_out", length = Integer.MAX_VALUE)
    private String specDes1Out;

    @Column(name = "alt_power2", length = Integer.MAX_VALUE)
    private String altPower2;

    @Column(name = "fireplaces_total", precision = 8)
    private BigDecimal fireplacesTotal;

    @Column(name = "docking_type_multi", length = Integer.MAX_VALUE)
    private String dockingTypeMulti;

    @Column(name = "rm9_out", length = Integer.MAX_VALUE)
    private String rm9Out;

    @Column(name = "spec_des2_out", length = Integer.MAX_VALUE)
    private String specDes2Out;

    @Column(name = "water_feat5", length = Integer.MAX_VALUE)
    private String waterFeat5;

    @Column(name = "easement_rest2", length = Integer.MAX_VALUE)
    private String easementRest2;

    @Column(name = "rm9_dc3_out", length = Integer.MAX_VALUE)
    private String rm9Dc3Out;

    @Column(name = "rm11_wth", precision = 5, scale = 2)
    private BigDecimal rm11Wth;

    @Column(name = "rm7_wth", precision = 5, scale = 2)
    private BigDecimal rm7Wth;

    @Column(name = "water_acc_bldg2", length = Integer.MAX_VALUE)
    private String waterAccBldg2;

    @Column(name = "rm4_dc1_out", length = Integer.MAX_VALUE)
    private String rm4Dc1Out;

    @Column(name = "style", length = Integer.MAX_VALUE)
    private String style;

    @Column(name = "mmap_row", length = Integer.MAX_VALUE)
    private String mmapRow;

    @Column(name = "retirement", length = Integer.MAX_VALUE)
    private String retirement;

    @Column(name = "vtour_updt", length = Integer.MAX_VALUE)
    private String vtourUpdt;

    @Column(name = "yr_built", length = Integer.MAX_VALUE)
    private String yrBuilt;

    @Column(name = "wcloset_t2", precision = 1)
    private BigDecimal wclosetT2;

    @Column(name = "furnished", length = Integer.MAX_VALUE)
    private String furnished;

    @Column(name = "water_inc", length = Integer.MAX_VALUE)
    private String waterInc;

    @Column(name = "spec_des3_out", length = Integer.MAX_VALUE)
    private String specDes3Out;

    @Column(name = "s_r", length = Integer.MAX_VALUE)
    private String sR;

    @Column(name = "elevator", length = Integer.MAX_VALUE)
    private String elevator;

    @Column(name = "constr1_out", length = Integer.MAX_VALUE)
    private String constr1Out;

    @Column(name = "rm2_out", length = Integer.MAX_VALUE)
    private String rm2Out;

    @Column(name = "wcloset_p5", precision = 1)
    private BigDecimal wclosetP5;

    @Column(name = "spec_des5_out", length = Integer.MAX_VALUE)
    private String specDes5Out;

    @Column(name = "community_code", length = Integer.MAX_VALUE)
    private String communityCode;

    @Column(name = "prkg_inc", length = Integer.MAX_VALUE)
    private String prkgInc;

    @Column(name = "wcloset_t1lvl", length = Integer.MAX_VALUE)
    private String wclosetT1lvl;

    @Column(name = "community", length = Integer.MAX_VALUE)
    private String community;

    @Column(name = "apt_num", length = Integer.MAX_VALUE)
    private String aptNum;

    @Column(name = "wcloset_p4", precision = 1)
    private BigDecimal wclosetP4;

    @Column(name = "rm1_dc3_out", length = Integer.MAX_VALUE)
    private String rm1Dc3Out;

    @Column(name = "portion_property_lease4_out", length = Integer.MAX_VALUE)
    private String portionPropertyLease4Out;

    @Column(name = "portion_lease_comments", length = Integer.MAX_VALUE)
    private String portionLeaseComments;

    @Column(name = "central_vac", length = Integer.MAX_VALUE)
    private String centralVac;

    @Column(name = "rm1_len", precision = 5, scale = 2)
    private BigDecimal rm1Len;

    @Column(name = "num_kit", precision = 1)
    private BigDecimal numKit;

    @Column(name = "rm12_len", precision = 5, scale = 2)
    private BigDecimal rm12Len;

    @Column(name = "rm11_dc2_out", length = Integer.MAX_VALUE)
    private String rm11Dc2Out;

    @Column(name = "type_own1_out", length = Integer.MAX_VALUE)
    private String typeOwn1Out;

    @Column(name = "kit_plus", precision = 1)
    private BigDecimal kitPlus;

    @Column(name = "water_view_multi", length = Integer.MAX_VALUE)
    private String waterViewMulti;

    @Column(name = "rm1_dc2_out", length = Integer.MAX_VALUE)
    private String rm1Dc2Out;

    @Column(name = "portion_property_lease_srch", length = Integer.MAX_VALUE)
    private String portionPropertyLeaseSrch;

    @Column(name = "easement_rest4", length = Integer.MAX_VALUE)
    private String easementRest4;

    @Column(name = "spec_des4_out", length = Integer.MAX_VALUE)
    private String specDes4Out;

    @Column(name = "rm6_out", length = Integer.MAX_VALUE)
    private String rm6Out;

    @Column(name = "rm9_dc1_out", length = Integer.MAX_VALUE)
    private String rm9Dc1Out;

    @Column(name = "rural_svc3", length = Integer.MAX_VALUE)
    private String ruralSvc3;

    @Column(name = "rm5_dc3_out", length = Integer.MAX_VALUE)
    private String rm5Dc3Out;

    @Column(name = "wcloset_p1", precision = 1)
    private BigDecimal wclosetP1;

    @Column(name = "level4", length = Integer.MAX_VALUE)
    private String level4;

    @Column(name = "rm11_out", length = Integer.MAX_VALUE)
    private String rm11Out;

    @Column(name = "level12", length = Integer.MAX_VALUE)
    private String level12;

    @Column(name = "br", precision = 10, scale = 2)
    private BigDecimal br;

    @Column(name = "taxes", precision = 8, scale = 2)
    private BigDecimal taxes;

    @Column(name = "prop_feat3_out", length = Integer.MAX_VALUE)
    private String propFeat3Out;

    @Column(name = "water_front_yn", length = Integer.MAX_VALUE)
    private String waterFrontYn;

    @Column(name = "rm3_dc1_out", length = Integer.MAX_VALUE)
    private String rm3Dc1Out;

    @Column(name = "rm8_dc1_out", length = Integer.MAX_VALUE)
    private String rm8Dc1Out;

    @Column(name = "rm10_out", length = Integer.MAX_VALUE)
    private String rm10Out;

    @Column(name = "rm10_len", precision = 5, scale = 2)
    private BigDecimal rm10Len;

    @Column(name = "wcloset_t5lvl", length = Integer.MAX_VALUE)
    private String wclosetT5lvl;

    @Column(name = "rm7_dc2_out", length = Integer.MAX_VALUE)
    private String rm7Dc2Out;

    @Column(name = "rms", precision = 2)
    private BigDecimal rms;

    @Column(name = "rm3_dc3_out", length = Integer.MAX_VALUE)
    private String rm3Dc3Out;

    @Column(name = "level10", length = Integer.MAX_VALUE)
    private String level10;

    @Column(name = "addr", length = Integer.MAX_VALUE)
    private String addr;

    @Column(name = "rm5_len", precision = 5, scale = 2)
    private BigDecimal rm5Len;

    @Column(name = "st", length = Integer.MAX_VALUE)
    private String st;

    @Column(name = "shoreline2", length = Integer.MAX_VALUE)
    private String shoreline2;

    @Column(name = "rm6_dc2_out", length = Integer.MAX_VALUE)
    private String rm6Dc2Out;

    @Column(name = "st_sfx", length = Integer.MAX_VALUE)
    private String stSfx;

    @Column(name = "mmap_page", precision = 3)
    private BigDecimal mmapPage;

    @Column(name = "municipality", length = Integer.MAX_VALUE)
    private String municipality;

    @Column(name = "park_spcs", precision = 4)
    private BigDecimal parkSpcs;

    @Column(name = "gar_type", length = Integer.MAX_VALUE)
    private String garType;

    @Column(name = "rltr", length = Integer.MAX_VALUE)
    private String rltr;

    @Column(name = "lease_to_own_equipment_multi", length = Integer.MAX_VALUE)
    private String leaseToOwnEquipmentMulti;

    @Column(name = "water_feat3", length = Integer.MAX_VALUE)
    private String waterFeat3;

    @Column(name = "interior_features_multi", length = Integer.MAX_VALUE)
    private String interiorFeaturesMulti;

    @Column(name = "rm5_dc1_out", length = Integer.MAX_VALUE)
    private String rm5Dc1Out;

    @Column(name = "cac_inc", length = Integer.MAX_VALUE)
    private String cacInc;

    @Column(name = "rm12_dc1_out", length = Integer.MAX_VALUE)
    private String rm12Dc1Out;

    @Column(name = "rm12_out", length = Integer.MAX_VALUE)
    private String rm12Out;

    @Column(name = "rm3_out", length = Integer.MAX_VALUE)
    private String rm3Out;

    @Column(name = "sewage1", length = Integer.MAX_VALUE)
    private String sewage1;

    @Column(name = "comel_inc", length = Integer.MAX_VALUE)
    private String comelInc;

    @Column(name = "heating", length = Integer.MAX_VALUE)
    private String heating;

    @Column(name = "rm3_wth", precision = 5, scale = 2)
    private BigDecimal rm3Wth;

    @Column(name = "br_plus", precision = 1)
    private BigDecimal brPlus;

    @Column(name = "wcloset_t3lvl", length = Integer.MAX_VALUE)
    private String wclosetT3lvl;

    @Column(name = "rm11_dc3_out", length = Integer.MAX_VALUE)
    private String rm11Dc3Out;

    @Column(name = "prop_feat5_out", length = Integer.MAX_VALUE)
    private String propFeat5Out;

    @Column(name = "rm12_dc3_out", length = Integer.MAX_VALUE)
    private String rm12Dc3Out;

    @Column(name = "laundry_lev", length = Integer.MAX_VALUE)
    private String laundryLev;

    @Column(name = "portion_property_lease2_out", length = Integer.MAX_VALUE)
    private String portionPropertyLease2Out;

    @Column(name = "topography_multi", length = Integer.MAX_VALUE)
    private String topographyMulti;

    @Column(name = "sewage2", length = Integer.MAX_VALUE)
    private String sewage2;

    @Column(name = "rm10_dc3_out", length = Integer.MAX_VALUE)
    private String rm10Dc3Out;

    @Column(name = "zip", length = Integer.MAX_VALUE)
    private String zip;

    @Column(name = "area_code", length = Integer.MAX_VALUE)
    private String areaCode;

    @Column(name = "hydro_inc", length = Integer.MAX_VALUE)
    private String hydroInc;

    @Column(name = "rm1_out", length = Integer.MAX_VALUE)
    private String rm1Out;

    @Column(name = "occ", length = Integer.MAX_VALUE)
    private String occ;

    @Column(name = "shoreline_multi", length = Integer.MAX_VALUE)
    private String shorelineMulti;

    @Column(name = "prop_feat1_out", length = Integer.MAX_VALUE)
    private String propFeat1Out;

    @Column(name = "wcloset_t4", precision = 1)
    private BigDecimal wclosetT4;

    @Column(name = "portion_property_lease3_out", length = Integer.MAX_VALUE)
    private String portionPropertyLease3Out;

    @Column(name = "water_del_feat1", length = Integer.MAX_VALUE)
    private String waterDelFeat1;

    @Column(name = "easement_rest3", length = Integer.MAX_VALUE)
    private String easementRest3;

    @Column(name = "rm1_wth", precision = 5, scale = 2)
    private BigDecimal rm1Wth;

    @Column(name = "ad_text", length = Integer.MAX_VALUE)
    private String adText;

    @Column(name = "water_body", length = Integer.MAX_VALUE)
    private String waterBody;

    @Column(name = "level1", length = Integer.MAX_VALUE)
    private String level1;

    @Column(name = "st_num", length = Integer.MAX_VALUE)
    private String stNum;

    @Column(name = "rm7_len", precision = 5, scale = 2)
    private BigDecimal rm7Len;

    @Column(name = "prop_feat6_out", length = Integer.MAX_VALUE)
    private String propFeat6Out;

    @Column(name = "extras", length = Integer.MAX_VALUE)
    private String extras;

    @Column(name = "yr", precision = 4)
    private BigDecimal yr;

    @Column(name = "rm12_wth", precision = 5, scale = 2)
    private BigDecimal rm12Wth;

    @Column(name = "rm4_wth", precision = 5, scale = 2)
    private BigDecimal rm4Wth;

    @Column(name = "water_del_feat2", length = Integer.MAX_VALUE)
    private String waterDelFeat2;

    @Column(name = "rm3_len", precision = 5, scale = 2)
    private BigDecimal rm3Len;

    @Column(name = "rm8_out", length = Integer.MAX_VALUE)
    private String rm8Out;

    @Column(name = "water_front", precision = 6, scale = 2)
    private BigDecimal waterFront;

    @Column(name = "rm5_dc2_out", length = Integer.MAX_VALUE)
    private String rm5Dc2Out;

    @Column(name = "prop_feat4_out", length = Integer.MAX_VALUE)
    private String propFeat4Out;

    @Column(name = "municipality_code", length = Integer.MAX_VALUE)
    private String municipalityCode;

    @Column(name = "level5", length = Integer.MAX_VALUE)
    private String level5;

    @Column(name = "rural_svc2", length = Integer.MAX_VALUE)
    private String ruralSvc2;

    @Column(name = "rm7_out", length = Integer.MAX_VALUE)
    private String rm7Out;

    @Column(name = "hst_application_multi", length = Integer.MAX_VALUE)
    private String hstApplicationMulti;

    @Column(name = "rm6_dc3_out", length = Integer.MAX_VALUE)
    private String rm6Dc3Out;

    @Column(name = "rm9_len", precision = 5, scale = 2)
    private BigDecimal rm9Len;

    @Column(name = "rm2_dc1_out", length = Integer.MAX_VALUE)
    private String rm2Dc1Out;

    @Column(name = "fireplace_features_multi", length = Integer.MAX_VALUE)
    private String fireplaceFeaturesMulti;

    @Column(name = "water_feat2", length = Integer.MAX_VALUE)
    private String waterFeat2;

    @Column(name = "level2", length = Integer.MAX_VALUE)
    private String level2;

    @Column(name = "rm8_wth", precision = 5, scale = 2)
    private BigDecimal rm8Wth;

    @Column(name = "wcloset_t5", precision = 1)
    private BigDecimal wclosetT5;

    @Column(name = "assignment", length = Integer.MAX_VALUE)
    private String assignment;

    @Column(name = "rm1_dc1_out", length = Integer.MAX_VALUE)
    private String rm1Dc1Out;

    @Column(name = "portion_property_lease1_out", length = Integer.MAX_VALUE)
    private String portionPropertyLease1Out;

    @Column(name = "lp_dol", precision = 11, scale = 2)
    private BigDecimal lpDol;

    @Column(name = "constr2_out", length = Integer.MAX_VALUE)
    private String constr2Out;

    @Column(name = "rm2_wth", precision = 5, scale = 2)
    private BigDecimal rm2Wth;

    @Column(name = "rm4_dc3_out", length = Integer.MAX_VALUE)
    private String rm4Dc3Out;

    @Column(name = "rm4_out", length = Integer.MAX_VALUE)
    private String rm4Out;

    @Column(name = "rm5_wth", precision = 5, scale = 2)
    private BigDecimal rm5Wth;

    @Column(name = "rural_svc4", length = Integer.MAX_VALUE)
    private String ruralSvc4;

    @Column(name = "timestamp_sql", length = Integer.MAX_VALUE)
    private String timestampSql;

    @Column(name = "cable", length = Integer.MAX_VALUE)
    private String cable;

    public String getMlNum() {
        return mlNum;
    }

    public void setMlNum(String mlNum) {
        this.mlNum = mlNum;
    }

    public String getRm12Dc2Out() {
        return rm12Dc2Out;
    }

    public void setRm12Dc2Out(String rm12Dc2Out) {
        this.rm12Dc2Out = rm12Dc2Out;
    }

    public String getDevelopmentChargesPaidMulti() {
        return developmentChargesPaidMulti;
    }

    public void setDevelopmentChargesPaidMulti(String developmentChargesPaidMulti) {
        this.developmentChargesPaidMulti = developmentChargesPaidMulti;
    }

    public BigDecimal getRm2Len() {
        return rm2Len;
    }

    public void setRm2Len(BigDecimal rm2Len) {
        this.rm2Len = rm2Len;
    }

    public String getBsmt1Out() {
        return bsmt1Out;
    }

    public void setBsmt1Out(String bsmt1Out) {
        this.bsmt1Out = bsmt1Out;
    }

    public String getMunicipalityDistrict() {
        return municipalityDistrict;
    }

    public void setMunicipalityDistrict(String municipalityDistrict) {
        this.municipalityDistrict = municipalityDistrict;
    }

    public String getWaterFeat4() {
        return waterFeat4;
    }

    public void setWaterFeat4(String waterFeat4) {
        this.waterFeat4 = waterFeat4;
    }

    public String getBsmt2Out() {
        return bsmt2Out;
    }

    public void setBsmt2Out(String bsmt2Out) {
        this.bsmt2Out = bsmt2Out;
    }

    public String getDenFr() {
        return denFr;
    }

    public void setDenFr(String denFr) {
        this.denFr = denFr;
    }

    public String getRm7Dc3Out() {
        return rm7Dc3Out;
    }

    public void setRm7Dc3Out(String rm7Dc3Out) {
        this.rm7Dc3Out = rm7Dc3Out;
    }

    public String getWaterAccBldg1() {
        return waterAccBldg1;
    }

    public void setWaterAccBldg1(String waterAccBldg1) {
        this.waterAccBldg1 = waterAccBldg1;
    }

    public BigDecimal getRm11Len() {
        return rm11Len;
    }

    public void setRm11Len(BigDecimal rm11Len) {
        this.rm11Len = rm11Len;
    }

    public BigDecimal getAssYear() {
        return assYear;
    }

    public void setAssYear(BigDecimal assYear) {
        this.assYear = assYear;
    }

    public String getAC() {
        return aC;
    }

    public void setAC(String aC) {
        this.aC = aC;
    }

    public BigDecimal getMmapCol() {
        return mmapCol;
    }

    public void setMmapCol(BigDecimal mmapCol) {
        this.mmapCol = mmapCol;
    }

    public String getWclosetT4lvl() {
        return wclosetT4lvl;
    }

    public void setWclosetT4lvl(String wclosetT4lvl) {
        this.wclosetT4lvl = wclosetT4lvl;
    }

    public String getRuralSvc1() {
        return ruralSvc1;
    }

    public void setRuralSvc1(String ruralSvc1) {
        this.ruralSvc1 = ruralSvc1;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getShowingRequirementsMulti() {
        return showingRequirementsMulti;
    }

    public void setShowingRequirementsMulti(String showingRequirementsMulti) {
        this.showingRequirementsMulti = showingRequirementsMulti;
    }

    public String getRuralSvc5() {
        return ruralSvc5;
    }

    public void setRuralSvc5(String ruralSvc5) {
        this.ruralSvc5 = ruralSvc5;
    }

    public String getShorelineExp() {
        return shorelineExp;
    }

    public void setShorelineExp(String shorelineExp) {
        this.shorelineExp = shorelineExp;
    }

    public String getLevel8() {
        return level8;
    }

    public void setLevel8(String level8) {
        this.level8 = level8;
    }

    public String getUffi() {
        return uffi;
    }

    public void setUffi(String uffi) {
        this.uffi = uffi;
    }

    public String getRm2Dc3Out() {
        return rm2Dc3Out;
    }

    public void setRm2Dc3Out(String rm2Dc3Out) {
        this.rm2Dc3Out = rm2Dc3Out;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAccessProp1() {
        return accessProp1;
    }

    public void setAccessProp1(String accessProp1) {
        this.accessProp1 = accessProp1;
    }

    public String getEasementRest1() {
        return easementRest1;
    }

    public void setEasementRest1(String easementRest1) {
        this.easementRest1 = easementRest1;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public BigDecimal getRm6Len() {
        return rm6Len;
    }

    public void setRm6Len(BigDecimal rm6Len) {
        this.rm6Len = rm6Len;
    }

    public String getWclosetT2lvl() {
        return wclosetT2lvl;
    }

    public void setWclosetT2lvl(String wclosetT2lvl) {
        this.wclosetT2lvl = wclosetT2lvl;
    }

    public BigDecimal getRm8Len() {
        return rm8Len;
    }

    public void setRm8Len(BigDecimal rm8Len) {
        this.rm8Len = rm8Len;
    }

    public BigDecimal getTv() {
        return tv;
    }

    public void setTv(BigDecimal tv) {
        this.tv = tv;
    }

    public BigDecimal getRoomsPlus() {
        return roomsPlus;
    }

    public void setRoomsPlus(BigDecimal roomsPlus) {
        this.roomsPlus = roomsPlus;
    }

    public String getRm11Dc1Out() {
        return rm11Dc1Out;
    }

    public void setRm11Dc1Out(String rm11Dc1Out) {
        this.rm11Dc1Out = rm11Dc1Out;
    }

    public String getPixUpdt() {
        return pixUpdt;
    }

    public void setPixUpdt(String pixUpdt) {
        this.pixUpdt = pixUpdt;
    }

    public String getParcelId() {
        return parcelId;
    }

    public void setParcelId(String parcelId) {
        this.parcelId = parcelId;
    }

    public BigDecimal getRm9Wth() {
        return rm9Wth;
    }

    public void setRm9Wth(BigDecimal rm9Wth) {
        this.rm9Wth = rm9Wth;
    }

    public BigDecimal getWclosetT1() {
        return wclosetT1;
    }

    public void setWclosetT1(BigDecimal wclosetT1) {
        this.wclosetT1 = wclosetT1;
    }

    public String getRm2Dc2Out() {
        return rm2Dc2Out;
    }

    public void setRm2Dc2Out(String rm2Dc2Out) {
        this.rm2Dc2Out = rm2Dc2Out;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    public String getWaterFeat1() {
        return waterFeat1;
    }

    public void setWaterFeat1(String waterFeat1) {
        this.waterFeat1 = waterFeat1;
    }

    public String getPropFeat2Out() {
        return propFeat2Out;
    }

    public void setPropFeat2Out(String propFeat2Out) {
        this.propFeat2Out = propFeat2Out;
    }

    public String getSqft() {
        return sqft;
    }

    public void setSqft(String sqft) {
        this.sqft = sqft;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getRm10Dc1Out() {
        return rm10Dc1Out;
    }

    public void setRm10Dc1Out(String rm10Dc1Out) {
        this.rm10Dc1Out = rm10Dc1Out;
    }

    public BigDecimal getWclosetP2() {
        return wclosetP2;
    }

    public void setWclosetP2(BigDecimal wclosetP2) {
        this.wclosetP2 = wclosetP2;
    }

    public BigDecimal getTotParkSpcs() {
        return totParkSpcs;
    }

    public void setTotParkSpcs(BigDecimal totParkSpcs) {
        this.totParkSpcs = totParkSpcs;
    }

    public String getShoreline1() {
        return shoreline1;
    }

    public void setShoreline1(String shoreline1) {
        this.shoreline1 = shoreline1;
    }

    public BigDecimal getWclosetT3() {
        return wclosetT3;
    }

    public void setWclosetT3(BigDecimal wclosetT3) {
        this.wclosetT3 = wclosetT3;
    }

    public String getAllInc() {
        return allInc;
    }

    public void setAllInc(String allInc) {
        this.allInc = allInc;
    }

    public String getOutofArea() {
        return outofArea;
    }

    public void setOutofArea(String outofArea) {
        this.outofArea = outofArea;
    }

    public String getLaundry() {
        return laundry;
    }

    public void setLaundry(String laundry) {
        this.laundry = laundry;
    }

    public String getHeatInc() {
        return heatInc;
    }

    public void setHeatInc(String heatInc) {
        this.heatInc = heatInc;
    }

    public String getTypeOwnSrch() {
        return typeOwnSrch;
    }

    public void setTypeOwnSrch(String typeOwnSrch) {
        this.typeOwnSrch = typeOwnSrch;
    }

    public String getFplNum() {
        return fplNum;
    }

    public void setFplNum(String fplNum) {
        this.fplNum = fplNum;
    }

    public String getLevel7() {
        return level7;
    }

    public void setLevel7(String level7) {
        this.level7 = level7;
    }

    public String getSpecDes6Out() {
        return specDes6Out;
    }

    public void setSpecDes6Out(String specDes6Out) {
        this.specDes6Out = specDes6Out;
    }

    public String getAltPower1() {
        return altPower1;
    }

    public void setAltPower1(String altPower1) {
        this.altPower1 = altPower1;
    }

    public String getRoofMulti() {
        return roofMulti;
    }

    public void setRoofMulti(String roofMulti) {
        this.roofMulti = roofMulti;
    }

    public String getDispAddr() {
        return dispAddr;
    }

    public void setDispAddr(String dispAddr) {
        this.dispAddr = dispAddr;
    }

    public String getPvtEnt() {
        return pvtEnt;
    }

    public void setPvtEnt(String pvtEnt) {
        this.pvtEnt = pvtEnt;
    }

    public String getIdxDt() {
        return idxDt;
    }

    public void setIdxDt(String idxDt) {
        this.idxDt = idxDt;
    }

    public BigDecimal getBathTot() {
        return bathTot;
    }

    public void setBathTot(BigDecimal bathTot) {
        this.bathTot = bathTot;
    }

    public String getRm8Dc3Out() {
        return rm8Dc3Out;
    }

    public void setRm8Dc3Out(String rm8Dc3Out) {
        this.rm8Dc3Out = rm8Dc3Out;
    }

    public String getStDir() {
        return stDir;
    }

    public void setStDir(String stDir) {
        this.stDir = stDir;
    }

    public String getRm10Dc2Out() {
        return rm10Dc2Out;
    }

    public void setRm10Dc2Out(String rm10Dc2Out) {
        this.rm10Dc2Out = rm10Dc2Out;
    }

    public String getRm5Out() {
        return rm5Out;
    }

    public void setRm5Out(String rm5Out) {
        this.rm5Out = rm5Out;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevel9() {
        return level9;
    }

    public void setLevel9(String level9) {
        this.level9 = level9;
    }

    public String getTourUrl() {
        return tourUrl;
    }

    public void setTourUrl(String tourUrl) {
        this.tourUrl = tourUrl;
    }

    public String getFractionalOwnership() {
        return fractionalOwnership;
    }

    public void setFractionalOwnership(String fractionalOwnership) {
        this.fractionalOwnership = fractionalOwnership;
    }

    public BigDecimal getWclosetP3() {
        return wclosetP3;
    }

    public void setWclosetP3(BigDecimal wclosetP3) {
        this.wclosetP3 = wclosetP3;
    }

    public String getZoning() {
        return zoning;
    }

    public void setZoning(String zoning) {
        this.zoning = zoning;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getAccessProp2() {
        return accessProp2;
    }

    public void setAccessProp2(String accessProp2) {
        this.accessProp2 = accessProp2;
    }

    public String getShoreAllow() {
        return shoreAllow;
    }

    public void setShoreAllow(String shoreAllow) {
        this.shoreAllow = shoreAllow;
    }

    public String getLevel6() {
        return level6;
    }

    public void setLevel6(String level6) {
        this.level6 = level6;
    }

    public BigDecimal getRm4Len() {
        return rm4Len;
    }

    public void setRm4Len(BigDecimal rm4Len) {
        this.rm4Len = rm4Len;
    }

    public String getRm9Dc2Out() {
        return rm9Dc2Out;
    }

    public void setRm9Dc2Out(String rm9Dc2Out) {
        this.rm9Dc2Out = rm9Dc2Out;
    }

    public String getCrossSt() {
        return crossSt;
    }

    public void setCrossSt(String crossSt) {
        this.crossSt = crossSt;
    }

    public BigDecimal getRm10Wth() {
        return rm10Wth;
    }

    public void setRm10Wth(BigDecimal rm10Wth) {
        this.rm10Wth = rm10Wth;
    }

    public String getFoundationDetailsMulti() {
        return foundationDetailsMulti;
    }

    public void setFoundationDetailsMulti(String foundationDetailsMulti) {
        this.foundationDetailsMulti = foundationDetailsMulti;
    }

    public String getRm7Dc1Out() {
        return rm7Dc1Out;
    }

    public void setRm7Dc1Out(String rm7Dc1Out) {
        this.rm7Dc1Out = rm7Dc1Out;
    }

    public String getRm3Dc2Out() {
        return rm3Dc2Out;
    }

    public void setRm3Dc2Out(String rm3Dc2Out) {
        this.rm3Dc2Out = rm3Dc2Out;
    }

    public BigDecimal getRm6Wth() {
        return rm6Wth;
    }

    public void setRm6Wth(BigDecimal rm6Wth) {
        this.rm6Wth = rm6Wth;
    }

    public String getRm8Dc2Out() {
        return rm8Dc2Out;
    }

    public void setRm8Dc2Out(String rm8Dc2Out) {
        this.rm8Dc2Out = rm8Dc2Out;
    }

    public BigDecimal getParkChgs() {
        return parkChgs;
    }

    public void setParkChgs(BigDecimal parkChgs) {
        this.parkChgs = parkChgs;
    }

    public String getLevel11() {
        return level11;
    }

    public void setLevel11(String level11) {
        this.level11 = level11;
    }

    public String getRm4Dc2Out() {
        return rm4Dc2Out;
    }

    public void setRm4Dc2Out(String rm4Dc2Out) {
        this.rm4Dc2Out = rm4Dc2Out;
    }

    public String getRm6Dc1Out() {
        return rm6Dc1Out;
    }

    public void setRm6Dc1Out(String rm6Dc1Out) {
        this.rm6Dc1Out = rm6Dc1Out;
    }

    public String getSpecDes1Out() {
        return specDes1Out;
    }

    public void setSpecDes1Out(String specDes1Out) {
        this.specDes1Out = specDes1Out;
    }

    public String getAltPower2() {
        return altPower2;
    }

    public void setAltPower2(String altPower2) {
        this.altPower2 = altPower2;
    }

    public BigDecimal getFireplacesTotal() {
        return fireplacesTotal;
    }

    public void setFireplacesTotal(BigDecimal fireplacesTotal) {
        this.fireplacesTotal = fireplacesTotal;
    }

    public String getDockingTypeMulti() {
        return dockingTypeMulti;
    }

    public void setDockingTypeMulti(String dockingTypeMulti) {
        this.dockingTypeMulti = dockingTypeMulti;
    }

    public String getRm9Out() {
        return rm9Out;
    }

    public void setRm9Out(String rm9Out) {
        this.rm9Out = rm9Out;
    }

    public String getSpecDes2Out() {
        return specDes2Out;
    }

    public void setSpecDes2Out(String specDes2Out) {
        this.specDes2Out = specDes2Out;
    }

    public String getWaterFeat5() {
        return waterFeat5;
    }

    public void setWaterFeat5(String waterFeat5) {
        this.waterFeat5 = waterFeat5;
    }

    public String getEasementRest2() {
        return easementRest2;
    }

    public void setEasementRest2(String easementRest2) {
        this.easementRest2 = easementRest2;
    }

    public String getRm9Dc3Out() {
        return rm9Dc3Out;
    }

    public void setRm9Dc3Out(String rm9Dc3Out) {
        this.rm9Dc3Out = rm9Dc3Out;
    }

    public BigDecimal getRm11Wth() {
        return rm11Wth;
    }

    public void setRm11Wth(BigDecimal rm11Wth) {
        this.rm11Wth = rm11Wth;
    }

    public BigDecimal getRm7Wth() {
        return rm7Wth;
    }

    public void setRm7Wth(BigDecimal rm7Wth) {
        this.rm7Wth = rm7Wth;
    }

    public String getWaterAccBldg2() {
        return waterAccBldg2;
    }

    public void setWaterAccBldg2(String waterAccBldg2) {
        this.waterAccBldg2 = waterAccBldg2;
    }

    public String getRm4Dc1Out() {
        return rm4Dc1Out;
    }

    public void setRm4Dc1Out(String rm4Dc1Out) {
        this.rm4Dc1Out = rm4Dc1Out;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getMmapRow() {
        return mmapRow;
    }

    public void setMmapRow(String mmapRow) {
        this.mmapRow = mmapRow;
    }

    public String getRetirement() {
        return retirement;
    }

    public void setRetirement(String retirement) {
        this.retirement = retirement;
    }

    public String getVtourUpdt() {
        return vtourUpdt;
    }

    public void setVtourUpdt(String vtourUpdt) {
        this.vtourUpdt = vtourUpdt;
    }

    public String getYrBuilt() {
        return yrBuilt;
    }

    public void setYrBuilt(String yrBuilt) {
        this.yrBuilt = yrBuilt;
    }

    public BigDecimal getWclosetT2() {
        return wclosetT2;
    }

    public void setWclosetT2(BigDecimal wclosetT2) {
        this.wclosetT2 = wclosetT2;
    }

    public String getFurnished() {
        return furnished;
    }

    public void setFurnished(String furnished) {
        this.furnished = furnished;
    }

    public String getWaterInc() {
        return waterInc;
    }

    public void setWaterInc(String waterInc) {
        this.waterInc = waterInc;
    }

    public String getSpecDes3Out() {
        return specDes3Out;
    }

    public void setSpecDes3Out(String specDes3Out) {
        this.specDes3Out = specDes3Out;
    }

    public String getSR() {
        return sR;
    }

    public void setSR(String sR) {
        this.sR = sR;
    }

    public String getElevator() {
        return elevator;
    }

    public void setElevator(String elevator) {
        this.elevator = elevator;
    }

    public String getConstr1Out() {
        return constr1Out;
    }

    public void setConstr1Out(String constr1Out) {
        this.constr1Out = constr1Out;
    }

    public String getRm2Out() {
        return rm2Out;
    }

    public void setRm2Out(String rm2Out) {
        this.rm2Out = rm2Out;
    }

    public BigDecimal getWclosetP5() {
        return wclosetP5;
    }

    public void setWclosetP5(BigDecimal wclosetP5) {
        this.wclosetP5 = wclosetP5;
    }

    public String getSpecDes5Out() {
        return specDes5Out;
    }

    public void setSpecDes5Out(String specDes5Out) {
        this.specDes5Out = specDes5Out;
    }

    public String getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode;
    }

    public String getPrkgInc() {
        return prkgInc;
    }

    public void setPrkgInc(String prkgInc) {
        this.prkgInc = prkgInc;
    }

    public String getWclosetT1lvl() {
        return wclosetT1lvl;
    }

    public void setWclosetT1lvl(String wclosetT1lvl) {
        this.wclosetT1lvl = wclosetT1lvl;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public BigDecimal getWclosetP4() {
        return wclosetP4;
    }

    public void setWclosetP4(BigDecimal wclosetP4) {
        this.wclosetP4 = wclosetP4;
    }

    public String getRm1Dc3Out() {
        return rm1Dc3Out;
    }

    public void setRm1Dc3Out(String rm1Dc3Out) {
        this.rm1Dc3Out = rm1Dc3Out;
    }

    public String getPortionPropertyLease4Out() {
        return portionPropertyLease4Out;
    }

    public void setPortionPropertyLease4Out(String portionPropertyLease4Out) {
        this.portionPropertyLease4Out = portionPropertyLease4Out;
    }

    public String getPortionLeaseComments() {
        return portionLeaseComments;
    }

    public void setPortionLeaseComments(String portionLeaseComments) {
        this.portionLeaseComments = portionLeaseComments;
    }

    public String getCentralVac() {
        return centralVac;
    }

    public void setCentralVac(String centralVac) {
        this.centralVac = centralVac;
    }

    public BigDecimal getRm1Len() {
        return rm1Len;
    }

    public void setRm1Len(BigDecimal rm1Len) {
        this.rm1Len = rm1Len;
    }

    public BigDecimal getNumKit() {
        return numKit;
    }

    public void setNumKit(BigDecimal numKit) {
        this.numKit = numKit;
    }

    public BigDecimal getRm12Len() {
        return rm12Len;
    }

    public void setRm12Len(BigDecimal rm12Len) {
        this.rm12Len = rm12Len;
    }

    public String getRm11Dc2Out() {
        return rm11Dc2Out;
    }

    public void setRm11Dc2Out(String rm11Dc2Out) {
        this.rm11Dc2Out = rm11Dc2Out;
    }

    public String getTypeOwn1Out() {
        return typeOwn1Out;
    }

    public void setTypeOwn1Out(String typeOwn1Out) {
        this.typeOwn1Out = typeOwn1Out;
    }

    public BigDecimal getKitPlus() {
        return kitPlus;
    }

    public void setKitPlus(BigDecimal kitPlus) {
        this.kitPlus = kitPlus;
    }

    public String getWaterViewMulti() {
        return waterViewMulti;
    }

    public void setWaterViewMulti(String waterViewMulti) {
        this.waterViewMulti = waterViewMulti;
    }

    public String getRm1Dc2Out() {
        return rm1Dc2Out;
    }

    public void setRm1Dc2Out(String rm1Dc2Out) {
        this.rm1Dc2Out = rm1Dc2Out;
    }

    public String getPortionPropertyLeaseSrch() {
        return portionPropertyLeaseSrch;
    }

    public void setPortionPropertyLeaseSrch(String portionPropertyLeaseSrch) {
        this.portionPropertyLeaseSrch = portionPropertyLeaseSrch;
    }

    public String getEasementRest4() {
        return easementRest4;
    }

    public void setEasementRest4(String easementRest4) {
        this.easementRest4 = easementRest4;
    }

    public String getSpecDes4Out() {
        return specDes4Out;
    }

    public void setSpecDes4Out(String specDes4Out) {
        this.specDes4Out = specDes4Out;
    }

    public String getRm6Out() {
        return rm6Out;
    }

    public void setRm6Out(String rm6Out) {
        this.rm6Out = rm6Out;
    }

    public String getRm9Dc1Out() {
        return rm9Dc1Out;
    }

    public void setRm9Dc1Out(String rm9Dc1Out) {
        this.rm9Dc1Out = rm9Dc1Out;
    }

    public String getRuralSvc3() {
        return ruralSvc3;
    }

    public void setRuralSvc3(String ruralSvc3) {
        this.ruralSvc3 = ruralSvc3;
    }

    public String getRm5Dc3Out() {
        return rm5Dc3Out;
    }

    public void setRm5Dc3Out(String rm5Dc3Out) {
        this.rm5Dc3Out = rm5Dc3Out;
    }

    public BigDecimal getWclosetP1() {
        return wclosetP1;
    }

    public void setWclosetP1(BigDecimal wclosetP1) {
        this.wclosetP1 = wclosetP1;
    }

    public String getLevel4() {
        return level4;
    }

    public void setLevel4(String level4) {
        this.level4 = level4;
    }

    public String getRm11Out() {
        return rm11Out;
    }

    public void setRm11Out(String rm11Out) {
        this.rm11Out = rm11Out;
    }

    public String getLevel12() {
        return level12;
    }

    public void setLevel12(String level12) {
        this.level12 = level12;
    }

    public BigDecimal getBr() {
        return br;
    }

    public void setBr(BigDecimal br) {
        this.br = br;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public String getPropFeat3Out() {
        return propFeat3Out;
    }

    public void setPropFeat3Out(String propFeat3Out) {
        this.propFeat3Out = propFeat3Out;
    }

    public String getWaterFrontYn() {
        return waterFrontYn;
    }

    public void setWaterFrontYn(String waterFrontYn) {
        this.waterFrontYn = waterFrontYn;
    }

    public String getRm3Dc1Out() {
        return rm3Dc1Out;
    }

    public void setRm3Dc1Out(String rm3Dc1Out) {
        this.rm3Dc1Out = rm3Dc1Out;
    }

    public String getRm8Dc1Out() {
        return rm8Dc1Out;
    }

    public void setRm8Dc1Out(String rm8Dc1Out) {
        this.rm8Dc1Out = rm8Dc1Out;
    }

    public String getRm10Out() {
        return rm10Out;
    }

    public void setRm10Out(String rm10Out) {
        this.rm10Out = rm10Out;
    }

    public BigDecimal getRm10Len() {
        return rm10Len;
    }

    public void setRm10Len(BigDecimal rm10Len) {
        this.rm10Len = rm10Len;
    }

    public String getWclosetT5lvl() {
        return wclosetT5lvl;
    }

    public void setWclosetT5lvl(String wclosetT5lvl) {
        this.wclosetT5lvl = wclosetT5lvl;
    }

    public String getRm7Dc2Out() {
        return rm7Dc2Out;
    }

    public void setRm7Dc2Out(String rm7Dc2Out) {
        this.rm7Dc2Out = rm7Dc2Out;
    }

    public BigDecimal getRms() {
        return rms;
    }

    public void setRms(BigDecimal rms) {
        this.rms = rms;
    }

    public String getRm3Dc3Out() {
        return rm3Dc3Out;
    }

    public void setRm3Dc3Out(String rm3Dc3Out) {
        this.rm3Dc3Out = rm3Dc3Out;
    }

    public String getLevel10() {
        return level10;
    }

    public void setLevel10(String level10) {
        this.level10 = level10;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public BigDecimal getRm5Len() {
        return rm5Len;
    }

    public void setRm5Len(BigDecimal rm5Len) {
        this.rm5Len = rm5Len;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getShoreline2() {
        return shoreline2;
    }

    public void setShoreline2(String shoreline2) {
        this.shoreline2 = shoreline2;
    }

    public String getRm6Dc2Out() {
        return rm6Dc2Out;
    }

    public void setRm6Dc2Out(String rm6Dc2Out) {
        this.rm6Dc2Out = rm6Dc2Out;
    }

    public String getStSfx() {
        return stSfx;
    }

    public void setStSfx(String stSfx) {
        this.stSfx = stSfx;
    }

    public BigDecimal getMmapPage() {
        return mmapPage;
    }

    public void setMmapPage(BigDecimal mmapPage) {
        this.mmapPage = mmapPage;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public BigDecimal getParkSpcs() {
        return parkSpcs;
    }

    public void setParkSpcs(BigDecimal parkSpcs) {
        this.parkSpcs = parkSpcs;
    }

    public String getGarType() {
        return garType;
    }

    public void setGarType(String garType) {
        this.garType = garType;
    }

    public String getRltr() {
        return rltr;
    }

    public void setRltr(String rltr) {
        this.rltr = rltr;
    }

    public String getLeaseToOwnEquipmentMulti() {
        return leaseToOwnEquipmentMulti;
    }

    public void setLeaseToOwnEquipmentMulti(String leaseToOwnEquipmentMulti) {
        this.leaseToOwnEquipmentMulti = leaseToOwnEquipmentMulti;
    }

    public String getWaterFeat3() {
        return waterFeat3;
    }

    public void setWaterFeat3(String waterFeat3) {
        this.waterFeat3 = waterFeat3;
    }

    public String getInteriorFeaturesMulti() {
        return interiorFeaturesMulti;
    }

    public void setInteriorFeaturesMulti(String interiorFeaturesMulti) {
        this.interiorFeaturesMulti = interiorFeaturesMulti;
    }

    public String getRm5Dc1Out() {
        return rm5Dc1Out;
    }

    public void setRm5Dc1Out(String rm5Dc1Out) {
        this.rm5Dc1Out = rm5Dc1Out;
    }

    public String getCacInc() {
        return cacInc;
    }

    public void setCacInc(String cacInc) {
        this.cacInc = cacInc;
    }

    public String getRm12Dc1Out() {
        return rm12Dc1Out;
    }

    public void setRm12Dc1Out(String rm12Dc1Out) {
        this.rm12Dc1Out = rm12Dc1Out;
    }

    public String getRm12Out() {
        return rm12Out;
    }

    public void setRm12Out(String rm12Out) {
        this.rm12Out = rm12Out;
    }

    public String getRm3Out() {
        return rm3Out;
    }

    public void setRm3Out(String rm3Out) {
        this.rm3Out = rm3Out;
    }

    public String getSewage1() {
        return sewage1;
    }

    public void setSewage1(String sewage1) {
        this.sewage1 = sewage1;
    }

    public String getComelInc() {
        return comelInc;
    }

    public void setComelInc(String comelInc) {
        this.comelInc = comelInc;
    }

    public String getHeating() {
        return heating;
    }

    public void setHeating(String heating) {
        this.heating = heating;
    }

    public BigDecimal getRm3Wth() {
        return rm3Wth;
    }

    public void setRm3Wth(BigDecimal rm3Wth) {
        this.rm3Wth = rm3Wth;
    }

    public BigDecimal getBrPlus() {
        return brPlus;
    }

    public void setBrPlus(BigDecimal brPlus) {
        this.brPlus = brPlus;
    }

    public String getWclosetT3lvl() {
        return wclosetT3lvl;
    }

    public void setWclosetT3lvl(String wclosetT3lvl) {
        this.wclosetT3lvl = wclosetT3lvl;
    }

    public String getRm11Dc3Out() {
        return rm11Dc3Out;
    }

    public void setRm11Dc3Out(String rm11Dc3Out) {
        this.rm11Dc3Out = rm11Dc3Out;
    }

    public String getPropFeat5Out() {
        return propFeat5Out;
    }

    public void setPropFeat5Out(String propFeat5Out) {
        this.propFeat5Out = propFeat5Out;
    }

    public String getRm12Dc3Out() {
        return rm12Dc3Out;
    }

    public void setRm12Dc3Out(String rm12Dc3Out) {
        this.rm12Dc3Out = rm12Dc3Out;
    }

    public String getLaundryLev() {
        return laundryLev;
    }

    public void setLaundryLev(String laundryLev) {
        this.laundryLev = laundryLev;
    }

    public String getPortionPropertyLease2Out() {
        return portionPropertyLease2Out;
    }

    public void setPortionPropertyLease2Out(String portionPropertyLease2Out) {
        this.portionPropertyLease2Out = portionPropertyLease2Out;
    }

    public String getTopographyMulti() {
        return topographyMulti;
    }

    public void setTopographyMulti(String topographyMulti) {
        this.topographyMulti = topographyMulti;
    }

    public String getSewage2() {
        return sewage2;
    }

    public void setSewage2(String sewage2) {
        this.sewage2 = sewage2;
    }

    public String getRm10Dc3Out() {
        return rm10Dc3Out;
    }

    public void setRm10Dc3Out(String rm10Dc3Out) {
        this.rm10Dc3Out = rm10Dc3Out;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getHydroInc() {
        return hydroInc;
    }

    public void setHydroInc(String hydroInc) {
        this.hydroInc = hydroInc;
    }

    public String getRm1Out() {
        return rm1Out;
    }

    public void setRm1Out(String rm1Out) {
        this.rm1Out = rm1Out;
    }

    public String getOcc() {
        return occ;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public String getShorelineMulti() {
        return shorelineMulti;
    }

    public void setShorelineMulti(String shorelineMulti) {
        this.shorelineMulti = shorelineMulti;
    }

    public String getPropFeat1Out() {
        return propFeat1Out;
    }

    public void setPropFeat1Out(String propFeat1Out) {
        this.propFeat1Out = propFeat1Out;
    }

    public BigDecimal getWclosetT4() {
        return wclosetT4;
    }

    public void setWclosetT4(BigDecimal wclosetT4) {
        this.wclosetT4 = wclosetT4;
    }

    public String getPortionPropertyLease3Out() {
        return portionPropertyLease3Out;
    }

    public void setPortionPropertyLease3Out(String portionPropertyLease3Out) {
        this.portionPropertyLease3Out = portionPropertyLease3Out;
    }

    public String getWaterDelFeat1() {
        return waterDelFeat1;
    }

    public void setWaterDelFeat1(String waterDelFeat1) {
        this.waterDelFeat1 = waterDelFeat1;
    }

    public String getEasementRest3() {
        return easementRest3;
    }

    public void setEasementRest3(String easementRest3) {
        this.easementRest3 = easementRest3;
    }

    public BigDecimal getRm1Wth() {
        return rm1Wth;
    }

    public void setRm1Wth(BigDecimal rm1Wth) {
        this.rm1Wth = rm1Wth;
    }

    public String getAdText() {
        return adText;
    }

    public void setAdText(String adText) {
        this.adText = adText;
    }

    public String getWaterBody() {
        return waterBody;
    }

    public void setWaterBody(String waterBody) {
        this.waterBody = waterBody;
    }

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    public String getStNum() {
        return stNum;
    }

    public void setStNum(String stNum) {
        this.stNum = stNum;
    }

    public BigDecimal getRm7Len() {
        return rm7Len;
    }

    public void setRm7Len(BigDecimal rm7Len) {
        this.rm7Len = rm7Len;
    }

    public String getPropFeat6Out() {
        return propFeat6Out;
    }

    public void setPropFeat6Out(String propFeat6Out) {
        this.propFeat6Out = propFeat6Out;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public BigDecimal getYr() {
        return yr;
    }

    public void setYr(BigDecimal yr) {
        this.yr = yr;
    }

    public BigDecimal getRm12Wth() {
        return rm12Wth;
    }

    public void setRm12Wth(BigDecimal rm12Wth) {
        this.rm12Wth = rm12Wth;
    }

    public BigDecimal getRm4Wth() {
        return rm4Wth;
    }

    public void setRm4Wth(BigDecimal rm4Wth) {
        this.rm4Wth = rm4Wth;
    }

    public String getWaterDelFeat2() {
        return waterDelFeat2;
    }

    public void setWaterDelFeat2(String waterDelFeat2) {
        this.waterDelFeat2 = waterDelFeat2;
    }

    public BigDecimal getRm3Len() {
        return rm3Len;
    }

    public void setRm3Len(BigDecimal rm3Len) {
        this.rm3Len = rm3Len;
    }

    public String getRm8Out() {
        return rm8Out;
    }

    public void setRm8Out(String rm8Out) {
        this.rm8Out = rm8Out;
    }

    public BigDecimal getWaterFront() {
        return waterFront;
    }

    public void setWaterFront(BigDecimal waterFront) {
        this.waterFront = waterFront;
    }

    public String getRm5Dc2Out() {
        return rm5Dc2Out;
    }

    public void setRm5Dc2Out(String rm5Dc2Out) {
        this.rm5Dc2Out = rm5Dc2Out;
    }

    public String getPropFeat4Out() {
        return propFeat4Out;
    }

    public void setPropFeat4Out(String propFeat4Out) {
        this.propFeat4Out = propFeat4Out;
    }

    public String getMunicipalityCode() {
        return municipalityCode;
    }

    public void setMunicipalityCode(String municipalityCode) {
        this.municipalityCode = municipalityCode;
    }

    public String getLevel5() {
        return level5;
    }

    public void setLevel5(String level5) {
        this.level5 = level5;
    }

    public String getRuralSvc2() {
        return ruralSvc2;
    }

    public void setRuralSvc2(String ruralSvc2) {
        this.ruralSvc2 = ruralSvc2;
    }

    public String getRm7Out() {
        return rm7Out;
    }

    public void setRm7Out(String rm7Out) {
        this.rm7Out = rm7Out;
    }

    public String getHstApplicationMulti() {
        return hstApplicationMulti;
    }

    public void setHstApplicationMulti(String hstApplicationMulti) {
        this.hstApplicationMulti = hstApplicationMulti;
    }

    public String getRm6Dc3Out() {
        return rm6Dc3Out;
    }

    public void setRm6Dc3Out(String rm6Dc3Out) {
        this.rm6Dc3Out = rm6Dc3Out;
    }

    public BigDecimal getRm9Len() {
        return rm9Len;
    }

    public void setRm9Len(BigDecimal rm9Len) {
        this.rm9Len = rm9Len;
    }

    public String getRm2Dc1Out() {
        return rm2Dc1Out;
    }

    public void setRm2Dc1Out(String rm2Dc1Out) {
        this.rm2Dc1Out = rm2Dc1Out;
    }

    public String getFireplaceFeaturesMulti() {
        return fireplaceFeaturesMulti;
    }

    public void setFireplaceFeaturesMulti(String fireplaceFeaturesMulti) {
        this.fireplaceFeaturesMulti = fireplaceFeaturesMulti;
    }

    public String getWaterFeat2() {
        return waterFeat2;
    }

    public void setWaterFeat2(String waterFeat2) {
        this.waterFeat2 = waterFeat2;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public BigDecimal getRm8Wth() {
        return rm8Wth;
    }

    public void setRm8Wth(BigDecimal rm8Wth) {
        this.rm8Wth = rm8Wth;
    }

    public BigDecimal getWclosetT5() {
        return wclosetT5;
    }

    public void setWclosetT5(BigDecimal wclosetT5) {
        this.wclosetT5 = wclosetT5;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getRm1Dc1Out() {
        return rm1Dc1Out;
    }

    public void setRm1Dc1Out(String rm1Dc1Out) {
        this.rm1Dc1Out = rm1Dc1Out;
    }

    public String getPortionPropertyLease1Out() {
        return portionPropertyLease1Out;
    }

    public void setPortionPropertyLease1Out(String portionPropertyLease1Out) {
        this.portionPropertyLease1Out = portionPropertyLease1Out;
    }

    public BigDecimal getLpDol() {
        return lpDol;
    }

    public void setLpDol(BigDecimal lpDol) {
        this.lpDol = lpDol;
    }

    public String getConstr2Out() {
        return constr2Out;
    }

    public void setConstr2Out(String constr2Out) {
        this.constr2Out = constr2Out;
    }

    public BigDecimal getRm2Wth() {
        return rm2Wth;
    }

    public void setRm2Wth(BigDecimal rm2Wth) {
        this.rm2Wth = rm2Wth;
    }

    public String getRm4Dc3Out() {
        return rm4Dc3Out;
    }

    public void setRm4Dc3Out(String rm4Dc3Out) {
        this.rm4Dc3Out = rm4Dc3Out;
    }

    public String getRm4Out() {
        return rm4Out;
    }

    public void setRm4Out(String rm4Out) {
        this.rm4Out = rm4Out;
    }

    public BigDecimal getRm5Wth() {
        return rm5Wth;
    }

    public void setRm5Wth(BigDecimal rm5Wth) {
        this.rm5Wth = rm5Wth;
    }

    public String getRuralSvc4() {
        return ruralSvc4;
    }

    public void setRuralSvc4(String ruralSvc4) {
        this.ruralSvc4 = ruralSvc4;
    }

    public String getTimestampSql() {
        return timestampSql;
    }

    public void setTimestampSql(String timestampSql) {
        this.timestampSql = timestampSql;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Short getNumberOfPhotos() {
        return numberOfPhotos;
    }

    public void setNumberOfPhotos(short numberOfPhotos) {
        this.numberOfPhotos = numberOfPhotos;
    }
}