package br.com.pipocaagil.apipipocaagil.payments.interfaces;

import br.com.pipocaagil.apipipocaagil.payments.representations.OrderRepresentation;

public interface PaymentService {

    Object createPayment(OrderRepresentation order);
}
