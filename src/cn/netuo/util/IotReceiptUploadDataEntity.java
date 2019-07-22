package cn.netuo.util;

import java.util.Date;

/**
 * @author guolinyuan
 */
public class IotReceiptUploadDataEntity
{

    /**
     * lng : 经纬度
     * lat : 经纬度
     * isCharging : 电池是否在充电
     * battery : 电池电量
     * workingTime : 连续开机时间
     * ei : 业务电流(A)
     * ep : 业务功率(W)
     * tmp : 温度
     * humidity : 湿度
     * downtime : 上次停机时间,时间戳,精确到毫秒的（本文时间戳均为精确到毫秒的）
     */
    private Date ts;
    private String lng;
    private String lat;
    private Boolean isCharging;
    private String battery;
    private String workingTime;
    private Integer ei;
    private String ep;
    private String tmp;
    private String humidity;
    private Date downtime;

    public IotReceiptUploadDataEntity()
    {
    }

    public IotReceiptUploadDataEntity(Date ts, String lng, String lat, Boolean isCharging, String battery, String workingTime, Integer ei, String ep, String tmp, String humidity, Date downtime)
    {
        this.ts = ts;
        this.lng = lng;
        this.lat = lat;
        this.isCharging = isCharging;
        this.battery = battery;
        this.workingTime = workingTime;
        this.ei = ei;
        this.ep = ep;
        this.tmp = tmp;
        this.humidity = humidity;
        this.downtime = downtime;
    }

    public void setEi(Integer ei)
    {
        this.ei = ei;
    }

    public Date getTs()
    {
        return ts;
    }

    public void setTs(Date ts)
    {
        this.ts = ts;
    }

    public String getLng()
    {
        return lng;
    }

    public void setLng(String lng)
    {
        this.lng = lng;
    }

    public String getLat()
    {
        return lat;
    }

    public void setLat(String lat)
    {
        this.lat = lat;
    }

    public Boolean getIsCharging()
    {
        return isCharging;
    }

    public void setIsCharging(Boolean isCharging)
    {
        this.isCharging = isCharging;
    }

    public String getBattery()
    {
        return battery;
    }

    public void setBattery(String battery)
    {
        this.battery = battery;
    }

    public String getWorkingTime()
    {
        return workingTime;
    }

    public void setWorkingTime(String workingTime)
    {
        this.workingTime = workingTime;
    }


    public String getEp()
    {
        return ep;
    }

    public void setEp(String ep)
    {
        this.ep = ep;
    }

    public String getTmp()
    {
        return tmp;
    }

    public void setTmp(String tmp)
    {
        this.tmp = tmp;
    }

    public String getHumidity()
    {
        return humidity;
    }

    public void setHumidity(String humidity)
    {
        this.humidity = humidity;
    }

    public Date getDowntime()
    {
        return downtime;
    }

    public void setDowntime(Date downtime)
    {
        this.downtime = downtime;
    }

    @Override
    public String toString()
    {
        return "cn.netuo.util.IotReceiptUploadDataEntity{" +
                "ts=" + ts +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                ", isCharging='" + isCharging + '\'' +
                ", battery='" + battery + '\'' +
                ", workingTime='" + workingTime + '\'' +
                ", ei='" + ei + '\'' +
                ", ep='" + ep + '\'' +
                ", tmp='" + tmp + '\'' +
                ", humidity='" + humidity + '\'' +
                ", downtime='" + downtime + '\'' +
                '}';
    }
}
