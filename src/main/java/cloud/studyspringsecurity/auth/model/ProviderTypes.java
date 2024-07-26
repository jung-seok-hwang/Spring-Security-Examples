package cloud.studyspringsecurity.auth.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;
import java.util.Map;

public interface ProviderTypes {

    String getId();

    String getName();

    String getPassword();

    String getEmail();

    String getProviderType();

    List<? extends GrantedAuthority> getAuthorities();

    Map<String, Object> getAttributes();
}
