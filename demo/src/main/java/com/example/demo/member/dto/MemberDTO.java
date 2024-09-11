package com.example.demo.member.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDTO {
	
    String memberNo;

    String memberPwd;

    String memEmail;

    String memberName;
    
    int memberPhone;
    
    String address;
    
    String detailAddress;
    
    String postalCode;
    
    String detailNote;
    
    String role;

    String provider;

    LocalDateTime regDate;

    LocalDateTime modDate;
    
    boolean memberUse;

}
