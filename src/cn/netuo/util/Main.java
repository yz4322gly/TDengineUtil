package cn.netuo.util;

import java.util.Date;
import java.util.List;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        TDengineUtil util = new TDengineUtil("jdbc:TAOS://127.0.0.1:6020/netuo_iot","root","taosdata",true);

        util.insert("v1_001",new cn.netuo.util.IotReceiptUploadDataEntity(new Date(),null,"33.3",true,"12","1234",12,"22.3","30","14",new Date()));
        util.insertWithStable("a1_001","netuo_device",new cn.netuo.util.IotReceiptUploadDataEntity(new Date(),null,"33.3",true,"12","1234",12,"22.3","30","14",new Date()),"样子将中路","ce","1");


        List<IotReceiptUploadDataEntity> list = util.getList("select * from  v1_001",IotReceiptUploadDataEntity.class);
        System.out.println(list);
    }
}
