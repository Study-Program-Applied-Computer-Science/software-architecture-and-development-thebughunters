package com.pramukh.paymentservice.Controller;

import com.pramukh.paymentservice.DTO.PaymentRequestDto;
import com.pramukh.paymentservice.DTO.PaymentResponseDto;
import com.pramukh.paymentservice.Service.StripeService;
import com.stripe.exception.StripeException;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
@Tag(name = "Payment API's")
public class PaymentController {

    @Autowired
    private StripeService stripeService;

    @PostMapping("/payment")
    @RateLimiter(name = "paymentRateLimiter")
    @Operation(summary = "Make payment")
    public ResponseEntity<PaymentResponseDto> makePayment(@RequestBody PaymentRequestDto paymentRequestDto) throws StripeException {
        System.out.println("Payment triggeredd");
        PaymentResponseDto paymentResponseDto = stripeService.makepayment(paymentRequestDto);
        return ResponseEntity.ok(paymentResponseDto);
    }
}
