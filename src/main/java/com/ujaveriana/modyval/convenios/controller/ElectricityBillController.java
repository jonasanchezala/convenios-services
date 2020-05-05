package com.ujaveriana.modyval.convenios.controller;

import com.ujaveriana.modyval.convenios.model.Bill;
import com.ujaveriana.modyval.convenios.model.Result;
import com.ujaveriana.modyval.convenios.service.BillService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value = "ElectricityBillsController")
@RestController
@RequestMapping("/electricityBills")
public class ElectricityBillController {

	private final BillService billService;

	public ElectricityBillController(BillService billService)
	{
		this.billService = billService;

	}

	@ApiOperation(value = "Get bill info of Electricity Service in the System ", response = Bill.class, tags = "getBillInfo")
	@GetMapping("{id}")
	public Bill getBillInfo(@PathVariable("id") int id) {
		return billService.getBillInfo(id);
	}

	@ApiOperation(value = "Pay bill of Electricity Service in the System ", response = Result.class, tags = "payBill")
	@PostMapping("{id}")
	public Result payBill(@PathVariable("id") int id, @RequestBody (required=false) Bill bill) {
		return billService.payBill(id, bill);
	}
}
