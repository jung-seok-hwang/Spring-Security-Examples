package cloud.studyspringsecurity.auth.type;

import cloud.studyspringsecurity.auth.model.OAuth2ProviderTypes;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Map;

public class KeyCloakType extends OAuth2ProviderTypes {

    public KeyCloakType(OAuth2User oAuth2User, ClientRegistration clientRegistration) {
        super(oAuth2User.getAttributes(), oAuth2User, clientRegistration);
    }

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }

}
