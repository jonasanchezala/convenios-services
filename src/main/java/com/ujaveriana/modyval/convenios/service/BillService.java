package com.ujaveriana.modyval.convenios.service;

import com.ujaveriana.modyval.convenios.model.Bill;
import com.ujaveriana.modyval.convenios.model.Result;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class BillService {


    public Bill getBillInfo(int id) {
        return new Bill(id, new Random().nextDouble() * 100000);
    }

    public Result payBill(int id, Bill bill) {
        return new Result(id, "Factura Pagada Exitosamente");
    }
}
