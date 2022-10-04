package com.billing.invoice.controllers;

import com.billing.invoice.entity.Bill;
import com.billing.invoice.services.BillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillController {
    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("/add")
    public Bill addBill(@RequestBody Bill bill){
        return billService.addBill(bill);
    }

    @GetMapping("getAllFalse")
    public ResponseEntity<List<Bill>> getAllBillsPaymentFalse(@RequestParam("userId") Long userId) {
        return ResponseEntity.ok(billService.findAllFalse(userId));
    }
    @DeleteMapping("/delete/{billId}")
    public ResponseEntity deleteBill(@PathVariable Long billId){
        billService.deleteBill(billId);
        return ResponseEntity.ok("Silindi : " + billId);
    }

    @GetMapping("/unpaid")
    public List<Bill> getUnpaid(@RequestParam("userId") Long userId){
        return billService.unpaid(userId);
    }

    @GetMapping("/getAll")
    public List<Bill> getAllBill(){
        return billService.getAllBill();
    }

    @GetMapping("/getBillOwnUser")
    public List<Bill> getBillOwnUser(@RequestParam("userId") Long userId){
        return billService.getBillOwnUser(userId);
    }}
