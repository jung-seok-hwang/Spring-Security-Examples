package cloud.studyspringsecurity.auth.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;


@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class OAuth2ProviderTypes implements ProviderTypes {

    private Map<String , Object> attributes;
    private OAuth2User oAuth2User;
    private ClientRegistration clientRegistration;

    @Override
    public String getPassword() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String getProviderType() {
        return clientRegistration.getRegistrationId();

    }
    @Override
    public String getEmail() {
        return (String)attributes.get("email");
    }

    @Override
    public List<? extends GrantedAuthority> getAuthorities() {
        return oAuth2User.getAuthorities().stream().map(authority -> new SimpleGrantedAuthority(authority.getAuthority())).collect(Collectors.toList());

    }

}
