package br.com.pipocaagil.apipipocaagil.services.interfaces;

import br.com.pipocaagil.apipipocaagil.domain.enums.UserPermissionType;
import br.com.pipocaagil.apipipocaagil.domain.representations.UserLoginRepresentation;

public interface UsersSignatureService {

    void signatureToUser(UserLoginRepresentation userLoginRepresentation, UserPermissionType role);
}