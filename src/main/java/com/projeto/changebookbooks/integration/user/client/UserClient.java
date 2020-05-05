package com.projeto.changebookbooks.integration.user.client;

import com.projeto.changebookbooks.integration.user.response.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rx.Observable;

@FeignClient(name = "user", url = "${user.url}")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/token/valid")
    Observable<String> validateToken(@RequestHeader("Authorization") String token);

    @RequestMapping(method = RequestMethod.GET, value = "/user/by_token")
    Observable<UserResponse> getUserByToken(@RequestHeader("Authorization") String token);
}
