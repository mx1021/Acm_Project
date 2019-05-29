package com11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.fh.service.personmanager.UserBasicManager;
import com.fh.service.personmanager.UserVo;
import com.fh.service.personmanager.impl.UserBasicServiceService;

public class TestJieKou
{
    public static void main(String[] args) throws Exception {
        String uuu0 = "91340300711790416H";
        String uuu1 = "912106006704552585";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println("MX1:" + sdf.format(new Date()));
        UserBasicManager m = new UserBasicServiceService().getUserBasicServicePort();

        System.out.println("MX2:" + sdf.format(new Date()));
        List<UserVo> listByUnitCode = m.listByUnitCode(uuu0);

        System.out.println("MX3:" + sdf.format(new Date()));
        System.out.println(listByUnitCode.size());
    }
}
