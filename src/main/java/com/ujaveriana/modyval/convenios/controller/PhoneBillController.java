package com.ujaveriana.modyval.convenios.controller;

import com.ujaveriana.modyval.convenios.model.Bill;
import com.ujaveriana.modyval.convenios.model.Result;
import com.ujaveriana.modyval.convenios.service.BillService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@Api(value = "PhoneBillsController")
@RestController
@RequestMapping("/phoneBills")
public class PhoneBillController {

	private final BillService billService;

	public PhoneBillController(BillService billService)
	{
		this.billService = billService;
	}

	@ApiOperation(value = "Get bill info of Phone Service in the System ", response = Bill.class, tags = "getBillInfo")
	@GetMapping("{id}")
	public Bill getBillInfo(@PathVariable("id") int id) {
		return billService.getBillInfo(id);
	}

	@ApiOperation(value = "Pay bill of Phone Service in the System ", response = Result.class, tags = "payBill")
	@PostMapping("{id}")
	public Result payBill(@PathVariable("id") int id, @RequestBody  (required=false) Bill bill) {
		return billService.payBill(id, bill);
	}
}
