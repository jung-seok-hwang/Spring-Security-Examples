package cloud.studyspringsecurity.member.enumeration;


import lombok.Getter;

@Getter
public enum MemberRole {

    MEMBER("MEMBER"),
    
    ADMIN("ADMIN"),

    MANAGER("MANAGER"),

    GOOGLE("GOOGLE"),

    KAKAO("KAKAO"),

    NAVER("NAVER");

    private final String role;

    MemberRole(String role) {
        this.role = role;
    }
}
