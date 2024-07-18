package cloud.studyspringsecurity.member.entity;


import lombok.Getter;

@Getter
public enum MemberRole {

    MEMBER("MEMBER"),
    
    ADMIN("ADMIN"),

    MANAGER("MANAGER");

    private final String role;

    MemberRole(String role) {
        this.role = role;
    }
}
