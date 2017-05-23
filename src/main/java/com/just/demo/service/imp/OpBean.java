package com.just.demo.service.imp;

import com.just.demo.service.local.OpLocal;

/**
 * Created by flyhigh on 2017/5/21.
 */
public class OpBean implements OpLocal{

    public void upateRecord(int sqlid) {
        System.out.println(" update Record>>" + sqlid);
    }

}
