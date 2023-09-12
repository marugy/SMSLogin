package com.marugy.app.domain.Member.Api;

import static com.marugy.app.global.api.ApiResponse.OK;

import com.marugy.app.domain.Member.Dto.request.JoinRequest;
import com.marugy.app.domain.Member.Dto.request.LoginRequest;
import com.marugy.app.domain.Member.Dto.request.SimpleLoginRequest;
import com.marugy.app.global.api.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/member-management/members")
@Slf4j
public class MemberApi {

    @PostMapping("/join")
    public ApiResponse<?> join(@RequestBody JoinRequest joinRequest){
        return OK(null);
    }

    @PostMapping("/login")
    public ApiResponse<?> login(@RequestBody LoginRequest loginRequest){
        return OK(null);
    }
    @PostMapping("/simple-login")
    public ApiResponse<?> simpleLogin(@RequestBody SimpleLoginRequest simpleLoginRequest){
        return OK(null);
    }
    @GetMapping("/info")
    public ApiResponse<?> getMemberInfoById(){
        return OK(null);
    }
    @PostMapping("/info")
    public ApiResponse<?> modifyMemberInfoById(){
        return OK(null);
    }
    @PutMapping("/password")
    public ApiResponse<?> modifyPasswordById(){
        return OK(null);
    }
    @PutMapping("/simple-password")
    public ApiResponse<?> modifySimplePasswordById(){
        return OK(null);
    }
    @GetMapping("/saving")
    public ApiResponse<?> getSavingInfo(){
        return OK(null);
    }
    @DeleteMapping()
    public ApiResponse<?> deleteMemberById(){
        return OK(null);
    }
}
