package cloud.studyspringsecurity.auth.type;

import cloud.studyspringsecurity.auth.model.OAuth2ProviderTypes;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Map;

public class NaverType extends OAuth2ProviderTypes {

    public NaverType(OAuth2User oAuth2User, ClientRegistration clientRegistration) {
        super(oAuth2User.getAttributes() , oAuth2User, clientRegistration);
    }

    @Override
    public String getId() {
        return (String) getAttributes().get("id");
    }

    @Override
    public String getName() {
        return (String) getAttributes().get("email");
    }
}
