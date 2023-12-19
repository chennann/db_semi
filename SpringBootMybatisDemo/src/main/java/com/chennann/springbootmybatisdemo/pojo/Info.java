package com.chennann.springbootmybatisdemo.pojo;

public class Info {

    Integer id;
    String xh;
    String kh;
    Integer cj;


    public Info() {
    }

    public Info(String xh, String kh, Integer cj) {
        this.xh = xh;
        this.kh = kh;
        this.cj = cj;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return xh
     */
    public String getXh() {
        return xh;
    }

    /**
     * 设置
     * @param xh
     */
    public void setXh(String xh) {
        this.xh = xh;
    }

    /**
     * 获取
     * @return kh
     */
    public String getKh() {
        return kh;
    }

    /**
     * 设置
     * @param kh
     */
    public void setKh(String kh) {
        this.kh = kh;
    }

    /**
     * 获取
     * @return cj
     */
    public Integer getCj() {
        return cj;
    }

    /**
     * 设置
     * @param cj
     */
    public void setCj(Integer cj) {
        this.cj = cj;
    }

    public String toString() {
        return "Info{id = " + id + ", xh = " + xh + ", kh = " + kh + ", cj = " + cj + "}";
    }
}
