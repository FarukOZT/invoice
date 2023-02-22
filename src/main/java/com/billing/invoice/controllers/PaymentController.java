package com.billing.invoice.controllers;

import com.billing.invoice.entity.Payment;
import com.billing.invoice.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    /*@PostMapping("paybil")
    public Payment makeAllPayment2(@RequestParam("userId") Long userId){
        return paymentService.makePayment2(userId);
    }
*/
    @PostMapping("paybill")
    public Payment makeAllPayment3(@RequestParam("userId") Long userId,
                                   @RequestParam("billId") Long billId,
                                   @RequestParam("walletId") Long walletId) {
        return paymentService.makePayment(userId, billId, walletId);
    }

}
