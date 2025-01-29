package com.pramukh.paymentservice.GlobalExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

        @ExceptionHandler(PaymentFailureException.class)
        public ResponseEntity<String> handleProductNotFoundException(PaymentFailureException e) {
            return new  ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }


